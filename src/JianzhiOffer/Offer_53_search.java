package JianzhiOffer;

public class Offer_53_search {
    public int search(int[] nums, int target){
        int left, right;
        int i = 0, j = nums.length - 1;

        while(i < j){
            int mid = (i + j) / 2;
            if (nums[mid] > target) j = mid - 1;
            else if (nums[mid] <= target) i = mid + 1;
        }
        right = i;
        if (j > 0 && nums[j] > target) return 0;
        i = 0; j = nums.length - 1;

        while (i < j){
            int mid = (i + j) / 2;
            if (nums[mid] >= target) j = mid - 1;
            else i = mid + 1;
        }
        left = j;

        return right - left - 1;
    }

    public static void main(String[] args) {
        int[] nums ;
    }
}
