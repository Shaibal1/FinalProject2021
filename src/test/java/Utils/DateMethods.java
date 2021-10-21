package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMethods {


    public static String getCurrentDate_MMMddyyyy() {
        Date nw = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy");
        return df.format(nw);
    }

}
