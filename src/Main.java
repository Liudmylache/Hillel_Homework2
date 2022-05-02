public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Tomato", 10, "2/19/22", "Mexico", "1 kg");
        Product product2 = new Product("Cucumber", 6, "2/19/22", "Ukraine", "1 kg");
        Product product3 = new Product("Milk", 4, "2/19/22", "Ukraine", "1 l");
        Product product4 = new Product("RedBull", 6,"8/1/24","USA", "250 ml");

        String displayName = Supermarket.displayName();
        Cashier cashier1 = new Cashier ("Mila",1);



        System.out.println(displayName);
        System.out.println(cashier1.displayCashier());
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        //System.out.println(product2.toString("Shishito Pepper", 12));
        System.out.println(product3.toString());
        System.out.println(product4.toString());
        //product4.strq();
    }
}