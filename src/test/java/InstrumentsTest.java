
import instruments.Guitar;
import instruments.Instrument;
import instruments.Trumpet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InstrumentsTest {
    Trumpet trumpet;
    Guitar guitar;

    @BeforeEach
    void setup(){
        trumpet = new Trumpet(100, 150);
        guitar = new Guitar(200, 250);
    }

    @Test
    void canPlaySounds(){
        assertEquals("Toot",trumpet.play());
    }

    @Test
    void canCheckNumberOfValves(){
        assertEquals(3, trumpet.getValvesCount());
    }

    @Test
    void trumpetIsInstrument() {
        assertTrue(trumpet instanceof Instrument);
    }

    @Test
    void canBePlayed() {
        assertEquals("Toot", trumpet.play());
        assertEquals("Wroom", guitar.play());
    }
}
