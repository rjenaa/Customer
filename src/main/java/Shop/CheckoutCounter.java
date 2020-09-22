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

        for (int i = 0; i < customer1.length; i++) {
            boolean fit = true;
            System.out.println(customer1[i]);
            System.out.print("Price: ");
            if(customer1[i] instanceof Employee){
                System.out.println(shop.employeePriceAfterDiscount((Employee) customer1[i]));

            }
            else{
                System.out.println(shop.calcTotal(customer1[i].getClothingItems()));
            }

            System.out.print("Does it fit?");
            for (Clothing b : customer1[i].getClothingItems()) {
                shop.measure(customer1[i]);
                if(!b.isAFit(customer1[i])){
                    fit = false;
                }
            }
            System.out.println(fit);
            System.out.println("****************************Thank You!!! Come Again *****************************");
        }

    }
}
