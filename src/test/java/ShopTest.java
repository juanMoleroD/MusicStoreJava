import instruments.*;
import items.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    Shop shop;
    Item item;
    Instrument trumpet;


    @BeforeEach
    void setUp() {
        item = new Item(10,15, "This is a pick");
        trumpet = new Trumpet(100, 150);
        shop = new Shop("theTrumpet");
    }

    @Test
    void hasName(){
        assertEquals("theTrumpet", shop.getName());
    }

    @Test
    void hasStock(){
        assertEquals(0,shop.getStock().size());
    }

    @Test
    void canStockUpInstruments() {
        shop.addItemToStock(trumpet);
        assertEquals(trumpet, shop.getStock().get(0));
        Piano piano = new Piano(2000, 2500, InstrumentType.KEYED);
        shop.addItemToStock(piano);
        assertEquals(piano, shop.getStock().get(1));
    }

    @Test
    void canStockUpItems(){
        Item item = new Item(10,15, "This is an Item");
        shop.addItemToStock(item);
        assertEquals(1, shop.getStock().size());
    }

//    this tests forced us to implement ISell;
//    @Test
//    void canOnlyAddSellableItemsToStock() {
//        String text = "This is a string";
//        shop.addItemToStock(text);
//        assertEquals( 0 , shop.getStock().size());
//    }

    @Test
    void canRemoveFromInventory(){
        shop.addItemToStock(item);
        shop.removeItem(item);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    void canCalculateTotalPotentialProfit() {
        shop.addItemToStock(item);
        shop.addItemToStock(trumpet);
        assertEquals(55, shop.getPotentialProfits());
    }
}