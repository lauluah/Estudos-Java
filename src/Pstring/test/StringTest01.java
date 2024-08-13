package Pstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = str2.intern();
        System.out.println(str1 == str3);
        System.out.println(str1 == str2);

        // Alguns metodos

        String nome = "    Sophia     ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("a", "e"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0, 5)); // -1
        System.out.println(numeros.substring(4));
        System.out.println(nome.trim());
    }
}
