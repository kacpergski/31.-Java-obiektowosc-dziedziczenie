public class Fetilizer extends Product {

    private String purpose;

    public Fetilizer(String name, double price, String purpose) {
        super(name, price);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }
}

