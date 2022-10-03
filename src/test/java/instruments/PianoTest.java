package instruments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PianoTest {

    Piano piano = new Piano(2000, 2500, InstrumentType.KEYED);

    @Test
    void canPlaySound() {
        assertEquals("pling", piano.play());
    }
}