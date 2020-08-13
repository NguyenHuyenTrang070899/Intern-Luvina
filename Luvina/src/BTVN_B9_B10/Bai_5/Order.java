package BTVN_B9_B10.Bai_5;

class Order {
    int IdOrder;
    String OrdDate;
    String CustomerID;

    public void setIdPurchase(int IdPurchase){
        this.IdOrder = IdPurchase;
    }
    public void setOrdDate(String OrdDate){
        this.OrdDate = OrdDate;
    }
    public void setCustomerID(String CustomerID ){
        this.CustomerID = CustomerID;
    }
    public Order(int IdOrder, String OrdDate, String CustormerID){
        this.IdOrder = IdOrder;
        this.OrdDate = OrdDate;
        this.CustomerID = CustormerID;
    }
    public int getIdPurchase(){
        return IdOrder;
    }
    public String getOrdDate(){
        return OrdDate;
    }
    public String getCustomerID(){
        return CustomerID;
    }
    public String toString()
    {
        return IdOrder +","+ OrdDate +","+ CustomerID;
    }
}

class OrderDetail {
    int IdOrder;
    int IdDetail;
    int ItemID;
    int Amount;
    float Price;

    public OrderDetail(int IdOrder, int IdDetail, int ItemID, int Amount, float Price){
        this.IdOrder = IdOrder;
        this.IdDetail = IdDetail;
        this.ItemID = ItemID;
        this.Amount = Amount;
        this.Price = Price;
    }
    public int getIdOrder(){
        return IdOrder;
    }
    public int getIdDetail(){
        return IdDetail;
    }
    public int getItemID(){
        return ItemID;
    }
    public int getAmount(){
        return Amount;
    }
    public float getPrice(){
        return Price;
    }
}

class Purchase {
    int IdPurchase;
    String PurDate;
    String SupplierID;

    public void setIdPurchase(int IdPurchase){
        this.IdPurchase = IdPurchase;
    }
    public void setPurDate(String PurDate){
        this.PurDate = PurDate;
    }
    public void setSupplierID(String SupplierID ){
        this.SupplierID = SupplierID;
    }
    public Purchase(int IdPurchase, String PurDate, String CustormerID){
        this.IdPurchase = IdPurchase;
        this.PurDate = PurDate;
        this.SupplierID = CustormerID;
    }
    public int getIdPurchase(){
        return IdPurchase;
    }
    public String getPurDate(){
        return PurDate;
    }
    public String getSupplierID(){
        return SupplierID;
    }
}

class PurchaseDetail {
    int IdPurchase;
    int IdDetail;
    int ItemID;
    int Amount;
    float Price;

    public PurchaseDetail(int IdPurchase, int IdDetail, int ItemID, int Amount, float Price){
        this.IdPurchase = IdPurchase;
        this.IdDetail = IdDetail;
        this.ItemID = ItemID;
        this.Amount = Amount;
        this.Price = Price;
    }
    public int getIdPurchase(){
        return IdPurchase;
    }
    public int getIdDetail(){
        return IdDetail;
    }
    public int getItemID(){
        return ItemID;
    }
    public int getAmount(){
        return Amount;
    }
    public float getPrice(){
        return Price;
    }
}

class Supplier {
    String IdSup;
    String Name;
    String Address;
    String Tel;

    public Supplier(String IdSup, String Name, String Address, String Tel){
        this.IdSup = IdSup;
        this.Name = Name;
        this.Address = Address;
        this.Tel = Tel;
    }
    public String getIdSup(){
        return IdSup;
    }
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return Address;
    }
    public String getTel(){
        return Tel;
    }
    
}
