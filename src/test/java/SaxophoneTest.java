import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setup(){
        saxophone = new Saxophone("brass", "blue",InstrumentType.BRASS, 40, 70, 6);
    }

    @Test
    public void hasMaterial() {
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", saxophone.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.BRASS, saxophone.getType());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(40, saxophone.getCostPrice(), 0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(70, saxophone.getSellPrice(), 0.1);
    }

    @Test
    public void hasNumberOfValves(){
        assertEquals(6, saxophone.getNumberOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Playing jazz", saxophone.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(30, saxophone.calculateMarkup(), 0.1);
    }


}