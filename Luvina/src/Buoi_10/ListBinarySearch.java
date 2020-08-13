package Buoi_10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student  implements Comparable<Student> // cai lại method compareTo
{   private String code;
    private String name;
    private Integer score;
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public Student(String code, String name, Integer score) {
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
        return "(" + code + "," + name + "," + score + ")";
    }
    public int compareTo(Student other) {
       return this.name.compareTo(other.name);

    }
}

public class ListBinarySearch {
    public static void main(String[] args)  {
        List<Student> lst = new ArrayList<Student>();// sx theo ten
        lst.add(new Student("A05726","AA", 8));
        lst.add(new Student("A06338","AC", 7));
        lst.add(new Student("A05726","AA",5));
        lst.add(new Student("A05726","AB1", 7));
        lst.add(new Student("A06178", "AC",9));
        System.out.println(lst);
        //1 Menu -- Sắp theo tên
        Collections.sort(lst);// Sort by name
        System.out.println("\nSap xep theo ten:");
        System.out.println(lst); //in ra list đã sắp xếp

        Student st1 = new Student("A06178","AC", 0);//Nhap SV can tim kiem  (thay)
        int i= Collections.binarySearch(lst, st1);// Search  by name

        if (i>=0) {
            System.out.println("Found by name:" );
            int j=i;
            while (j<lst.size() && lst.get(j).getName()=="AC"){
                System.out.println(lst.get(j));
                j++;
            };
            j=i-1;
            while (j>=0 && lst.get(j).getName()=="AC"){
                System.out.println(lst.get(j));
                j--;
            };
        }
        // 2. Menu Sắp xếp theo điểm
        // 2 Sap xep theo Score de chuan bi cho tim kiem nhi phan theo Score
        Collections.sort(lst, new  Comparator <Student>(){
            public int compare(Student a, Student b){
                return a.getScore().compareTo(b.getScore());
            }
        } );
        System.out.println("\nSap xep theo diem:");
        System.out.println(lst);
        st1=new Student(" ","AC", 7);//Nhap SV can tim kiem
        // 3 Tim kiem nhi phan theo Score
        i= Collections.binarySearch(lst, st1, new Comparator<Student> (){
        public int compare(Student a, Student b) {
            return a.getScore().compareTo(b.getScore());
        } });// tim theo score

        if (i>=0) {
            System.out.println("Found by score:");
            int j=i;
            while (j<lst.size() && lst.get(j).getScore()==7){
                System.out.println(lst.get(j));
                j++;
            };
            j=i-1;
            while (j>=0 && lst.get(j).getScore()==7){
                System.out.println(lst.get(j));
                j--;
            };
        }
    }
}
