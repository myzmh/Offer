package JianzhiOffer;

import java.util.Arrays;

public class Offer_40_getLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] ret = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++){
            ret[i] = arr[i];
        }
        return ret;
    }
}
