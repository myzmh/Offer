package JianzhiOffer;

public class Offer_57_twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int i = 0,j = nums.length-1;
        while (i!=j) {
            int sum = nums[i] + nums[j];
            if (sum < target) i++;
            else if (sum > target) j--;
            else {
                res[0] = nums[i];
                res[1] = nums[j];
                break;
            }
        }
        return res;
    }
}
