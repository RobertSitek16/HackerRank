package practice.java.introduction;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                a += b;

                if (j > 0){
                    System.out.print(" ");
                }

                System.out.print(a);
                b = b * 2;
            }
            System.out.print("\n");

        }

        in.close();
    }
}
