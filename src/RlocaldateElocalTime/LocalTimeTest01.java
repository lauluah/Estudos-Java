package RlocaldateElocalTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        System.out.println(time);

        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(timeNow.format(pattern));

        System.out.println(time.getMinute());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);// começo do dia 00:00
        LocalTime time3 = LocalTime.MAX;
        System.out.println(time3.format(pattern));

    }
}
