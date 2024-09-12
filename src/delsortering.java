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
