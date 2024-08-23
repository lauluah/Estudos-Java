package QdateCalendarTest;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        System.out.println(String.format("Data e hora atuais: %s", calendario.getTime()));

        int ano = calendario.get(Calendar.YEAR);
        System.out.println(String.format("Ano atual: %d", ano));

        calendario.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(String.format("Data após adicionar 5 dias: %s", calendario.getTime()));

        Date dataAtual = new Date();

        DateFormat shortFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat mediumFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);

        System.out.println(String.format("SHORT: %s", shortFormat.format(dataAtual)));
        System.out.println(String.format("MEDIUM: %s", mediumFormat.format(dataAtual)));
        System.out.println(String.format("LONG: %s", longFormat.format(dataAtual)));
        System.out.println(String.format("FULL: %s", fullFormat.format(dataAtual)));
    }
}
