import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.ConsoleHandler;

public class MyDate {
    private SimpleDateFormat dateFormat;
    private final String pattern = "dd/MM/yyyy";

    MyDate(){
        dateFormat = new SimpleDateFormat(pattern);
    }

    public static String date(String inputDate){
        MyDate myDate = new MyDate();
        Date dateToFormat = new Date(inputDate);
        return myDate.dateFormat.format(dateToFormat);
    }
}
