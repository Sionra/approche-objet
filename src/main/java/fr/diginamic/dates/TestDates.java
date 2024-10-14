package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatDate2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date(124, 9, 14);
        Date date2 = new Date(116, 6, 19, 23, 59, 30);
        Date dateSystem= new Date();
        System.out.println(formatDate.format(date));
        System.out.println(formatDate2.format(date2));
        System.out.println(formatDate2.format(dateSystem));
    }
}
