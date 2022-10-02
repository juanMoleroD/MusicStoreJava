package instruments;

public class Guitar extends Instrument{

    private int strings;
    private String description;

    public Guitar(double buyingPrice, double sellingPrice) {
        super(buyingPrice, sellingPrice);
        this.strings = 6;
        this.description = "This is a guitar";
    }

    public int getStringsCount(){
        return this.strings;
    }

    public int getStrings() {
        return strings;
    }

    public String getDescription() {
        return description;
    }

    public String play() {
        return "Wroom";
    }
}
