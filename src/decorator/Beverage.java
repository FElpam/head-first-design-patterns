package decorator;

public abstract class Beverage {
    String description = "Unknown Berverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public void display(){
        System.out.println(getDescription() + " $" + cost());
    }
}
