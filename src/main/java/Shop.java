import instruments.Trumpet;
import interfaces.ISell;

import java.util.ArrayList;
import java.util.List;


public class Shop {

    private final  String name;
    private final List<ISell> stock;



    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public List<ISell> getStock(){
        return this.stock;
    }

    public void addItemToStock(ISell trumpet) {
        this.stock.add(trumpet);
    }

    public void removeItem(ISell item){

        this.stock.remove(item);
    }


}
