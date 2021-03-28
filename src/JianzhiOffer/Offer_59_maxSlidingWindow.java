package JianzhiOffer;

public class Offer_59_maxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i + k -1 < nums.length; i++) {
            res[i] = nums[i];
            for (int  j = 0; j < k; j++) {
                if (nums[i+j] > res[i]) res[i] = nums[i+j];
            }
        }
//        res[0] = nums[0];
//        for (int j = 1; j < k; j++) {
//            if (res[0] < nums[j]) res[0] = nums[j];
//        }
//        for (int i = k; i < nums.length; i++)
//            res[i-k+1] = nums[i] > res[i-k] ? nums[i] : res[i-k];
        return res;
    }
}
