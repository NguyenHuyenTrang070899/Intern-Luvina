package BTVN_B9_B10;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Calendar;

class Student  implements Comparable<Student> // cai lại method compareTo
{   private String que;
    private String hoten;
    private String ngay;
    private Double diem;
    private String nganh;
    private String TA;
    public void setQue(String que) {
        this.que = que;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public void setDiem(Double diem) {
        this.diem = diem;
    }
    public void setDate(String ngay){ this.ngay = ngay;}
    public void setNganh(String nganh) { this.nganh = nganh;}
    public void setTA(String TA) { this.TA = TA;}
    public Student(String que, String hoten, Double diem, String ngay, String nganh, String TA) {
        this.que = que;
        this.diem = diem;
        this.hoten = hoten;
        this.nganh = nganh;
        this.TA = TA;
        this.ngay = ngay;
    }
    public Double getDiem() {
        return diem;
    }
    public String getQue() {
        return que;
    }
    public String getHoten() {
        return hoten;
    }
    public String getNganh(){return nganh;}
    public String getTA(){return TA;}
    public String getNgay(){return ngay;}
    public String toString() {
        return "(" + que + "," + hoten + "," + diem +  "," + ngay + "," + nganh +  "," + TA + ")";
    }
    public int compareTo(Student other) {
        return this.hoten.compareTo(other.hoten);

    }
}


public class B3 {
    public static void main(String[] a) {
        PriorityQueue<Student> pQ = new PriorityQueue<Student>();
        // Theo tac gia
        pQ.add(new Student("HN", "Le An", 7.9, "07 / 12 / 1999", "CNTT", "B1"));
        pQ.add(new Student("TH", "Le Anh", 7.0, "11 / 12 / 1999", "HTTT", "B2"));
        pQ.add(new Student("HCM", "Trung An", 8.2, "25 / 11 / 1999", "KHMT", "B1"));
        pQ.add(new Student("TTT", "Nguyen Trang", 1.1, "07 / 1 / 1999", "CNTT", "B2"));
        pQ.add(new Student("HT", "Hoang Cuong", 10.0, "07 / 12 / 1999", "HTTT", "B1"));
        pQ.add(new Student("HP", "Duc Manh", 7.6, "07 / 10 / 1998", "CDT", "B2"));
        pQ.add(new Student("HD", "Nhat Minh", 7.7, "04 / 1 / 1999", "HTTT", "B2"));
        pQ.add(new Student("HN", "Le Na", 7.8, "06 / 12 / 1999", "CNTT", "B1"));
        pQ.add(new Student("BG", "Bui Trung", 6.3, "07 / 12 / 1997", "CNTT", "B1"));
        pQ.add(new Student("HN", "Anh Dao", 4.5, "07 / 07 / 1999", "CNTT", "B2"));

        // theo ho ten
        while (!pQ.isEmpty()) {
            System.out.println(pQ.remove().toString());
        }
        // Theo que quan
        PriorityQueue<Student> pQ1 = new PriorityQueue<Student> (100, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.getQue().compareTo(o2.getQue());
            }
        });
        pQ1.add(new Student("QN", "Anh Dao Van", 9.5, "1999 / 12 / 8", "CNTT", "B2"));
        pQ1.add(new Student("HN", "Van Trang", 6.5, "10 / 07 / 1997", "CNTT", "B1"));
        pQ1.add(new Student("HCM", "Van Trung", 1.5, "12 / 07 / 1997", "CNTT", "B1"));

        // Theo que quan
        while (!pQ1.isEmpty()) {
            System.out.println("=="+ pQ1.remove());
        }

        // Theo que quan
        PriorityQueue<Student> pQ2 = new PriorityQueue<Student> (100, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.getDiem().compareTo(o2.getDiem());
            }
        });
        pQ2.add(new Student("QN", "Anh Dao Van", 9.5, "10 / 07 / 1999", "CNTT", "B2"));
        pQ2.add(new Student("HN", "Van Trang", 6.5, "10 / 07 / 1997", "CNTT", "B1"));
        pQ2.add(new Student("HCM", "Van Trung", 1.5, "12 / 07 / 1997", "CNTT", "B1"));

        // Theo que quan
        while (!pQ2.isEmpty()) {
            System.out.println("==="+ pQ2.remove());
        }
    }
}
