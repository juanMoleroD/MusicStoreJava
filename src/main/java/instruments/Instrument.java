package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements ISell, IPlay {

    private double buyingPrice;
    private double sellingPrice;

    public Instrument(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
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
}
