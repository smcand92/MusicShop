public class SheetMusic extends Accessory implements ISell {

    public SheetMusic(double costPrice, double sellPrice){
        super(costPrice, sellPrice);
    }

    public double calculateMarkup(){
        return sellPrice - costPrice;
    }
}