package JianzhiOffer;

public class Offer_14_cuttingRope {
    public int cuttingRope(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= n;i++){
            int maxV = 0;
            for (int j = 1; j <= i / 2; j++) {
                maxV = maxV > dp[j] * dp[i-j] ? maxV : dp[j] * dp[i-j];
            }
            dp[i] = maxV;
        }
        return dp[n];
    }
}
