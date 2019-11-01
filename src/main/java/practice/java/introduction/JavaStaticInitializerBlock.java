package practice.java.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    public static int b;
    public static int h;
    static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        h = scanner.nextInt();
        if (b <= 0 || h <= 0){
            flag = false;
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args){
        if(flag){
            int area=b*h;
            System.out.print(area);
        }
    }
}
