import java.util.NoSuchElementException;

public static int maks(int[] a) {
    if (a.length == 0) {
        throw new NoSuchElementException("Tabellen er tom!");
    }
    for (int i = 0; i < a.length - 1; i++) {
        if (a[i] > a[i + 1]) {
            int mid = a[i];
            a[i] = a[i + 1];
            a[i + 1] = mid;
        }
    }
    return a[a.length - 1];
}

/*
(a) Hvor mange sammenlikninger blir det, som en funksjon av n?
antall sammenligninger av funksjonen n utifra arrayet er n-1.

b) Når blir det færrest ombyttinger?
ser ikke ut som det er no færrest ombyttinger siden byttet skjer når arrayet er allerede sortert i stigende rekke.

(c) Når blir det flest ombyttinger?
Flest bytter foregår når arrayet er sortert i synkende rekkefølge. Her skal hvert par av elementer byttes,
så antallet bytte er n - 1.

(d) Hvor mange ombyttinger blir det i gjennomsnitt?
Gjennomsnittlig er antall ombyttinger n/2.
*/

public static int ombyttinger(int[]a) {
    int ombytte = 0;
    for (int i = 0; i < a.length - 1; i++) {
        if (a[i] > a[i + 1]) {
            int mid = a[i];
            a[i] = a[i + 1];
            a[i + 1] = mid;
            ombytte++;               //nåværende element større enn neste, utføres bytte
        }
    }
    return ombytte;

}

/* Denne maks-metoden er dårligere enn den som ble brukt tidligere siden den er mindre effektiv og tar mer
 tid å kunne utføre pga strl på arrayet.
*/







