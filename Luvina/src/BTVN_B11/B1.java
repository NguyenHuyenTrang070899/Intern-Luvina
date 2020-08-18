package BTVN_B11;

import java.util.*;

class Order implements Comparable<Order>{
    private int idOrder;
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
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    @Override
    public int compareTo(Order o) {
        if (idOrder > o.idOrder)
            return 1;
        else if (idOrder < o.idOrder)
            return -1;
        else
            return 0;
    }
    @Override
    public String toString() {
        return "Order{" +
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
    public int getIdDetail() {
        return idDetail;
    }
    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }
    public int getItemID() {
        return itemID;
    }
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "OrderDetail{" +
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
    public int getIdPurchase() {
        return idPurchase;
    }
    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }
    public Date getPurDate() {
        return purDate;
    }
    public void setPurDate(Date purDate) {
        this.purDate = purDate;
    }
    public String getSupplierID() {
        return supplierID;
    }
    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }
    @Override
    public String toString() {
        return "Purchase{" +
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
    public int getIdPurchase() {
        return idPurchase;
    }
    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }
    public int getIdDetail() {
        return idDetail;
    }
    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }
    public int getItemID() {
        return itemID;
    }
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
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
    public void setIdSup(String idSup) {
        this.idSup = idSup;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
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

        //HashMap
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
        ArrayList<OrderDetail> arx2= t.get(new Order(2, new Date("06/8/2020"), "Cus02"));
        System.out.println(arx2);
    }
}
