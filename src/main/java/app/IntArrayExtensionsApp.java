package app;

import java.util.Arrays;

import common.IntArrayExtensions;

public class IntArrayExtensionsApp {

    public static void main(String[] args) {

        int max = 9;

        int[] tenRandomNumber = IntArrayExtensions.getRandomNumbersInRange(10, 0, max);
        System.out.println("Zufällige Zahlen: " + Arrays.toString(tenRandomNumber));
        System.out.println("Kleinster Wert: " + IntArrayExtensions.getMin(tenRandomNumber, max));
        System.out.println("Grösster Wert: " + IntArrayExtensions.getMax(tenRandomNumber));
        System.out.println("Durchschnitt: " + IntArrayExtensions.getAverage(tenRandomNumber));
        System.out.println("rückwärts: " + Arrays.toString(IntArrayExtensions.reverse(tenRandomNumber)));
        System.out.println("sortiert: " + Arrays.toString(IntArrayExtensions.sort(tenRandomNumber)));
        System.out.println("sortiert und rückwärts: " + Arrays.toString(IntArrayExtensions.reverse(IntArrayExtensions.sort(tenRandomNumber))));
        System.out.println("sortiert und wieder gemischt: " + Arrays.toString(IntArrayExtensions.mix(IntArrayExtensions.sort(tenRandomNumber))));
    }
}
