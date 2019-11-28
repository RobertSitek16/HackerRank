package practice.java.advanced.javaFactoryPattern;

public class Cake implements Food {
    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
