public class Saxophone extends Instrument implements IPlay, ISell {

    private int numberOfValves;

    public Saxophone(String material, String colour, InstrumentType type, double costPrice, double sellPrice, int numberOfValves){
        super(material, colour, type, costPrice, sellPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves(){
        return numberOfValves;
    }

    public String play(){
        return "Playing jazz";
    }

    public double calculateMarkup(){
        return sellPrice - costPrice;
    }
}