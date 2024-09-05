class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        
        for(int i =0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        
        int ans = 0;
        
        for(Integer i : s) {
            if(s.contains(i - 1)) {
                // if set has the previous value this means this is not the start of seq
                continue;
            }
            
            int len = 0;
            while(s.contains(i)) {
                len++;
                i++;
            }
            
            ans = Math.max(ans,len);
        }
        
        return ans;
    }
}