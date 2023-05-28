import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestGregorianCalendar {
    public static void main(String[] args) {
        String[] months = {"JAN","FEB","MAR","APR","MAY","JUN"};

        Calendar c = new GregorianCalendar();

        System.out.println("Year "+c.get(Calendar.YEAR));
        System.out.println("Month "+ months[c.get(Calendar.MONTH)]);
        System.out.println("Day "+ c.get(Calendar.DATE));

        System.out.println("Day of month "+ c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of week "+ c.get(Calendar.DAY_OF_WEEK));

    }
}
