package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        Calendar dateDuJour = Calendar.getInstance();
        SimpleDateFormat patate = new SimpleDateFormat("dd/MM/yyyy", Locale.CANADA_FRENCH);
        SimpleDateFormat fraiseDuJour = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CANADA_FRENCH);
        SimpleDateFormat dateFr = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", Locale.FRENCH);
        SimpleDateFormat dateCH = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", Locale.CHINA);
        SimpleDateFormat dateGR = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", Locale.GERMAN);

        date.set(2016, Calendar.MAY, 19, 23, 59, 30);

        System.out.println(patate.format(date.getTime()));
        System.out.println(fraiseDuJour.format(dateDuJour.getTime()));
        System.out.println(dateFr.format(dateDuJour.getTime()));
        System.out.println(dateCH.format(dateDuJour.getTime()));
        System.out.println(dateGR.format(dateDuJour.getTime()));
    }
}
