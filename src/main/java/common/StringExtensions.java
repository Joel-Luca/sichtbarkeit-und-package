package common;

public class StringExtensions {

    public static void main(String[] args) {
        String text = "Hallo Welt!";
        System.out.println("reversed: " + reverse(text));

        String zahl = "12345";
        System.out.println(quersum(zahl)); // Quersumme
    }

    public static String reverse(String text) {
        String[] ar = text.split("");
        String rev = "";

        for(int i = ar.length - 1; i >= 0; i--) {
            rev += ar[i];
        }

        return rev;
    }

    public static int quersum(String value) {
        String[] txt = value.split("");
        int[] num = new int[txt.length];

        for(int i = 0; i < txt.length; i++) {
            num[i] = Integer.parseInt(txt[i]);
        }

        int sum = 0;

        for(int zahl : num) {
            sum += zahl;
        }

        return sum;
    }
}
