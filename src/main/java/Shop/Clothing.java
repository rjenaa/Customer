package Shop;

public class Clothing {
    private String description;
    private double price = 100.0;
    private char size;

    public Clothing(String description, double price, char size){
        this.description = description;
        this.price = price;
        this.size = size;
    }
    public boolean isAFit(Customer a){
        for (Clothing x: a.getClothingItems()){
            if (x.getSize()!=a.getSize()){
                return false;
            }
        }

            return true;

    }
    public double getPrice() {

        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}' + "\n ";
    }
}
