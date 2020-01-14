/*
Two cats and a mouse are at various positions on a line. You will be given their starting positions. Your task is to determine
which cat will reach the mouse first, assuming the mouse doesn't move and the cats travel at equal speed. If the cats arrive at
the same time, the mouse will be allowed to move and it will escape while they fight.

If cat A catches the mouse first, print Cat A.
If cat B catches the mouse first, print Cat B.
If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class CatsAndMouse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int query = scanner.nextInt();
        while(query > 0){
            int catA = scanner.nextInt();
            int catB = scanner.nextInt();
            int mouseC = scanner.nextInt();
            if(Math.abs(mouseC - catA) == Math.abs(mouseC - catB)){
                System.out.println("Mouse C");
            }
            if(Math.abs(mouseC - catB) < Math.abs(mouseC - catA)){
                System.out.println("Cat B");
            }
            if(Math.abs(mouseC - catB) > Math.abs(mouseC - catA)){
                System.out.println("Cat A");
            }
            query--;
        }

    }
}
