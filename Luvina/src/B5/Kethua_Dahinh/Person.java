package B5.Kethua_Dahinh;

public class Person {
    protected String name;
    protected String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public static void main(String args[]){
        Student student = new Student( "Trang", "Ha Noi", "CNTT", 1999, 8.9);
        Staff staff = new Staff("Ha", "Thanh Hoa", "ĐH Cong nghe", 10000);
        System.out.println(student);
        System.out.println(staff);
    }
}

class Student extends Person {

    protected String program;
    protected int year;
    protected double score;
    public Student(String name, String address, String program, int year, double score) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.score = score;
    }
    public String getProgram(){
        return program;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getRating() {
        return "Rating";
    }
    public String toString(){
        return "Name: " + super.getName() + "\nScore: " + getScore() + "\nAddress: " + super.getAddress();
    }
}

class Staff extends Person {

    protected String school;
    protected double salary;
    public Staff(String name, String address, String school, double salary) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(int year) {
        this.salary = year;
    }
    public double upToSalary(int precent) {
        return salary * (1 + precent/100);
    }
    public String toString(){
        return "Name: " + super.getName() + "\nSalary: " + getSalary() + "\nAddress: " + super.getAddress();
    }
}

