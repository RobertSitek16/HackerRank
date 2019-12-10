/*
You have to create another class that extends the abstract class.
Then you can create an instance of the new class.

Notice that setTitle method is abstract too and has no body.
That means you must implement the body of that method in the child class.

In the editor, we have provided the abstract Book class and a Main class.
In the Main class, we created an instance of a class called MyBook.
Your task is to write just the MyBook class.
 */
package practice.java.objectOrientedProgramming.abstractClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();

    }
}
