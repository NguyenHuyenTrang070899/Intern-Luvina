package Buoi_14;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerMultiClient {
    public static void main() throws IOException {
        ServerSocket server;
        Socket socket;
        server = new ServerSocket(8000);
        // phuc vu nhieu client
        while (true) {
            socket = server.accept();
            ForMultiClient forClient = new ForMultiClient(socket);
            forClient.start();
        }
    }
}
class ForMultiClient extends Thread {
    Socket socket;
    public ForMultiClient (Socket socket){
        this.socket = socket;
    }
    public void run() {
        DataInputStream in;
        DataOutputStream out;
        try {
            // Tao ra cac luong dua tren socket;
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            double a = in.readDouble();
            System.out.println(a);
            out.writeDouble(a*a*Math.PI);
        } catch (IOException ex) {
            Logger.getLogger(ForMultiClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Client{
    public static void main(String arg[]){
        try{
            //  Tạo ra một socket để kết nối với socket server
            Socket connectToServer = new Socket("localhost", 8000);
            //  Tạo ra một luồng vào để nhận dữ liệu từ server
            DataInputStream isFromServer = new DataInputStream(connectToServer.getInputStream());
            //  Tạo ra một luồng ra để gửi dữ liệu đến server
            DataOutputStream osToServer = new DataOutputStream(connectToServer.getOutputStream());
            //  Tạo ra một luồng vào để nhập dữ liệu từ bàn phím
            DataInputStream str = new DataInputStream(System.in);
            //  Liên tục gửi dữ liệu nhập vào từ bàn phím cho server và nhận lại diện tích
            while(true){
                // Nhập bán kính từ bàn phím
                System.out.print("Hay cho biet ban kinh: ");
                double radius = Double.parseDouble(str.readLine());
                // Gửi dữ liệu cho server
                osToServer.writeDouble(radius);
                osToServer.flush();
                // Nhận lại kết quả từ server
                double area = isFromServer.readDouble();
                System.out.println("Dien tich hinh tron nhan duoc tu Server: " + area);
            }
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}

class UDPServer {
    public static void main(String args[]) throws Exception
    {
        try
        {
            DatagramSocket serverSocket = new DatagramSocket(9879);
            byte[] receiveData = new byte[1024];
            byte[] sendData  = new byte[1024];
            while(true)
            {
                receiveData = new byte[1024];
                DatagramPacket receivePacket =
                        new DatagramPacket(receiveData, receiveData.length);
                System.out.println ("Waiting for datagram packet");
                serverSocket.receive(receivePacket);
                String sentence = new String(receivePacket.getData(),0,receivePacket.getLength());
                InetAddress IPAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();
                System.out.println ("From: " + IPAddress + ":" + port);
                System.out.println ("Message: " + sentence);
                // Chuyen thanh chu hoa gui lai Client
                String capitalizedSentence = sentence.toUpperCase();
                sendData = capitalizedSentence.getBytes();
                DatagramPacket sendPacket =
                        new DatagramPacket(sendData, sentence.length(), IPAddress,
                                port);
                serverSocket.send(sendPacket);
            }
        }
        catch (SocketException ex) {
            System.out.println("UDP Port 9876 is occupied.");
            System.exit(1);
        }
    }
}

class UDPClient {
    public static void main(String args[]) throws Exception
    {
        try {
            String serverHostname = new String ("127.0.0.1");
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress IPAddress = InetAddress.getByName(serverHostname);
            System.out.println ("Attemping to connect to " + IPAddress +") via UDP port 9876");
            byte[] sendData;// = new byte[1024];
            byte[] receiveData = new byte[1024];
            System.out.print("Enter Message: ");
            String sentence = inFromUser.readLine();
            System.out.println(sentence);
            sendData = sentence.getBytes();
            System.out.println ("Sending data to " + sendData.length +
                    " bytes to server.");
            DatagramPacket sendPacket =
                    new DatagramPacket(sendData, sendData.length, IPAddress, 9879);
            clientSocket.send(sendPacket);
            // Cho de nhan lai tu Server
            DatagramPacket receivePacket =
                    new DatagramPacket(receiveData, receiveData.length);
            System.out.println ("Waiting for return packet");
            clientSocket.setSoTimeout(10000);
            try {
                clientSocket.receive(receivePacket);
                String modifiedSentence =
                        new String(receivePacket.getData(),0,receivePacket.getLength());
                InetAddress returnIPAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();
                System.out.println ("From server at: " + returnIPAddress +
                        ":" + port);
                System.out.println("Message: " + modifiedSentence);
            }
            catch (SocketTimeoutException ste)
            {
                System.out.println ("Timeout Occurred: Packet assumed lost");
            }
            clientSocket.close();
        }
        catch (UnknownHostException ex) {
            System.err.println(ex);
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
