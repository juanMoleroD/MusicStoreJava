package instruments;

public class Piano extends Instrument{
    @Override
    public String play() {
        return "pling";
    }

    public Piano(double buyingPrice, double sellingPrice, InstrumentType type) {
        super(buyingPrice, sellingPrice, type);
    }
}
