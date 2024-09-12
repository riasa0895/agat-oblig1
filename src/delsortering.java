import java.util.Arrays;

import static java.util.Collections.swap;

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
            swap(a, left, right);
            left++;
            right--;
        }
    }

    //sorterer partallet og odetallet
    Arrays.sort(a, 0, left);
    Arrays.sort(a, left, a.length);
}

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



