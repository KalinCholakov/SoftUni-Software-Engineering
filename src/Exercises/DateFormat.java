package Exercises;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateFormat
    extends GregorianCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Calendar cal = Calendar.getInstance();
        System.out.println("Current time is :" + cal.getTime());
        cal.add(Calendar.DATE, 1000);
        System.out.println(formatter.format(cal.getTime()));

        Calendar calndr1
                = (Calendar)Calendar.getInstance();
        System.out.println("The Current" + "System Date: " + calndr1.getTime());
    }
}