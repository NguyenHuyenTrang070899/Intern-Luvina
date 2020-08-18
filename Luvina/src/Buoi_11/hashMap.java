package Buoi_11;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class hashMap {
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
        HashMap<Order, ArrayList<OrderDetail>> t
                = new  HashMap <Order, ArrayList<OrderDetail>>  ();
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
    }
}
