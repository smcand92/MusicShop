public abstract class Instrument {
    String material;
    String colour;
    InstrumentType type;
    double costPrice;
    double sellPrice;


    public Instrument(String material, String colour, InstrumentType type, double costPrice, double sellPrice){
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial(){
        return material;
    }

    public String getColour(){
        return colour;
    }

    public InstrumentType getType(){
        return type;
    }

    public double getCostPrice(){
        return costPrice;
    }

    public double getSellPrice(){
        return sellPrice;
    }

}
