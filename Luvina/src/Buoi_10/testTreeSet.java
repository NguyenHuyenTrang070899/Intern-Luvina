package Buoi_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class Student2 implements Comparable<Student2>
{
    public String code;
    private String name;
    public Integer score;

    public Student2(String code, String name, Integer score) {
        this.code = code;
        this.score = score;
        this.name = name;
    }
    public Integer getScore() {
        return score;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "(Ma SV: " + code + ", Ho ten:" + name + ", Diem TBL " + score + ")";
    }

    public int compareTo(Student2 other) {
        return code.compareTo(other.code);
    }
}


public class testTreeSet{
    public static void main(String[] args)  {
        // Sap xep theo nhu khi xay dung lop Student (theo code)
        Set<Student2> stu = new TreeSet<>();
        stu.add(new Student2("A05726-1","AA", 8));
        stu.add(new Student2("A06338","AB", 7));
        stu.add(new Student2("A05379", "AC",6));
        stu.add(new Student2("A05726-2", "AD",9));
        System.out.println("Sorted by code\n"+ stu);
        Student2 st1=new Student2("A06338","AD", 6); // code, name, score
        boolean kt = stu.contains(st1);// tim kiem tren cay
        if (kt)
            System.out.println("Found by code");
        else
            System.out.println("Not Found by code");
        SortedSet<Student2> sortByScore = new TreeSet<Student2>(new Comparator<Student2>()
        { public int compare(Student2 a, Student2 b) {
            return a.score.compareTo(b.score);
        }
        }); // sap xep lai theo score
        sortByScore.addAll(stu);
        System.out.println("Sorted by score:\n"+sortByScore);

        List<Student2> lst=new ArrayList<Student2>();
        lst.addAll(stu);

        // Tim kiem theo dieu kien nhu khi xay dung lop Student (theo code)
        int i =Collections.binarySearch(lst, st1);
        if (i>=0) {System.out.print("Found by code:"+ lst.get(i) ); }
        else  System.out.println("Not Found by code");

        // Tim kiem theo score
        i =Collections.binarySearch(lst, st1,new Comparator<Student2> (){   @Override
        public int compare(Student2 a, Student2 b) {
            return a.getScore().compareTo(b.getScore());
        } });// tim theo score
        if (i>=0) {System.out.print("Found by score:"+ lst.get(i) ); }
        else  System.out.println("Not Found by score");
    }
}
