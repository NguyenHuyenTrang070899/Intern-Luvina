package Buoi_10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1  implements Comparable<Student1> // cai lại method compareTo
{   private String code;
    private String name;
    private Integer score;

    public Student1(String code, String name, Integer score) {
        this.code = code;
        this.score = score;
        this.name = name;
    }

    public String toString() {
        return "(" + code + "," + name + "," + score + ")";
    }

    public int compareTo(Student1 other) {
        int i1 = this.code.compareTo(other.code);
        if (i1!=0) return i1;
        int i2 = this.name.compareTo(other.name);
        if (i2!=0) return i2;
        int i3 = this.score.compareTo(other.score);
        return i3;
    }
}

public class Sort3 {
    public static void main(String[] args)  {
        List<Student1> lst1 = new ArrayList<Student1>();// sx theo ten
        lst1.add(new Student1("A05726","AA", 8));
        lst1.add(new Student1("A07123","AA",1));
        lst1.add(new Student1("A06338","AC", 7));
        lst1.add(new Student1("A05726","AA",5));
        lst1.add(new Student1("A05726","AB1", 7));
        lst1.add(new Student1("A06178", "AC",9));
        lst1.add(new Student1("A07123","AC",2));
        System.out.println(lst1);
        Collections.sort(lst1);// Sort by name
        System.out.println("Sap xep theo thu tu: code, name, score");
        System.out.println(lst1); //in ra list đã sắp xếp


    }
}
