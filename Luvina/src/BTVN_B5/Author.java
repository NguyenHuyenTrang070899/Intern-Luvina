package BTVN_B5;

public class Author {
    private String name;
    private String email;
    private String gender;
    private int age;

    public Author(String name, String email, String gender, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public String getGender() {
        return gender;
    }

    public String toString() {

        return "Name: " + getName() + " - Email: " + getEmail() + " - Gender: " + getGender() + " - Age: " + age;
    }
    public static void main(String[] args) {
        Author author = new Author("Trang", "trang12345@.com", "male", 30);

        Book book1 = new Book("Java for Beginners", author, 210000, 20);
        System.out.println(book1);
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int count;

    public Book(String name, Author author, double price, int count) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.count = count;
    }

    public String getName() {
        return name;
    }



    public Author getAuthor() {

        return author;
    }

    public double getPrice() {
        return price;
    }

    public int count() {
        return count;
    }

    public String toString() {

        return "Name: " + getName() + "\nAuthor: " + getAuthor() + "\nPrice: " + getPrice() + "\nCount: " + count();
    }
}
