package offsetdatetime;

import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        var strDate = "22/12/2015";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Imprimindo data formatada
        System.out.println("==============");
        System.out.println(formatter.format(localDate));

        // Setando string como data e imprimindo
        System.out.println("==============");
        System.out.println(localDate.parse(strDate, formatter));

        // Manipulando data, acrescentando 50 dias
        System.out.println("==============");
        System.out.println(localDate.plus(50, ChronoUnit.DAYS));

        // Acrescentando anos
        System.out.println("==============");
        System.out.println(localDate.plusYears(20));

        // Recuperando mes atual
        System.out.println("==============");
        System.out.println(localDate.getMonth());

        // Exibindo localTime
        LocalDate localDate2 = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

        System.out.println("==============");
        System.out.println(localTime);
        System.out.println(formatter.format(localTime));

        // Utilizando localDateTime e ZoneOffset para buscar a hora do sistema de acordo com o timezone da maquina
        LocalDateTime localDateTime = localDate2.atTime(localTime);
        Date date = Date.from(localDateTime.toInstant(ZoneOffset.ofHours(-3)));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        System.out.println("==============");
        System.out.println(date);

        // Realizando o caminho inverso para o mesmop resultado
        date = new Date();
        calendar = Calendar.getInstance();
        calendar.setTime(date);
        ZoneId zoneId = calendar.getTimeZone().toZoneId();
        LocalDateTime localDateTime3 = LocalDateTime.ofInstant(calendar.toInstant(), zoneId);
        
        System.out.println("==============");
        System.out.println(localDateTime3);
    }
}
