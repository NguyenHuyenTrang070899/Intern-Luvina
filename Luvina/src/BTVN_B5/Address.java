package BTVN_B5;

public class Address {
    private String country;
    private String city;
    private String district;
    private String street;

    public Address(String country, String city, String district, String street) {
        this.country = country;
        this.city = city;
        this.district = district;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }


    public String getDistrict() {
        return district;
    }

    public String getStreet()  {
        return street;
    }

    public String toString() {

        return "Country: " + getCountry() + " - City: " + getCity() + " - District: " + getDistrict() + " - Street: " + getStreet();
    }
    public static void main(String[] args) {
        Address add = new Address("Viet Nam", "Ha Noi", "Nam Tu Liem", "My Dinh");

        Student std = new Student("Nguyen Thi Huyen Trang", 23, 8.9, add);
        System.out.println(std);
    }
}

class Student {
    private String name;
    private int age;
    private double score;
    private Address address;

    public Student(String name, int age, double score, Address address) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {

        return age;
    }

    public double getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress() {
        this.address = address;
    }
    public String getRating() {
        return "Rating";
    }
    public String toString() {

        return "Name: " + getName() + "\nAge: " + getAge() + "\nScore: " + getScore() + "\nAddress: " + getAddress();
    }
}
