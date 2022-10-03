import interfaces.ISell;

import java.util.ArrayList;
import java.util.List;


public class Shop {

    private final String name;
    private final List<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<ISell> getStock() {
        return this.stock;
    }

    public void addItemToStock(ISell trumpet) {
        this.stock.add(trumpet);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public double getPotentialProfits() {
//        return stock.stream()
//                .mapToDouble(ISell::calculateMarkup)
//                .sum();

//        double profits = 0;
//        for (ISell element : stock) profits += element.calculateMarkup();
//        return profits;

        return stock.stream()
                .map(ISell::calculateMarkup)
                .reduce(0.0, (total, item) -> total + item); //(Double::sum)

//        double profits = 0;
//        for (int i = 0; i < stock.size(); i++){
//            profits += stock.get(i).calculateMarkup();
//        }
//        return profits;
    }
}
