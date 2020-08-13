package BTVN_B9_B10.Bai_5;

import java.util.ArrayList;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String args[]) {
        ArrayList<OrderDetail> arr1 = new ArrayList<>();
        arr1.add(new OrderDetail(1, 2, 3, 4, 200.5f));
        arr1.add(new OrderDetail(1, 2, 4, 5, 200));
        TreeMap<Order, ArrayList<OrderDetail>> tmap = new TreeMap<Order, ArrayList<OrderDetail>>();
        tmap.put(new Order(1, "12/04/2020", "A11"), arr1);

    }
}
