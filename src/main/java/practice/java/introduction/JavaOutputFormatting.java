package practice.java.introduction;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=scanner.next();
            int x=scanner.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d\n", s1, x);

        }
        System.out.println("================================");

    }
}
