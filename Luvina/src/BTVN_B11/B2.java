package BTVN_B11;

import java.util.*;

class Trader implements Comparable<Trader>{
    String TraderCode;
    String PIN;
    String Address;
    String Email;
    String Tel;
    public Trader(String TraderCode, String PIN, String Address, String Email, String Tel) {
        this.TraderCode = TraderCode;
        this.Address = Address;
        this.Tel = Tel;
        this.PIN = PIN;
        this.Email = Email;
    }
    @Override
    public int compareTo(Trader t) {
        return this.TraderCode.compareTo(t.TraderCode);
    }
}
class Stock implements Comparable<Stock>{
    String StockCode;
    String Info;
    public Stock(String StockCode, String Info) {
        this.StockCode = StockCode;
        this.Info = Info;
    }
    @Override
    public int compareTo(Stock s) {
        return this.StockCode.compareTo(s.StockCode);
    }
    PriorityQueue<TradeOrder> sellOrder = new PriorityQueue<TradeOrder>(100, new Comparator<TradeOrder>() {
        public int compare(TradeOrder to1, TradeOrder to2) {
            return Float.compare(to1.Price, to2.Price);
        }
    });
    PriorityQueue<TradeOrder> buyOrder = new PriorityQueue<TradeOrder>(100, new Comparator<TradeOrder>() {
        public int compare(TradeOrder td1, TradeOrder td2) {
            return Float.compare(td2.Price, td1.Price);
        }
    });
}
class TradeOrder {
    Integer OrderID;
    String StockCode;
    String SellerID;
    String BuyerID;
    Date Date;
    int Amount;
    float Price;
    public TradeOrder(int OrderID, String StockCode, String SellerID, String BuyerID, Date Date,int Amount, float Price) {
        this.OrderID = OrderID;
        this.StockCode = StockCode;
        this.SellerID = SellerID;
        this.BuyerID = BuyerID;
        this.Date = Date;
        this.Amount = Amount;
        this.Price = Price;
    }
    public String toString() {
        return "OrderID: " + OrderID + ", StockCode: " + StockCode + ", SellerID: " + SellerID
                + ", BuyerID: " + BuyerID + ", Date: " + Date + ", Amount: " + Amount
                + ", Price: " + Price;
    }
}

public class B2 {
    public static void main(String args[]) {
        TreeMap<String, Trader> t = new TreeMap<String, Trader>();
        Trader t1 = new Trader("tc1", "abc456", "HN", "abc@", "4693345678");
        Trader t2 = new Trader("tc2", "bvc546", "HP", "trf@", "2345678965");
        Trader t3 = new Trader("tc3", "cfh231", "HCM", "elc@", "23456789876");
        Trader t4 = new Trader("tc4", "ljf341", "HD", "etu@", "3456789457");
        t.put(t1.TraderCode, t1);
        t.put(t2.TraderCode, t2);
        t.put(t3.TraderCode, t3);
        t.put(t4.TraderCode, t4);

        HashMap<String, Stock> h = new HashMap<String, Stock>();
        Stock s1 = new Stock("sc1", "Viettel");
        Stock s2 = new Stock("sc2", "Vin");
        Stock s3 = new Stock("sc3", "Amazon");
        Stock s4 = new Stock("sc4", "SM");
        h.put(s1.StockCode, s1);
        h.put(s2.StockCode, s2);
        h.put(s3.StockCode, s3);
        h.put(s4.StockCode, s4);

        TradeOrder to1 = new TradeOrder(1, "sc4", "si1", "bi1", new Date("11/01/2020"),10,  120000f);
        TradeOrder to2 = new TradeOrder(2, "sc4", "si2", "bi2", new Date("11/01/2020"), 100, 23000f);

    }
}
