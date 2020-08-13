package BTVN_B9_B10;

import java.util.ArrayList;

public class B6_3 {
    public static void main(String[] args)  {
        ArrayList<Integer> lst1 = new ArrayList();
        lst1.add(0);
        lst1.add(3);
        lst1.add(9);
        lst1.add(10);
        lst1.add(8);
        lst1.add(7);
        lst1.add(5);
        lst1.add(4);
        lst1.add(2);
        lst1.add(19);
        lst1.add(13);
        lst1.add(14);
        int m = 4, n = 8;
        int index;
        for (int i = m; i <= n; i++) {
            index = i;
            for (int j = i+1; j <= n; j++) {
                if (lst1.get(index) < lst1.get(j)) {
                    index = j;
                }
            }
            int temp = lst1.get(index);
            lst1.set(index, lst1.get(i));
            lst1.set(i, temp);
        }

        System.out.println(lst1); //in ra list đã sắp xếp


    }
}
