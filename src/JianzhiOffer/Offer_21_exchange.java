package JianzhiOffer;

public class Offer_21_exchange {
    public int[] exchange(int[] nums){
        int i = 0, j = nums.length - 1;
        while (i < j){
            while(nums[i]%2==1) i++;
            while(nums[j]%2==0) j--;
            if (i<j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        return nums;
    }
}
