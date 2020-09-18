package Shop;

public class ShopApp {

    private final double TAX = .10;
    public double calcTotal(Clothing[] a){
        double total = 0;
        for (Clothing x : a ){
            total += x.getPrice();
        }
        return total+total*TAX;
    }
    public char measure(Customer a){
        char size = a.getSize();
        return size;
    }

    public double employeePriceAfterDiscount(Employee a){
        double total = 0;
        for (Clothing x : a.getClothingItems() ){
            total += x.getPrice();
        }
        total -= total* a.getDISCOUNT();
        total += total*TAX;
        return total;
    }
}
