package BTVN_B9_B10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop  implements Comparable<Laptop> // cai lại method compareTo
{   private String brand;
    private String color;
    private Double cpu;
    private Integer hdd;
    private Double weight;
    private Integer ram;
    public void setBrand(String code) {
        this.brand = code;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRam(Integer score) {
        this.ram = score;
    }
    public Laptop(String brand, String color, Integer ram, Double cpu, Integer hdd, Double weight ) {
        this.brand = brand;
        this.ram = ram;
        this.color = color;
        this.weight = weight;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    public Integer getRam() {
        return ram;
    }
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public Integer getHdd() {
        return hdd;
    }
    public Double getCpu(){
        return cpu;
    }
    public Double getWeight(){
        return weight;
    }
    public String toString() {
        return "(" + brand + "," + color + "," + ram + "," + cpu + "," + hdd + "," + weight + ")";
    }
    public int compareTo(Laptop other) {
        return this.ram.compareTo(other.ram);

    }
}

public class B2 {
    public static void main(String[] args)  {
        List<Laptop> lst = new ArrayList<Laptop>();// sx theo ten
        lst.add(new Laptop("Dell","black", 8, 2.4, 500, 3.0));
        lst.add(new Laptop("Asus","white", 7, 3.1, 500, 2.5));
        lst.add(new Laptop("Dell","yellow", 4, 2.7, 400, 3.9));
        lst.add(new Laptop("HP","red", 4, 2.4, 500, 3.1));
        lst.add(new Laptop("ThinkPad","black", 3, 2.4, 500, 3.2));
        lst.add(new Laptop("MAC","yellow", 3, 2.4, 300, 3.2));
        lst.add(new Laptop("Dell","orange", 2, 2.4, 600, 3.4));
        lst.add(new Laptop("HP","black", 8, 2.4, 500, 3.0));
        lst.add(new Laptop("Asus","gray", 4, 2.4, 5100, 3.0));
        lst.add(new Laptop("Dell","purple", 1, 2.4, 5200, 3.0));
        System.out.println(lst);
        //1 Menu -- Sắp theo ram
        Collections.sort(lst);// Sort by ram
        System.out.println("\nSap xep theo ram:");
        System.out.println(lst); //in ra list đã sắp xếp

        Laptop st1 = new Laptop("Asus","gray", 4, 2.4, 5100, 3.0);
        int i= Collections.binarySearch(lst, st1);// Search  by ram

        if (i>=0) {
            System.out.println("\nFound by ram:" );
            int j=i;
            while (j<lst.size() && lst.get(j).getRam()== 4){
                System.out.println(lst.get(j));
                j++;
            };
            j=i-1;
            while (j>=0 && lst.get(j).getRam()== 4){
                System.out.println(lst.get(j));
                j--;
            };
        }
        // 2. Menu Sắp xếp theo brand
        // 2 Sap xep theo Brand de chuan bi cho tim kiem nhi phan theo Brand
        Collections.sort(lst, new  Comparator<Laptop>(){
            public int compare(Laptop a, Laptop b){
                return a.getBrand().compareTo(b.getBrand());
            }
        } );
        System.out.println("\nSap xep theo brand:");
        System.out.println(lst);

        st1 = new Laptop("Asus","gray", 4, 2.4, 5100, 3.0);
        // 3 Tim kiem nhi phan theo Score
        i= Collections.binarySearch(lst, st1, new Comparator<Laptop> (){
            public int compare(Laptop a, Laptop b) {
                return a.getBrand().compareTo(b.getBrand());
            } });// tim theo brand

        if (i>=0) {
            System.out.println("\nFound by brand:");
            int j=i;
            while (j<lst.size() && lst.get(j).getBrand()== "Asus"){
                System.out.println(lst.get(j));
                j++;
            };
            j=i-1;
            while (j>=0 && lst.get(j).getBrand()== "Asus"){
                System.out.println(lst.get(j));
                j--;
            };
        }
    }
}
