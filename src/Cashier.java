public class Cashier {
    private String name;
    private int id;

    public Cashier(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String displayCashier(){
        return "You cashier today: " + name + '\n';
    }
}