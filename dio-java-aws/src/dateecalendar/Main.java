package dateecalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        var date = new Date();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        
        // Imprimindo datas normais
        System.out.println(date);

        // Imprimindo datas formatadas
        System.out.println(formatter.format(date));

        // Setando datas
        date.setYear(99);
        System.out.println(date);
    }
}
