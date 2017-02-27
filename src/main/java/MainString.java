import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javafx.scene.input.DataFormat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by pjoanna on 2017-02-23.
 */
public class MainString {
    public static void main(String[] args) {
     //   Locale locale = Locale.getDefault();
     //   Calendar calendar = GregorianCalendar.getInstance(locale);

     //   DateFormat formatter = SimpleDateFormat.getInstance();
     //   System.out.println(formatter.format(calendar.getTime()));
        ApplicationContext context = new ClassPathXmlApplicationContext("configurationSpring.xml");
        Calendar calendar = context.getBean("calendar", Calendar.class);
        DateFormat formatter = (DateFormat)context.getBean("formatter");
        System.out.println(formatter.format(calendar.getTime()));

    }
}
