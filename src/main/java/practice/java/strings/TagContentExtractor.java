/*
Given a string of text in a tag-based language, parse this text and retrieve the contents
enclosed within sequences of well-organized tags meeting the following criterion:

1. The name of the start and end tags must be same. The HTML code <h1>Hello
World</h2> is not valid, because the text starts with an h1 tag and ends with a non-
matching h2 tag.

2. Tags can be nested, but content between nested tags is considered not valid. For
example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is
not valid.

3. Tags can consist of any printable characters.
 */

package practice.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0){
            String line = in.nextLine();
            boolean matchFound = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
            testCases --;
        }


    }
}
