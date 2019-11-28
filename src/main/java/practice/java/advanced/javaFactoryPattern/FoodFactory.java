package practice.java.advanced.javaFactoryPattern;

public class FoodFactory {

    public Food getFood(String order){
        return (order.equals("pizza")) ? new Pizza() : new Cake();
    }
}
