package easy.timeconversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        DateFormat twelve_time = new SimpleDateFormat("hh:mm:ssa");
        DateFormat twenty_four_time = new SimpleDateFormat("HH:mm:ss");
        String showMilitaryTime = twenty_four_time.format(twelve_time.parse(time));
        System.out.println(showMilitaryTime);
    }
}
