import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertDouble {

    public static void main(String[] args) throws ParseException {
        Date todate = new Date();
        System.out.println(todate);

        long myLong = todate.getTime();
        System.out.println(myLong);

        double myDouble = (double)myLong;
        System.out.println(myDouble);

        String myDateStr = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(myLong);             
        System.out.println(myDateStr);
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        //String dateInString = "15-10-2015 10:20:56";
        String dateInString=myDateStr;
        Date date = sdf.parse(dateInString);
        System.out.println("date "+date);
        
        long v=(long)myDouble;
        
        String myDateV=new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(myLong);
        Date dateV = sdf.parse(myDateV);
        System.out.println("dateV "+dateV);

        
        //String myString=Double.toString(myDouble);

    }
}