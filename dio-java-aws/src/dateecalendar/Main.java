package dateecalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws Exception {
        var date = new Date();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        
        // Imprimindo datas normais
        System.out.println(date);

        // Imprimindo datas formatadas
        System.out.println(formatter.format(date));

        // Setando datas
        date.setYear(99);
        System.out.println(date);

        var calendar = Calendar.getInstance();
        formatter = new SimpleDateFormat("dd/MM/yyy HH:mm:ss Z");

        // Imprimindo data formatada
        System.out.println(formatter.format(calendar.getTime()));

        // Acessando constantes do objeto Date
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        // Convertendo para string
        var stringToDate = formatter.format(calendar.getTime());
        stringToDate = stringToDate.replace("22:", "21:");
        var newDate = formatter.parse(stringToDate);
        var newCalendar = Calendar.getInstance();
        newCalendar.setTime(newDate);
        System.out.println(formatter.format(calendar.getTime()));
        System.out.println(formatter.format(newCalendar.getTime()));


    }
}
