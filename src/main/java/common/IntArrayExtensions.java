package common;

import java.beans.PropertyEditorManager;
import java.util.Arrays;
import java.util.Random;

public class IntArrayExtensions {

    public static void main(String[] args) {

        int max = 9;

        int[] tenRandomNumber = getRandomNumbersInRange(10, 0, max);
        System.out.println("Zufällige Zahlen: " + Arrays.toString(tenRandomNumber));
        System.out.println("Kleinster Wert: " + getMin(tenRandomNumber, max));
        System.out.println("Grösster Wert: " + getMax(tenRandomNumber));
        System.out.println("Durchschnitt: " + getAverage(tenRandomNumber));
        System.out.println("rückwärts: " + Arrays.toString(reverse(tenRandomNumber)));
        System.out.println("sortiert: " + Arrays.toString(sort(tenRandomNumber)));
        System.out.println("sortiert und rückwärts: " + Arrays.toString(reverse(sort(tenRandomNumber))));
        System.out.println("sortiert und wieder gemischt: " + Arrays.toString(mix(sort(tenRandomNumber))));
    }

    /**
     * Creates an array with random number.
     * @param size The size of the array.
     * @param min The smallest possible generated number.
     * @param max The biggest possible generated number.
     * @return the generated int array.
     */
    public static int[] getRandomNumbersInRange(int size, int min, int max){
        Random random = new Random();
        return random.ints(size, min, max).toArray();
    }
    public static int getMax(int[] elements) {
        int max = 0;

        for(int element : elements) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }
    public static int getMin(int[] elements, int min) {
        for(int element : elements) {
            if(element < min) {
                min = element;
            }
        }
        return min;
    }
    public static double getAverage(int[] elements) {
        double average = 0;

        for(int element : elements) {
            average += element;
        }

        average /= elements.length;

        return average;
    }

    public static int[] sort(int[] elements) {
        boolean sort = true;

        while(sort) {
            sort = false;
            for (int i = 0; i < elements.length - 1; i++) {
                if (elements[i] > elements[i + 1]) {
                    int element1 = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = element1;
                    sort = true;
                }
            }
        }

        return elements;
    }
    public static int[] reverse(int[] elements) {
        int j = 0;
        int[] rev = new int[elements.length];
        for(int i = elements.length - 1; i >= 0;i--) {
            rev[j] += elements[i];
            j++;
        }
        return rev;
    }
    public static int[] mix(int[] elements) {
        int[] erg = new int[elements.length];
        for(int i = 0; i < elements.length; i++) {
            erg[i] = -1;
        }
        Random random = new Random();
        boolean full = false;

        int i = 0;
        while(!full) {
            full = true;
            for(int zahl : erg) {
                if (zahl == -1) {
                    full = false;
                    break;
                }
            }

            int rand = random.nextInt(elements.length);
            if(erg[rand] == -1) {
                erg[rand] = elements[i];
                i++;
            }
        }

        return erg;
    }
}
