package instruments;

public class Guitar extends Instrument{

    private final int strings;

    public Guitar(double buyingPrice, double sellingPrice) {
        super(buyingPrice, sellingPrice, InstrumentType.STRING);
        this.strings = 6;
        this.setDescription("This is a guitar");
    }

    public int getStrings() {
        return strings;
    }

    public String play() {
        return "Wroom";
    }

}
