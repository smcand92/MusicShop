import java.util.ArrayList;



    public class Shop {
        ArrayList<ISell> stock;

        public Shop(ArrayList<ISell> stock){
            this.stock = stock;
        }

        public void addToStock(ISell item){
            this.stock.add(item);
        }

        public void removeFromStock(ISell item){
            this.stock.remove(item);
        }

        public int getStockSize(){
            return stock.size();
        }

        public double calculateStockValue(){
            double total = 0;
            for (ISell item : this.stock) {
                total += item.calculateMarkup();
            }
            return total;
        }
}
