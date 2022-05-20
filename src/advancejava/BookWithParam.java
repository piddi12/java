package advancejava;

public class BookWithParam {
    String name;
    String writername;
    int pages;
    double price;

    public BookWithParam(String name, String writername, int pages, double price) {
        this.name = name;
        this.writername = writername;
        this.pages = pages;
        this.price = price;
    }
     public static void main(String[]args){
        BookWithParam obj =new BookWithParam("LIFE","Pradyumn",1112,500.5);
        System.out.println("Name is "+"="+obj.name);
         System.out.println("Writter is "+"="+obj.writername);
         System.out.println(" Pages "+"="+obj.pages);
         System.out.println("Price is "+"="+obj.price);
     }
}