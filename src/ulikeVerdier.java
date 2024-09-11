public class ulikeVerdier {
    public static int antallUlikeSortert(int[] a) {
        if (a.length == 0)
            return 0;
        {
        }
        if (!sortert(a)) {
            throw new IllegalStateException("Tabellen er ikke sortert stigende i stigende rekkefølge!");
        }
        int ulikeVerdier = 1;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != a[i - 1]) {
                ulikeVerdier++;
            }
        }
        return ulikeVerdier;
    }
}
