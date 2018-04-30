
package coffee.factory.main;

class Factory {

    static CoffeeFactory coffeefactory;

    /*private Factory() {
        coffeefactory = new CoffeeFactory();
    }*/

    public static CoffeeFactory NewCoffeeFactory() {
        if (coffeefactory == null) {
            coffeefactory = new CoffeeFactory();
            //return new CoffeeFactory();
        } /*else {
            return coffeefactory;
        }*/
       return coffeefactory; 

    }
}
