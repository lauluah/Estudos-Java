package Owrappers.test;

public class WrapperTest {
    public static void main(String[] args) {
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = true;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");


        System.out.println(verdadeiro);
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('!'));
        System.out.println(Character.toLowerCase('A'));
    }
}
