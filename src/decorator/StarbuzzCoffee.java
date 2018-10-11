package decorator;

public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        beverage.display();

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3.display();
    }
}
