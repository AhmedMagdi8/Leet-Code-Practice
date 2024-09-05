class Solution {
    public int maximumDifference(int[] nums) {

        int[] arr = new int[nums.length];
        int max_def = 0;

        int left = 0;
        int right = 1;
        while(right < nums.length) {
            if(nums[right] > nums[left]) {
                if(nums[right] - nums[left] > max_def) {
                    max_def  = nums[right] - nums[left];
                }
                right += 1;
            } else {
                left = right;
                right = right + 1;
            }
    
        }



        if(max_def == 0)
            return -1;
        else
            return max_def;
    }
}