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
        this.PIN = PIN;
        this.Address = Address;
        this.Email = Email;
        this.Tel = Tel;
    }
    @Override
    public int compareTo(Trader o) {
        return this.TraderCode.compareTo(o.TraderCode);
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
    public int compareTo(Stock o) {
        return this.StockCode.compareTo(o.StockCode);
    }
    PriorityQueue<TradeOrderDetail> sellOrder = new PriorityQueue<TradeOrderDetail>(100, new Comparator<TradeOrderDetail>() {
        public int compare(TradeOrderDetail tod1, TradeOrderDetail tod2) {
            return Float.compare(tod1.Price, tod2.Price);
        }
    });
    PriorityQueue<TradeOrderDetail> buyOrder = new PriorityQueue<TradeOrderDetail>(100, new Comparator<TradeOrderDetail>() {
        public int compare(TradeOrderDetail tod1, TradeOrderDetail tod2) {
            return Float.compare(tod2.Price, tod1.Price);
        }
    });
}
class TradeOrder {
    int OrderID;
    String StockCode;
    String SellerID;
    String BuyerID;
    Date Date;
    public TradeOrder(int OrderID, String StockCode, String SellerID, String BuyerID, Date Date) {
        this.OrderID = OrderID;
        this.StockCode = StockCode;
        this.SellerID = SellerID;
        this.BuyerID = BuyerID;
        this.Date = Date;
    }
}
class TradeOrderDetail {
    int OrderID;
    int Amount;
    float Price;
    public TradeOrderDetail(int OrderID, int Amount, float Price) {
        this.OrderID = OrderID;
        this.Amount = Amount;
        this.Price = Price;
    }
    public String toString() {
        return "OrderID = " + OrderID + ", Amount = " + Amount
                + ", Price = " + Price + ".";
    }
}
public class B2 {
    public static void main(String args[]) {
        TreeMap<String, Trader> traderList = new TreeMap<String, Trader>();
        Trader tra01 = new Trader("Tra01", "123456", "Hanoi", "xyz@zt.lh", "35-885-8885");
        Trader tra02 = new Trader("Tra02", "321546", "Haiphong", "eic@ena.eo", "36-794-9623");
        Trader tra03 = new Trader("Tra03", "654231", "Hochiminh", "eac@enc.qq", "37-481-9423");
        Trader tra04 = new Trader("Tra04", "652341", "Haiduong", "e87@enc.qq", "37-481-0000");
        Trader tra05 = new Trader("Tra05", "612345", "Hanam", "e14@enc.qq", "37-000-9423");
        traderList.put(tra01.TraderCode, tra01);
        traderList.put(tra02.TraderCode, tra02);
        traderList.put(tra03.TraderCode, tra03);
        traderList.put(tra04.TraderCode, tra04);
        traderList.put(tra05.TraderCode, tra05);
        HashMap<String, Stock> stockList = new HashMap<String, Stock>();
        Stock sto01 = new Stock("Sto01", "FPE");
        Stock sto02 = new Stock("Sto02", "Applr");
        Stock sto03 = new Stock("Sto03", "Vingrouq");
        Stock sto04 = new Stock("Sto04", "Microsofp");
        Stock sto05 = new Stock("Sto05", "Honde");
        stockList.put(sto01.StockCode, sto01);
        stockList.put(sto02.StockCode, sto02);
        stockList.put(sto03.StockCode, sto03);
        stockList.put(sto04.StockCode, sto04);
        stockList.put(sto05.StockCode, sto05);
        TradeOrder to1 = new TradeOrder(1, "Sto01", "Tra01", "", new Date("08/08/2020"));
        TradeOrderDetail tod1 = new TradeOrderDetail(1, 100, (float) 1000.0);
        TradeOrder to2 = new TradeOrder(2, "Sto01", "Tra02", "", new Date("08/08/2020"));
        TradeOrderDetail tod2 = new TradeOrderDetail(2, 1000, (float) 700.0);
        TradeOrder to3 = new TradeOrder(3, "Sto01", "", "Tra03", new Date("08/08/2020"));
        TradeOrderDetail tod3 = new TradeOrderDetail(3, 500, (float) 400.0);
        TradeOrder to4 = new TradeOrder(4, "Sto01", "", "Tra04", new Date("08/08/2020"));
        TradeOrderDetail tod4 = new TradeOrderDetail(4, 700, (float) 600.0);
        TradeOrder to5 = new TradeOrder(3, "Sto01", "Tra05", "", new Date("08/08/2020"));
        TradeOrderDetail tod5 = new TradeOrderDetail(5, 100, (float) 800.0);
        sto01.sellOrder.add(tod1);
        sto01.sellOrder.add(tod2);
        sto01.sellOrder.add(tod5);
        sto01.buyOrder.add(tod3);
        sto01.buyOrder.add(tod4);
/*
while(!sto01.sellOrder.isEmpty()) {
System.out.println(sto01.sellOrder.remove().toString());
}
System.out.println();
while(!sto01.buyOrder.isEmpty()) {
System.out.println(sto01.buyOrder.remove().toString());
}
System.out.println();
*/
        System.out.println(sto01.sellOrder);
        System.out.println(sto01.buyOrder);
        System.out.println();
        while(true) {
            if((!sto01.sellOrder.isEmpty()) && (!sto01.buyOrder.isEmpty())) {
                TradeOrderDetail sell = sto01.sellOrder.remove();
                TradeOrderDetail buy = sto01.buyOrder.remove();
                if(sell.Price >= buy.Price) {
                    double price = buy.Price;
                    if(sell.Amount > buy.Amount) {
                        sell.Amount -= buy.Amount;
                        sto01.sellOrder.add(sell);
                    }
                    else if(sell.Amount < buy.Amount) {
                        buy.Amount -= sell.Amount;
                        sto01.buyOrder.add(buy);
                    }
                }
                else {
                    sto01.sellOrder.add(sell);
                    sto01.buyOrder.add(buy);
                }
                System.out.println(sto01.sellOrder);
                System.out.println(sto01.buyOrder);
                System.out.println();
            }
            else {
                break;
            }
        }
    }
}
