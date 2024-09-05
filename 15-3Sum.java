class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> lst = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();
        
        // Sort the array
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    
                    // Add to result list if it's not a duplicate
                    if (seen.add(triplet)) {
                        lst.add(triplet);
                    }
                    
                    // Move pointers to the next different elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return lst;

    }
}