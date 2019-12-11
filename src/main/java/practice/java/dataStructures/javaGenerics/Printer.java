package practice.java.dataStructures.javaGenerics;


public class Printer {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
            System.out.println();
        }
    }
}
