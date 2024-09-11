import java.util.Arrays;

public class Oblig1 {
    public static int maks(int[] a) {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen er tom!");

        if (a.length <= 2) {
            return a[0];
        }

        if (a[1] > a[2]) {
            int temp = a[1];
            a[1] = a[2];
            a[2] = temp;
        }

        return a[1];
    }

    public static void swapIfGreater(int[] a) {
        if (a.length < 2) {
            System.out.println("Tabellen har færre enn to elementer.");
            return;
        }

        if (a[0] > a[1]) {
            int temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }
    }
}
