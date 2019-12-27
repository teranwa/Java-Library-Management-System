/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymangementsystem.Others;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author USER
 */
public class Dates {
    
    
    public static String getDate() {
     
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, 14); // Adding 5 days
        String output = sdf.format(c.getTime());
        return output;
        
    }
  
//    public static void fines() throws ParseException {
//     
//    Date startDate = 2015-10-21 ;
//    Date endDate   = "2015-10-27";
//
//    long duration  = endDate.getTime() - startDate.getTime();
//
//    long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
//    long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
//    long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
//    }
}