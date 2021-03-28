package JianzhiOffer;

import java.util.Arrays;

public class Offer_56_1_singleNumbers {
    public int[] singleNumbers(int[] nums) {
        int[] res = new int[2];
        Arrays.sort(nums);
        int n = 0;
        for (int i = 0; i < nums.length-1; i++) {
             if (nums[i] == nums[i+1]) i++;
             else {
                 res[n] = nums[i];
                 n++;
             }
             if (n == 2) break;
        }
        if (n == 1) res[n] = nums[nums.length-1];
        return res;
    }
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = nums[0];
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) i = i + 2;
            else {
                res = nums[i];
                break;
            }
        }
        if(res == -1) {
            res = nums[nums.length-1];
        }
        return res;
    }
}
