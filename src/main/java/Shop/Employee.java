package Shop;

import java.util.Arrays;

public class Employee extends Customer{
    
    private final double DISCOUNT = .10;

    public Employee(String name, Clothing[] a, char size){
        super(name,a,size);

    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public String toString() {
        return "\n" + getName() + "\nEmployee{" +
                " clothingItems=" + Arrays.toString(getClothingItems()) +
                ", size=" + getSize() +
                '}';
    }
}

