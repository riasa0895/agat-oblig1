public class uSortert {

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
}