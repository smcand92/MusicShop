import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup(){
        guitar = new Guitar("wood", "brown", InstrumentType.STRING, 80, 100, 6);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(80, guitar.getCostPrice(), 0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(100, guitar.getSellPrice(), 0.1);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Playing rock", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(20, guitar.calculateMarkup(), 0.1);
    }
}
