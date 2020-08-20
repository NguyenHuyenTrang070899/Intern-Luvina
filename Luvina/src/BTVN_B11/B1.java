package BTVN_B11;

import java.util.*;

class Order implements Comparable<Order>{
    private Integer idOrder;
    private Date orderDate;
    private String customerID;
    public Order(int idOrder, Date orderDate, String customerID) {
        this.idOrder = idOrder;
        this.orderDate = orderDate;
        this.customerID = customerID;
    }
    public int getIdOrder() {
        return idOrder;
    }
    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }
    public Date getOrderDate() {
        return orderDate;
    }

    @Override
    public int compareTo(Order o) {
        return this.idOrder.compareTo(o.idOrder);
    }
    @Override
    public String toString() {
        return "Order {" +
                "idOrder=" + idOrder +
                ", orderDate=" + orderDate +
                ", customerID='" + customerID + '\'' +
                '}';
    }
}

class OrderDetail {
    private int idOrder;
    private int idDetail;
    private int itemID;
    private int amount;
    private float price;
    public OrderDetail(int idOrder, int idDetail, int itemID, int amount, float price) {
        this.idOrder = idOrder;
        this.idDetail = idDetail;
        this.itemID = itemID;
        this.amount = amount;
        this.price = price;
    }
    public int getIdOrder() {
        return idOrder;
    }
    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "OrderDetail {" +
                "idOrder=" + idOrder +
                ", idDetail=" + idDetail +
                ", itemID=" + itemID +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}

class Purchase implements Comparable<Purchase> {
    private int idPurchase;
    private Date purDate;
    private String supplierID;
    public Purchase(int idPurchase, Date purDate, String supplierID) {
        this.idPurchase = idPurchase;
        this.purDate = purDate;
        this.supplierID = supplierID;
    }

    public Date getPurDate() {
        return purDate;
    }
    public void setPurDate(Date purDate) {
        this.purDate = purDate;
    }

    @Override
    public String toString() {
        return "Purchase {" +
                "idPurchase=" + idPurchase +
                ", purDate=" + purDate +
                ", supplierID='" + supplierID + '\'' +
                '}';
    }
    @Override
    public int compareTo(Purchase o) {
        if (idPurchase < o.idPurchase) {
            return -1;
        } else if (idPurchase > o.idPurchase) {
            return 1;
        } else return 0;
    }
}

class PurchaseDetail {
    private int idPurchase;
    private int idDetail;
    private int itemID;
    private int amount;
    private float price;
    public PurchaseDetail(int idPurchase, int idDetail, int itemID, int amount, float price) {
        this.idPurchase = idPurchase;
        this.idDetail = idDetail;
        this.itemID = itemID;
        this.amount = amount;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public String toString() {
        return "PurchaseDetail {" +
                "idPurchase=" + idPurchase +
                ", idDetail=" + idDetail +
                ", itemID=" + itemID +
                ", amount=" + amount +
                ", price='" + price + '\'' +
                '}';
    }
}

class Supplier {
    private String idSup;
    private String name;
    private String address;
    private String tel;
    public Supplier(String idSup, String name, String address, String tel) {
        this.idSup = idSup;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }
    public String getIdSup() {
        return idSup;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Supplier {" +
                "idSup=" + idSup +
                ", name=" + name +
                ", tel=" + tel +
                ", address='" + address + '\'' +
                '}';
    }
}
public class B1 {
    public static void main(String[] args) {
        //TreeMap
        TreeMap<Order, ArrayList<OrderDetail>> t
                = new  TreeMap <Order, ArrayList<OrderDetail>>  ();

        for (int i=1; i<100; i++) {
            Order or = new Order(i, new Date("06/8/2020"), "Cus"+i);
            OrderDetail orDetaili1 = new OrderDetail(i, 1, 1, 10, 100);
            OrderDetail orDetaili2 = new OrderDetail(i, 2, 5, 7, 20);
            ArrayList<OrderDetail> ar = new ArrayList<>();
            ar.add(orDetaili1);
            ar.add(orDetaili2);
            t.put(or, ar);
        }
        ArrayList<OrderDetail> arx1= t.get(new Order(2, new Date("06/8/2020"), "Cus02"));
        System.out.println(arx1);

        Order order1 = new Order(10, new Date("06/9/2020"), "Cus10");
        Iterator<Order> o1 = t.keySet().iterator();
        while (o1.hasNext()) {
            Order key = o1.next();
            if (key.getOrderDate().compareTo(order1.getOrderDate()) == 0) {
                System.out.print("Search by OrderDate: " + key);
                System.out.println(t.get(key));
            }
            if (key.getIdOrder() == order1.getIdOrder()) {
                System.out.print("Search by IdOrder: " + key);
                System.out.println(t.get(key));
            }
        }

        //HashMap1
        HashMap<Order, ArrayList<OrderDetail>> h
                = new  HashMap <Order, ArrayList<OrderDetail>>  ();
        for (int i=1; i<100; i++) {
            Order or = new Order(i, new Date("06/8/2020"), "Cus"+i);
            OrderDetail orDetaili1 = new OrderDetail(i, 1, 1, 10, 100);
            OrderDetail orDetaili2 = new OrderDetail(i, 2, 5, 7, 20);
            ArrayList<OrderDetail> ar = new ArrayList<>();
            ar.add(orDetaili1);
            ar.add(orDetaili2);
            h.put(or, ar);
        }
        ArrayList<OrderDetail> arx2= h.get(new Order(2, new Date("06/8/2020"), "Cus02"));
        System.out.println(arx2);

        Order order2 = new Order(9, new Date("06/9/2020"), "Cus09");
        Iterator<Order> o2 = h.keySet().iterator();
        while (o2.hasNext()) {
            Order key = o2.next();
            if (key.getOrderDate().compareTo(order2.getOrderDate()) == 0) {
                System.out.print("Search by OrderDate: " + key);
                System.out.println(h.get(key));
            }
            if (key.getIdOrder() == order2.getIdOrder()) {
                System.out.print("Search by IdOrder: " + key);
                System.out.println(h.get(key));
            }
        }

        //HashMap2
        HashMap<Supplier, TreeMap<Purchase, ArrayList<PurchaseDetail>>> h2
                = new HashMap<Supplier, TreeMap<Purchase, ArrayList<PurchaseDetail>>>();
        for (int i=1; i<100; i++) {
            Supplier s = new Supplier("Sup0"+ i, "Supplier"+i, "abc123", "123456");
            Purchase p = new Purchase(1, new Date("15/7/2020"), "Sup"+i);
            PurchaseDetail pd1 = new PurchaseDetail(i, 1, 3, 100, 1000);
            PurchaseDetail pd2 = new PurchaseDetail(i, 2, 4, 20, 5000);
            ArrayList<PurchaseDetail> ar1 = new ArrayList<>();
            ar1.add(pd1);
            ar1.add(pd2);
            TreeMap<Purchase, ArrayList<PurchaseDetail>> t1 = new TreeMap<>();
            t1.put(p, ar1);
            h2.put(s, t1);
        }
        TreeMap<Purchase, ArrayList<PurchaseDetail>> tm= h2.get(new Supplier("Sup02", "Supplier2", "abc123", "123456"));
        System.out.println(tm);

        Supplier s1 = new Supplier("Sup03", "Supplier3", "sfhdg", "2345589");
        Iterator<Supplier> s = h2.keySet().iterator();
        while (s.hasNext()) {
            Supplier key = s.next();
            if (key.getIdSup().compareTo(s1.getIdSup()) == 0) {
                System.out.print("Search by IdSup: " + key);
                System.out.println(h2.get(key));
            }
        }
    }
}
