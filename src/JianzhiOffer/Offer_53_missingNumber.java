package JianzhiOffer;

public class Offer_53_missingNumber {
    public int missingNumber(int[] nums){
        int len = nums.length;
        int i = 0, j = len - 1;
        while(i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == mid) i = mid + 1;
            else j = mid - 1;
        }
        if (j<0) return 0;
        if (i>=len) return len;
        return nums[j]+1;
    }

    public static void main(String[] args) {
        Offer_53_missingNumber offer_53_missingNumber = new Offer_53_missingNumber();
        int nums[] = {0,1,2,3,4,5,6,7,8};

        System.out.println(offer_53_missingNumber.missingNumber(nums));

    }
}
