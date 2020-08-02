package Buoi_7;

import java.io.*;
import java.util.Scanner;

public class B3 {

    // kiem tra file co object hay khong
    public static boolean hasObject(File f) {
        // thu doc xem co object nao chua
        FileInputStream fi;
        boolean check = true;
        try {
            fi = new FileInputStream(f);
            ObjectInputStream in = new ObjectInputStream(fi);
            if (in.readObject() == null) {
                check = false;
            }
            in.close();

        } catch (FileNotFoundException e) {
            check = false;
        } catch (IOException e) {
            check = false;
        } catch (ClassNotFoundException e) {
            check = false;
            e.printStackTrace();
        }
        return check;
    }

    public static void write(User s) {
        try {

            File f = new File("user.txt");
            FileOutputStream fo;
            ObjectOutputStream out;

            // neu file chua ton tai thi tao file va ghi binh thuong
            if (!f.exists()) {
                fo = new FileOutputStream(f);
                out = new ObjectOutputStream(fo);
            } else { // neu file ton tai

                // neu chua co thi ghi binh thuong
                if (!hasObject(f)) {
                    fo = new FileOutputStream(f);
                    out = new ObjectOutputStream(fo);
                } else { // neu co roi thi ghi them vao

                    fo = new FileOutputStream(f, true);

                    out = new ObjectOutputStream(fo) {
                        protected void writeStreamHeader() throws IOException {
                            reset();
                        }
                    };
                }
            }

            out.writeObject(s);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try {
            File f = new File("user.txt");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream inStream = new ObjectInputStream(fis);
            Object s;
            int i = 0;
            while (true) {
                s = inStream.readObject();
                System.out.println(++i + ":" + s.toString());
            }
        } catch (ClassNotFoundException e) {
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {

        int soluong;
        System.out.print("So luong user: ");
        Scanner scan = new Scanner(System.in);
        soluong = scan.nextInt();

        User list[] = new User[soluong];

        for (int i = 0; i < soluong; i++) {
            User s = new User();
            System.out.println("username, age, address, score " + (i+1) + ": ");
            s.Nhap(s);
            list[i] = s;
            write(s);
        }

        double sumScore = 0;
        for (int i = 0; i < soluong; i++) {
            sumScore += list[i].getScore();
        }

        // doc file
        read();

        System.out.println("SumScore: " + sumScore);


    }
}

class User implements Serializable {
    String name;
    int age;
    String address;
    double score;


    public void Nhap(User user) {
        Scanner n1 = new Scanner(System.in);
        this.name = n1.nextLine();
        Scanner n2 = new Scanner(System.in);
        this.age = n2.nextInt();
        Scanner n3 = new Scanner(System.in);
        this.address = n3.nextLine();
        Scanner n4 = new Scanner(System.in);
        this.score = n4.nextDouble();
    }
    public double getScore() {
        return score;
    }


    public String toString() {
        return "User [username=" + name + ", age=" + age + ", address=" + address + ", score=" + score +"]";
    }
}
