
//Oppgave 1)
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

import static java.util.Collections.swap;

public class oblig1 {
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
}

/* Denne maks-metoden er dårligere enn den som ble brukt tidligere siden den er mindre effektiv og tar mer
 tid å kunne utføre pga strl på arrayet.
*/

        
//Oppgave 2)

    public static int antallUlikeSortert(int[] a) {
        if (a.length == 0) {
            return 0;
        }
//ser vis tabellen er tom
        if (!sortert(a)) {
            throw new IllegalStateException("Tabellen er ikke sortert stigende i stigende rekkefølge!");
        }
        int ulikeVerdier = 1;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != a[i - 1]) { //ser antall ulike elementer i arrayet
                ulikeVerdier++;
            }
        }
        return ulikeVerdier;
    }

private static boolean sortert(int[] a) {
    return false;
}

//Oppgave 3)

    public static int antallUlikeUsortert(int[] a) {

        if (a.length == 0)
            return 0;     //sjekker om tabellen er tom

        int antallUlike = 1;
        boolean sistUnik = true;

        for (int i = 1; i < a.length; i++) { //går gjennom arrayet fra 2. element
            if (a[i] > a[i - 1]) {
                if (sistUnik) {
                    antallUlike++;
                    sistUnik = false;
                }
            } else if (a[i] == a[i - 1]) {
                sistUnik = true;
            } else {
                antallUlike++;
                sistUnik = false;
            }
        }

        return antallUlike;
    }


//Oppgave 4)

public static void delSortering(int[] a) {
    if (a == null || a.length == 0) {
        return; //sjekker om array er null eller tom
    }

    //blir delt i hver side av arrayet, partall og odetall
    int left = 0;
    int right = a.length - 1;

    while (left < right) {
        //finne partallet
        while (left < right && a[left] % 2 != 0) {
            left++;
        }

        //finne odetallet
        while (left < right && a[right] % 2 == 0) {
            right--;
        }

        if (left < right) {
            swap(Collections.singletonList(a), left, right);
            left++;
            right--;
        }
    }

    //sorterer partallet og odetallet
    Arrays.sort(a, 0, left);
    Arrays.sort(a, left, a.length);
}

//Oppgave 5)

public static void rotasjon(char[] a) {
    if (a == null || a.length <= 1) {
        return; //roterer ikke vis det er null elementer

        //lagrer aller siste elemnt i array
        char last = a[a.length - 1];


        //flytter elemtnene 1 posisjon til høyre
        System.arraycopy(a, 0, a, 1, a.length - 1);

        //siste element ligger i 1 posisjon
        a[0] = last;
    }
}

//Oppgave 7)
public static String flett(String s, String t) {
    String resultat = "";
    int index; //variabel for fletting

    if (s.length() >= t.length()) {
        index = t.length(); //lengden på t som indeksen
    } else  {
        index = s.length(); //lengde på s som indeks
    }

    //gått gjennom alle indeks fra 0 til valgt index
    for(int i=0; i<index; i++){
        resultat += s.substring(i, i+1) + t.substring(i, i+1);
    }
    //s<t, legg til resten av t, s>t, legg til resten av s
    if(s.length() < t.length()) resultat += t.substring(s.length());
    if(s.length() > t.length()) resultat += s.substring(t.length());

    //retur av resultat
    return resultat;
}

public static String flett(String... s) {
    String resultat = "";
    int totalLength = 0;

    //beregner total lengden av strengene
    for (String str : s) {
        totalLength += str.length();
    }

    //gpr gjennom tegnene i alle strenger
    for (int i = 0; i < totalLength; i++) {
        // Finn den første strengen som har et tegn igjen
        int j = 0;
        while (j < s.length && s[j].isEmpty()) {
            j++;
        }

        //neste tegnet fra denne strengen til resultatet
        resultat += s[j].charAt(i % s[j].length());
    }

    return resultat;
}













