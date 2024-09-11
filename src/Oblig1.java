import java.util.NoSuchElementException;

public static int maks(int[] a) {
    if (a.length == 0) {
        throw new NoSuchElementException("Tabellen er tom!");
    }
    for (int i = 0; i < a.length - 1; i++) {
        if (a[i] > a[i + 1]) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
    }
    return a[a.length - 1];
}

