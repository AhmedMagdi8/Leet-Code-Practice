class Solution {
    public int missingNumber(int[] nums) {
       Arrays.sort(nums);

        int missing = -1;
        
       for(int i = 0; i < nums.length; i++) {
           
           if(nums[i] == i ) {
               continue;
           } else {
               missing = i;
               break;
           }
       }
        
        if(missing == -1) {
            missing = nums.length;
        }
        
        return missing;
    }
}