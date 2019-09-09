/*
 * Developed by Lasse Nielsen
 * Zealand / www.zealand.dk
 * 2019-09-09
 */

public class Variabler {

    public static void main(String[] args) {

        //Primitive datatyper
        byte aMax = 127;
        byte aMin = -128;
        short bMax = 32767;
        short bMin = -32768;
        int cMax = 2147483647;
        int cMin = -2147483648;

        //Java kan ikke læse en long på over 9 tal medmindre man definere i sin kode at man gerne vil have et langt tal.
        //Java kan komme til at læse over 9 cifre hvis man sætter et L (stort eller lille) bag sit tal og på den måde
        //Kan man benytte en long til sit fulde potentiale.
        long xMax = 9223372036854775807L;
        long xMin = -9223372036854775808L;

        //Decimal
        double d = 1.1234567891011121314151617181920; //I en double kan man max få vist 15 decimaler
        float e = 20.555555555f; //I en float kan man max få vist 6-7 decimaler

        //Boolean
        boolean fMax = true;
        boolean fMin = false;

        //String er en sammenfatning af chars sat sammen
        String g = "Test";

        //Char
        char h = 'T';


        System.out.println(aMax);
        System.out.println(aMin);
        System.out.println(bMax);
        System.out.println(bMin);
        System.out.println(cMax);
        System.out.println(cMin);
        System.out.println(fMax);
        System.out.println(fMin);
        System.out.println(g);
        System.out.println(h);
        System.out.println(e);
        System.out.println(d);
        System.out.println(xMax);
        System.out.println(xMin);

    }
}
