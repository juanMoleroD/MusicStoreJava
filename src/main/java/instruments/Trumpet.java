package instruments;

import interfaces.ISell;

public class Trumpet extends Instrument implements ISell {

    private final int valves;

    public Trumpet(double buyingPrice, double sellingPrice) {
        super(buyingPrice, sellingPrice, InstrumentType.BRASS);
        this.valves = 3;
        this.setDescription("this is a trumpet");
    }

    public String play(){
        return "Toot";
    }

    public int getValvesCount(){
        return this.valves;
    }

}
