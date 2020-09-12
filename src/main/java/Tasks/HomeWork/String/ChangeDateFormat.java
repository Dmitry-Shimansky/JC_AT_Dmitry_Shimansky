package main.java.Tasks.HomeWork.String;

import java.util.*;
import java.text.*;

public class ChangeDateFormat {

    //написать метод, который принимает на вход строку с датой и временем в формате "22.00 07.09.2020" и выводит в консоль в формате "September, 7, 2020 22:00"

    public static void main(String[] args) {

        String date = "22.00 07.09.2020";

        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
        String str = args.length == 0 ? date : args[0];

        System.out.print("Строка " + str + " распаршена как ");
        Date parsingDate;
        try {
            parsingDate = ft.parse(str);
            System.out.println(parsingDate);
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
    }
}
