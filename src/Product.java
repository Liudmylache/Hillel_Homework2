import java.security.PublicKey;

public class Product {

    public String name;
    public int price;
    public String expirationDate;
    public String manufacturer;
    public String volume;

    public Product(String name, int price, String expirationDate, String manufacturer, String volume) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.manufacturer = manufacturer;
        this.volume = volume;
    }
    public Product (){
    }

    public String toString () {
        return "item: " + name +
                ", price= " + price +
                ", expirationDate= " + expirationDate +
                ", manufacturer= " + manufacturer +
                ", volume=" + volume;
    }

    String toString(String name,int price){
        return "item: " + name +
                ", price= " + price;
    }

    String toString(String name){
        return "item " + name + " is not available";
    }

    void strq(){
        System.out.println("Error");
    }

}
