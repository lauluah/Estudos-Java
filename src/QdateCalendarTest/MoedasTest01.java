package QdateCalendarTest;

import java.util.Currency;

public class MoedasTest01 {
    public static void main(String[] args) {
        Currency currencyUSD = Currency.getInstance("USD");
        Currency currencyEUR = Currency.getInstance("EUR");
        Currency currencyBRL = Currency.getInstance("BRL");

        System.out.println("Código da moeda: " + currencyUSD.getCurrencyCode());
        System.out.println("Símbolo da moeda: " + currencyUSD.getSymbol());

        System.out.println("Código da moeda: " + currencyEUR.getCurrencyCode());
        System.out.println("Símbolo da moeda: " + currencyEUR.getSymbol());

        System.out.println("Código da moeda: " + currencyBRL.getCurrencyCode());
        System.out.println("Símbolo da moeda: " + currencyBRL.getSymbol());

    }
}