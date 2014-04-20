import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-3-30
 * Time: 下午3:02
 * To change this template use File | Settings | File Templates.
 */
public class LearningCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println("ERA is " + calendar.get(Calendar.ERA));

        System.out.println("YEAR is " + calendar.get(Calendar.YEAR));

        System.out.println("MONTH is " + calendar.get(Calendar.MONTH));

        System.out.println("DATE is  " + calendar.get(Calendar.DATE));

        System.out.println("DAY_OF_YEAR is " + calendar.get(Calendar.DAY_OF_YEAR));

        System.out.println("AM_PM is " + calendar.get(Calendar.AM_PM));

        System.out.println("HOUR(12) is " + calendar.get(Calendar.HOUR));

        System.out.println("HOUR(24) is " + calendar.get(Calendar.HOUR_OF_DAY));

        System.out.println("MILLISECOND is " + calendar.get(Calendar.MILLISECOND));

        // the current date add 5 hour
        calendar.add(Calendar.HOUR, 5);
        // the current date add 5 day
        calendar.add(Calendar.DATE, 5);
        // the current date add 5 month
        calendar.add(Calendar.MONTH, 5);
        // the current date add 5 year
        calendar.add(Calendar.YEAR, 5);


        // create two calendar at the different dates
        Calendar cal1 = new GregorianCalendar(2015, 8, 15);
        Calendar cal2 = new GregorianCalendar(2008, 1, 02);

        System.out.println(cal1.after(cal2));
        System.out.println(cal1.before(cal2));
        System.out.println(cal1.compareTo(cal2));
        // get
        System.out.println(cal1.getActualMaximum(Calendar.WEDNESDAY));

        System.out.println(Locale.TAIWAN);
        System.out.println(Locale.getDefault());

        Locale[] locales = new Locale[10];
        locales = Locale.getAvailableLocales();

        for (Locale locale : locales) {
            System.out.println(locale.getCountry());
            System.out.println(locale.getDisplayLanguage());
            System.out.println(locale.getLanguage());
            System.out.println(locale.getVariant());
            System.out.println(locale.getISO3Country());
        }

        System.out.println(Calendar.getInstance(Locale.GERMAN).getTime());
        System.out.println(Calendar.getInstance(Locale.CHINA).getTime());
        System.out.println(Calendar.getInstance(Locale.CHINESE).getTime());


        System.out.println(cal1.getFirstDayOfWeek());

        cal1.setFirstDayOfWeek(Calendar.SATURDAY);
        System.out.println(cal1.get(Calendar.DAY_OF_WEEK));
    }
}
