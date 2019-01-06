public class Guitar extends Instrument implements IPlay, ISell  {

    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType type, double costPrice, double sellPrice, int numberOfStrings){
        super(material, colour, type, costPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public String play(){
        return "Playing rock";
    }

    public double calculateMarkup(){
        return sellPrice - costPrice;
    }
}