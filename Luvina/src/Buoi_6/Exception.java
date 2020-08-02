package Buoi_6;

class TestFinallyBlock{
    public static void main(String args[]){
        try{
            int data=25/5;
            System.out.println(data);
        }
        catch(NullPointerException e){System.out.println(e);}
        finally{System.out.println("Khoi finally luon luon duoc thuc thi");}
        System.out.println("Phan code con lai...");
    }
}

class TestFinallyBlock1{
    public static void main(String args[]){
        try{
            int data=25/0;
            System.out.println(data);
        }
        catch(NullPointerException e){System.out.println(e);}
        finally {
            System.out.println("Khoi finally luon luon duoc thuc thi");
        }
        System.out.println("Phan code con lai...");
    }
}



class TestFinallyBlock2{
    public static void main(String args[]){
        try{
            int data=25/0;
            System.out.println(data);
        }
        catch(ArithmeticException e){System.out.println(e);}
        finally{System.out.println("Khoi finally luon luon duoc thuc thi");}
        System.out.println("Phan code con lai...");
    }
}

//finally được dùng khi:
//-Bát trượt ngoại lệ
//-Có câu lệnh return
//-Xảy ra ngoại lệ nhưng bị ném đi