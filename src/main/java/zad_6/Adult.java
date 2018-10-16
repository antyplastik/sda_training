package zad_6;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Adult {

//    String [] quest = new String {"Podaj dzien urodzenia: ", "Podaj miesiac urodzenia: ", "Podaj dzien urodzenia: "};
//    int [] date = new int [quest.length];


    String datePattern = "dd.MM.yyyy";
    private Date dateToCheck;
    private Date systemDate;

    public Adult() {
        System.out.println("===== Zad.6 =====");
//        String test = "12.01.1989";
        System.out.print("Podaj swoj wiek w formacie "+ datePattern + ": ");
//        System.out.println(test);
        Scanner scanner = new Scanner(System.in);

        getDateFromString(scanner.nextLine());
//        getDateFromString(test);
        getSystemTime();

        isAdult();
    }

    private Date getDateFromString(String str){
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        Date convertCurrentDate = null;
        try {
            convertCurrentDate = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        String date = sdf.format(convertCurrentDate);

        return this.dateToCheck = convertCurrentDate;
    }

    private Date getSystemTime(){
        String systemTime_str = null;

        SimpleDateFormat systemTime = new SimpleDateFormat(datePattern);
        this.systemDate = new Date();

        systemTime_str = systemTime.format(systemDate);

        System.out.println(systemTime_str);

        return systemDate;
    }

    public boolean isAdult(){
        boolean isAdult_bool = false;

        int sec = 1000;

        long seconds;
        double days;
        double years;

//        long diff = systemDate.getTime() - dateToCheck.getTime();

//        System.out.println(TimeUnit.DAYS.convert(diff,TimeUnit.DAYS));

        GregorianCalendar date1 = new GregorianCalendar();
        GregorianCalendar date2 = new GregorianCalendar();

        long dateOfBirth = dateToCheck.getTime();
        long system = systemDate.getTime();

        seconds = system/sec - dateOfBirth/sec;
        days = (seconds/86400);
        years = (days/365);

        System.out.println(seconds);
        System.out.println(days);
        System.out.println(years);

        if (years >= 18)
            isAdult_bool = true;

        return isAdult_bool;
    }
}
