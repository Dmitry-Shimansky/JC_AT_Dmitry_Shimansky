package main.java.Tasks.HomeWork.String;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class OutputMethod {
    public static void main(String[] args) {
        OutputMethod nextMonth = new OutputMethod(8);
    }

    int monthNumber;

    public OutputMethod(int monthNumber) {
        this.monthNumber = monthNumber - 1;

        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.MONTH, this.monthNumber);
        calendar.add(Calendar.MONTH, 1);

        SimpleDateFormat spec = new SimpleDateFormat("MMMM");

        System.out.println(spec.format(calendar.getTime()));

    }
}
