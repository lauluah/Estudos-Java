package QdateCalendarTest;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        System.out.println("Data e hora atuais: " + calendario.getTime());

        int ano = calendario.get(Calendar.YEAR);
        System.out.println("Ano atual: " + ano);

        calendario.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Data após adicionar 5 dias: " + calendario.getTime());

        Date dataAtual = new Date();

        DateFormat shortFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat mediumFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);

        System.out.println("SHORT: " + shortFormat.format(dataAtual));
        System.out.println("MEDIUM: " + mediumFormat.format(dataAtual));
        System.out.println("LONG: " + longFormat.format(dataAtual));
        System.out.println("FULL: " + fullFormat.format(dataAtual));
    }
}
