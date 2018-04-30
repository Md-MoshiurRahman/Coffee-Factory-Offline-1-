
package coffee.factory.main;

interface CoffeeType {

    void Show();
}

public class CoffeeFactoryMain {

    
    public static void main(String[] args) throws Exception {
        CoffeeFactory coffeeFactory = Factory.NewCoffeeFactory();
        CoffeeType coffeeType1 = coffeeFactory.produceCoffee("Coffee A");
        coffeeType1.Show();
        CoffeeType coffeeType2 = coffeeFactory.produceCoffee("Coffee B");
        coffeeType2.Show();
        CoffeeType coffeeType3 = coffeeFactory.produceCoffee("Coffee C");
        coffeeType3.Show();
        CoffeeType coffeeType4 = coffeeFactory.produceCoffee("Coffee D");
        coffeeType4.Show();
    }
    
}
