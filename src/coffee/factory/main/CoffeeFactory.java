
package coffee.factory.main;

class CoffeeFactory {

    public CoffeeType produceCoffee(String type) throws Exception {
        switch (type) {
            case "Coffee A":
                return new CoffeeA();
            case "Coffee B":
                return new CoffeeB();
            case "Coffee C":
                return new CoffeeC();
            default:
                throw new Exception("Coffee type : " + type + " cannot be found\n");
        }
    }
}
