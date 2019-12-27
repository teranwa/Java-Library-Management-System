/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymangementsystem.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USER
 */
public class DateController {

    public static String getSystemDate() {
        long currentTimeMillis = System.currentTimeMillis();
        Date date = new Date(currentTimeMillis);
        SimpleDateFormat dateFormat_1 = new SimpleDateFormat("YYYY-MM-dd");
        return dateFormat_1.format(date);
    }

    public static String getSystemTime() {
        long currentTimeMillis = System.currentTimeMillis();
        Date date = new Date(currentTimeMillis);
        SimpleDateFormat dateFormat_2 = new SimpleDateFormat("HH:mm:ss");
        return dateFormat_2.format(date);
    }

    public static void main(String[] args) {
        try {
            
            String datestr = "2015-11-27";
            SimpleDateFormat formatter;
            Date dueDate;
            formatter = new SimpleDateFormat("YYYY-MM-dd");
            dueDate = (Date) formatter.parse(datestr);
            System.out.println(dueDate);
            System.out.println(getSystemDate());
            
        } catch (Exception e) {
            
        }
    }

}
