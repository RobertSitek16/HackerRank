package practice.java.advanced.javaFactoryPattern;

public class Pizza implements Food {
    @Override
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}
