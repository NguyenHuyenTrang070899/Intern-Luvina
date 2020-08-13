package Buoi_10;
import java.util.Comparator;
import java.util.PriorityQueue;

class Book implements Comparable<Book>
{
    private String title;
    private String author;
    private Integer year;
    public Book(String title, String author, Integer year) {
        this.title = title;
        this.year = year;
        this.author=author;
    }
    @Override
    public int compareTo(Book o) {
        return author.compareTo(o.author);
    }
    public String getTitle() {
        return title;
    }
    public Integer getYear() {
        return year;
    }
    @Override
    public String toString()
    {
        return author +","+ title +","+ year.toString();
    }
}

public class PriorityQueueTest {
    public static void main(String[] a) {
        PriorityQueue<Book> pQ = new PriorityQueue<Book>();
        // Theo tac gia
        pQ.add(new Book("Tutorial Java 1.1", "C1", 1990));
        pQ.add(new Book("Tutorial Java 1.2","A1", 1995));
        pQ.add(new Book("Tutorial C", "D1", 1985));
        pQ.add(new Book("Tutorial Pascal","A1",  1980));
        // theo tac gia
        while (!pQ.isEmpty()) {
            System.out.println(pQ.remove().toString());
        }
        // Theo nam
        PriorityQueue<Book> pQ1 = new PriorityQueue<Book> (100, new Comparator<Book>() {
                    public int compare(Book o1, Book o2) {
                        return o1.getYear().compareTo(o2.getYear());
                    }
                });
        pQ1.add(new Book("D Tutorial Java 1.1","C", 1990));
        pQ1.add(new Book("A Tutorial Java 1.2", "A", 1995));
        pQ1.add(new Book("C Tutorial C", "B", 1985));
        pQ1.add(new Book("B Tutorial Pascal","A", 1980));
        pQ1.addAll(pQ);
        // Theo nam
        while (!pQ1.isEmpty()) {
            System.out.println("=="+ pQ1.remove());
        }
    }
}
