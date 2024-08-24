package QdateCalendarTest;

import java.util.Currency;
import java.util.Locale;

public class MoedasTest01 {
    public static void main(String[] args) {
      import java.util.Currency;
import java.util.Locale;

        public class CurrencyExample {
            public static void main(String[] args) {
                Currency currencyUSD = Currency.getInstance(Locale.US);
                Currency currencyEUR = Currency.getInstance(Locale.GERMANY);
                Currency currencyBRL = Currency.getInstance(new Locale("pt", "BR"));

                System.out.println("Código da moeda: " + currencyUSD.getCurrencyCode());
                System.out.println("Símbolo da moeda: " + currencyUSD.getSymbol());

                System.out.println("Código da moeda: " + currencyEUR.getCurrencyCode());
                System.out.println("Símbolo da moeda: " + currencyEUR.getSymbol());

                System.out.println("Código da moeda: " + currencyBRL.getCurrencyCode());
                System.out.println("Símbolo da moeda: " + currencyBRL.getSymbol());
            }
        }


    }
}