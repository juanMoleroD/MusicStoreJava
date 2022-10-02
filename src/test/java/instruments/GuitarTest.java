package instruments;

import interfaces.ISell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuitarTest {

    Guitar guitar;
    Trumpet trumpet;

    @BeforeEach
    void setUp(){
        guitar = new Guitar(100, 150);
        trumpet = new Trumpet(90, 180);
    }

    @Test
    void hasStrings(){
        assertEquals(6, guitar.getStringsCount());
    }

    @Test
    void instrumentsHavePrices(){
        Instrument guitar = new Guitar(100, 150);
        assertEquals(100, guitar.getBuyingPrice());
        assertEquals(150, guitar.getSellingPrice());
        assertEquals(90, trumpet.getBuyingPrice());
        assertEquals(180, trumpet.getSellingPrice());
    }

    @Test
    void canCalculateMarkup(){
        assertEquals(50.00, guitar.calculateMarkup());
    }

    @Test
    void guitarIsISell() {
        ISell newGuitar = guitar;
        assertTrue(newGuitar instanceof ISell);
    }
    @Test
    void instrumentHasDescription() {
        assertEquals("This is a guitar", guitar.getDescription());
        assertEquals("this is a trumpet", trumpet.getDescription());
    }




}
