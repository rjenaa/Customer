package Shop;

import java.util.Arrays;

public class Customer {
    private String name;
    private Clothing[] clothingItems;
    private char size;

    public Customer(){}

    public Customer(String name, Clothing[] a, char size){
        this.name = name;
        this.clothingItems = a;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public Clothing[] getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(Clothing[] clothingItems) {
        this.clothingItems = clothingItems;
    }

    @Override
    public String toString() {
        return "\n" +getName() + "\nCustomer{" +
                " clothingItems=" + Arrays.toString(clothingItems) +
                ", size=" + size +
                '}';
    }
}
