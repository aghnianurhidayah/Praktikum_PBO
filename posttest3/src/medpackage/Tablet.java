package medpackage;

public class Tablet extends Medicine {
    private String type;
    private int mg;

    public Tablet(String id, String name, int stok, int price, String date, String type, int mg) {
        super(id, name, stok, price, date);
        this.type = type;
        this.mg = mg;
    }
    
    public String getType() {
        return type;
    }

    public int getMg() {
        return mg;
    }
}
