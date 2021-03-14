package JianzhiOffer;

public class Offer_42_maxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if (maxSum < nums[0]) maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + dp[i-1] < nums[i]) dp[i] = nums[i];
            else dp[i] = dp[i-1] + nums[i];
            if (maxSum < dp[i]) maxSum = dp[i];
        }
        return maxSum;
    }
}
