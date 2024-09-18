package Uregex.test;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class UregexTest02 {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        String[] emails = {
                "email.valido@dominio.com",
                "email-invalido@dominio",
                "outro.email@dominio.org",
                "emailerrado.com",
                "nome@dominio.co"
        };

        Pattern pattern = Pattern.compile(regex);

        List<String> emailsValidos = new ArrayList<>();

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                emailsValidos.add(email);
            }
        }

        System.out.println("E-mails válidos:");
        for (String emailValido : emailsValidos) {
            System.out.println(emailValido);
        }
    }
}
