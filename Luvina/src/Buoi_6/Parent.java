package Buoi_6;

public class Parent {
    public String A() {
        return "1";
    }
    protected String B() {
        return "2";
    }
}
class Child extends Parent {
    public String A() {
        return "3";
    }

    public String B() {
        return "3";
    }

}
//Khi lớp con kế thừa từ lớp cha mà muốn ghi đè phương thức thì phạm vi truy cập
//của các phương thức được ghi đè phải lớn hơn hoặc bằng phạm vi ở lớp cha.