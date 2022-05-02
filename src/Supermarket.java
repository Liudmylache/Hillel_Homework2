public class Supermarket {
    private static String COMPANY_NAME = "LLC SLAVA UKRAINE";
    private static String ADDRESS = "35 Kovalska street, Lviv, Ukraine";

    public static String getCompanyName() {

        return COMPANY_NAME;
    }
    public static String getAddress() {

        return ADDRESS;
    }
    public static String displayName(){

        return COMPANY_NAME + '\n' + ADDRESS;
    }
}
