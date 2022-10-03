package items;

import interfaces.ISell;

public class Item implements ISell {

    private double buyingPrice;
    private double sellingPrice;
    private String description;

    public Item(double buyingPrice, double sellingPrice, String description) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.description = description;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice(){
        return this.sellingPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setSellingPrice(double newPrice) {
        this.sellingPrice = newPrice;
    }
}
