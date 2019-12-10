/*
You are given a phone book that consists of people's names and their phone number. After that you
will be given some person's name as query. For each query, print the phone number of that person.
 */
package practice.java.dataStructures;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            try {
                int connect = map.get(s);
                System.out.println(s + "=" + connect);
            } catch (Exception e){
                System.out.println("Not found");
            }
        }
    }
}
