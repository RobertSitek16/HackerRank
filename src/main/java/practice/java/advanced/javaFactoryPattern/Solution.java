package practice.java.advanced.javaFactoryPattern;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner scanner = new Scanner(System.in);

            FoodFactory foodFactory = new FoodFactory();

            Food food = foodFactory.getFood(scanner.nextLine());

            System.out.println("The factory returned class " + food.getClass().getSimpleName());

            System.out.println(food.getType());
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }

    }
}
