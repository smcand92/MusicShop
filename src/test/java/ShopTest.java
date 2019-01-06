import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    SheetMusic sheetMusic;
    ArrayList<ISell> stock;

    @Before
    public void before(){
        stock = new ArrayList<>();
        shop = new Shop(stock);
        guitar = new Guitar("wood", "brown", InstrumentType.STRING, 80, 100, 6);
        sheetMusic = new SheetMusic(10, 15);
    }

    @Test
    public void hasStock(){
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        shop.addToStock(sheetMusic);
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(sheetMusic);
        shop.removeFromStock(guitar);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canCalculateTotalValue(){
        shop.addToStock(guitar);
        shop.addToStock(sheetMusic);
        assertEquals(25, shop.calculateStockValue(), 0.1);
    }
}
