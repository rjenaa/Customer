package Shop;

public class CheckoutCounter {
    ShopApp shopApp;
    Clothing[] shoppingBag;
    Customer customer;
    Employee employee;

    public static void main(String[] args) {
        Clothing[] shoppingBag = {new Clothing("Shirt", 100, 'L'), new Clothing("Pants", 150, 'M')};
        Customer customer = new Customer("Ray", shoppingBag, 'L');
        ShopApp shop = new ShopApp();
        shop.calcTotal(shoppingBag);
        Clothing[] shoping = {new Clothing("Shoes", 175, 'L')};
        Employee employee = new Employee("Mike", shoping, 'L');

        Customer[] customer1 = {customer, employee};

        for (Customer a : customer1) {
            boolean fit = true;
            System.out.println(a);
            System.out.println("Price: " + shop.calcTotal(a.getClothingItems()));
            System.out.print("Does it fit?");
            for (Clothing b : a.getClothingItems()) {
                if(!b.isAFit(a)){
                    fit = false;
                }
            }
            System.out.println(fit);
            System.out.println("****************************Thank You!!! Come Again *****************************");
        }

    }
}
