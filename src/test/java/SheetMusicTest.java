import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic(20, 30);
    }

    @Test
    public void hasCostPrice() {
        assertEquals(20, sheetMusic.getCostPrice(), 0.1);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(30, sheetMusic.getSellPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(10, sheetMusic.calculateMarkup(), 0.1);
    }
}
