package Buoi_9;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericSet <T> {
    private ArrayList<T> al;

    public GenericSet() {
        al = new ArrayList<T>();
    }

    public void Insert(T  element) {
        al.add(element);
    }

    public void Remove(T  element) {
        al.remove(element);
    }
    public static void main(String args[]) {
        GenericSet<Integer> s = new GenericSet<>();
        GenericSet<String> s1 = new GenericSet<>();
        s.Insert(new Integer(10));
        s.Insert(new Integer(50));
        s.Insert(new Integer(30));
        s.Remove(50);
        s1.Insert("Nguyễn");
        s1.Insert("Thị");
        s1.Insert("Huyền");
        s1.Insert("Trang");
        s1.Remove("Thị");
        Iterator<Integer> it = s.al.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.print("\n");

        Iterator<String> it1 = s1.al.iterator();
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }
    }


}
