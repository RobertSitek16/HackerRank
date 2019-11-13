package practice.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

    private static class MyRegex {
        String beetweenDots = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        public String pattern = "(" + beetweenDots + "\\.){3}" + beetweenDots;
    }
}
