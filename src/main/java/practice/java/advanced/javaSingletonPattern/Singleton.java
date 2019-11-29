/*
Complete the Singleton class in your editor which contains the following components:
1. A private Singleton non parameterized constructor.
2. A public String instance variable named str.
3. Write a static method named getSingleInstance that returns the single instance of the Singleton
class.

Once submitted, our hidden Solution class will check your code by taking a String as input and then
using your Singleton class to print a line.
 */

package practice.java.advanced.javaSingletonPattern;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton(){}

    public String str;

    public static Singleton getSingleInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
