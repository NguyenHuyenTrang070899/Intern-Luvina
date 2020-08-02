package BTVN_B6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User implements Serializable {
    private String username;
    private int age;
    private String address;
    private double score;

    public void Nhap(User user) {
        Scanner n1 = new Scanner(System.in);
        this.username = n1.nextLine();
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

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", age=" + age + ", address=" + address + ", score=" + score + '}';
    }

    /////////////main///
    public static void main(String[] args) throws IOException {
        FileOutputStream out = null;
        ObjectOutputStream objectOutputStream = null;
        FileInputStream input = null;
        ObjectInputStream inputStream = null;
        List<User> list = new ArrayList<>();
        int n, sumScore = 0;
        System.out.print("Nhap so luong user: ");
        Scanner soluong = new Scanner(System.in);
        n = soluong.nextInt();
        for (int i = 1; i <= n; i++) {
            User s = new User();
            System.out.println("Name, age, add, score User " + i + ": ");
            s.Nhap(s);
            list.add(s);
        }
// ghi file
        try {
            out = new FileOutputStream("U.obj");
            objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(list);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (out != null) out.close();
            if (objectOutputStream != null) objectOutputStream.close();
        }
// doc file
        try {
            input = new FileInputStream("U.obj");
            inputStream = new ObjectInputStream(input);
            list = (List<User>) inputStream.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (input != null) input.close();
            if (inputStream != null) inputStream.close();
        }
        for (int i = 0; i < n; i++) {
            sumScore += list.get(i).getScore();
            System.out.println(list.get(i).toString());
        }
        System.out.println("SumScore: " + sumScore);
    }
}
