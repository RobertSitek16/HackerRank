package practice.java.advanced.varargsSimpleAddition;

public class Add {

    public void add(int... intArguments) {
        int expectedValue = 0;
        String space = "";
        for (int i : intArguments) {
            expectedValue += i;
            System.out.print(space + i);
            space = "+";
        }
        System.out.println("=" + expectedValue);
    }

}
