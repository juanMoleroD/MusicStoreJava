package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements ISell, IPlay {

    private final double buyingPrice;
    private double sellingPrice;
    private String description;
    private final InstrumentType type;

    public Instrument(double buyingPrice, double sellingPrice, InstrumentType type) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.type = type;

    }

    @Override
    public void setSellingPrice(double newPrice) {
        this.sellingPrice = newPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public InstrumentType getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String play(){
        return "playing";
    }
}
