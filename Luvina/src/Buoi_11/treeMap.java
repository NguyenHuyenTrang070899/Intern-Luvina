package Buoi_11;

import java.util.*;

class Order  implements Comparable<Order>{
    Integer IdOrder;// mã hoá đơn
    Date OrdDate;// ngày hoá đơn
    String CustomerID; // mã khách hàng
    Order(int IdOrder, Date OrdDate, String CustomerID) {
        this.IdOrder = IdOrder;
        this.OrdDate = OrdDate;
        this.CustomerID = CustomerID;
    }
    // Sap xep theo CustomerID, IdOrder
    @Override
    public int compareTo(Order t) {
        if (this.CustomerID.compareTo(t.CustomerID)!=0)
            return this.CustomerID.compareTo(t.CustomerID);
        else return this.IdOrder.compareTo(t.IdOrder);
    }
}
class OrderDetail {
    int IdOrder; // mã hoá đơn
    int IdDetail;// mã hoá đơn chi tiết
    int ItemID;// mã hàng
    int Amount;// số lượng hàng
    float Price; //đơn giá
    OrderDetail(int IdOrder, int IdDetail, int ItemID, int Amount, float Price) {
        this.IdOrder = IdOrder;
        this.IdDetail = IdDetail;
        this.ItemID = ItemID;
        this.Amount = Amount;
        this.Price = Price;
    }
}
class Purchase {
    int IdPurchase;// mã đơn nhập hàng
    Date purDate;// ngày nhập hàng
    String SupplierID;// mã nhà cung cấp
}
class PurchaseDetail {
    int IdPurchase;
    int IdDetail;
    int ItemID;
    int Amount;
    float Price;
}
class Supplier {
    String IdSup;// mã nhà cung cấp
    String Name;
    String Address;
    String Tel;
}
public class treeMap {
    public static void main(String[] args) {
        Order or1 = new Order(1, new Date( "06/8/2020"), "Cus01");
        Order or2 = new  Order(2, new Date("06/8/2020"), "Cus02");
        OrderDetail orDetail1 = new OrderDetail(1, 1, 1, 10, 100);
        OrderDetail orDetail2 = new OrderDetail(1, 2, 5, 7, 20);
        ArrayList<OrderDetail> ar1= new ArrayList<>();
        ar1.add(orDetail1);
        ar1.add(orDetail2);
        OrderDetail orDetail3 = new OrderDetail(2, 3, 3, 10, 100);
        OrderDetail orDetail4 = new OrderDetail(2, 4, 7, 7, 20);
        ArrayList<OrderDetail> ar2= new ArrayList<>();
        ar2.add(orDetail3);
        ar2.add(orDetail4);
        TreeMap<Order, ArrayList<OrderDetail>> t
                = new  TreeMap <Order, ArrayList<OrderDetail>>  ();
        t.put(or1, ar1);
        t.put(or2,ar2);
        for (int i=10; i<100000; i++) {
            Order or = new  Order(i, new Date("06/8/2020"), "Cus"+i);
            OrderDetail orDetaili1 = new OrderDetail(i, 1, 1, 10, 100);
            OrderDetail orDetaili2 = new OrderDetail(i, 2, 5, 7, 20);
            ArrayList<OrderDetail> ar = new ArrayList<>();
            ar.add(orDetaili1);
            ar.add(orDetaili2);
            t.put(or, ar);
        }
        ArrayList<OrderDetail> arx= t.get(new  Order(2, new Date("06/8/2020"), "Cus02"));
        TreeMap<Order, ArrayList<OrderDetail>> or = new TreeMap<Order, ArrayList<OrderDetail>>(new Comparator<Order>()
        { public int compare(Order a, Order b) {
            return a.CustomerID.compareTo(b.CustomerID);
        }
        }); // sap xep lai theo score
    }
}
