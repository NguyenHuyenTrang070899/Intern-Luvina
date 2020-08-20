package BTVN_B11;
import java.util.*;
import java.util.stream.Collectors;

//Lambda
interface Drawable{
    public void draw();
}

//Method Reference
interface Messageable{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}

//Stream Filter
class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class B3 {
    public static void main(String[] args) {
        //Lambda
        int width=10;
        Drawable d2 = ()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();

        //Method Reference
        Messageable hello = Message::new;
        hello.getMessage("Hello");

        //Stream Filter
        List<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float> pricesList = productsList.stream()
                .filter(p ->p.price> 30000)
                .map(pm ->pm.price)
                .collect(Collectors.toList());
        System.out.println(pricesList);
    }
}
