package Buoi_10;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Book1  {
    private String title;
    private String author;
    private Integer year;
    public Book1(String title, String author, Integer year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return author + "," + title + "," + year.toString();
    }
    @Override
    public int hashCode(){
        int hash = (int)author.charAt(0)*10 + author.charAt(1);
        System.out.println("hashCode of key: " + author + " = " + hash);
        return hash;
    }
    @Override
    public boolean equals(Object obj){
        return author.equals(((Book1) obj).author);
    }
}
class comparatorTitle implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
class comparatorYear implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear().compareTo(o2.getYear());
    }
}


public class DemoHashSet {
    public static void main(String[] args) {
        Set<Book1> setBook = new HashSet<>();
        setBook.add(new Book1("X", "Putin", 6));
        setBook.add(new Book1("A", "Trump", 13));
        setBook.add(new Book1("B", "Poroshenko", 19));
        setBook.add(new Book1("D", "NPT", 17));
        Iterator<Book1> iterator = setBook.iterator();
        while(iterator.hasNext()){
            Book1 b = iterator.next();
            System.out.println(b);
        }
        boolean kt=setBook.contains( new Book1("X", "Crump", 6));
        if (kt) System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
