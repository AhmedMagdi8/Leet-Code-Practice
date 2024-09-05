class Solution {
    // solution 1
    // public int subarraySum(int[] nums, int k) {
    //     int ans = 0;
    //     int temp = 0;
    //     for(int i = 0; i < nums.length; i++) {
    //         int sum = nums[i];
    //         if(sum == k) {
    //             ans++;
    //         }
    //         for(int j = i + 1; j < nums.length; j++) {
    //             sum += nums[j];
    //             if(sum == k) {
    //                 ans++;
    //             }
    //         }
    //     }

    //     return ans;
    // }
    // solution 2
    public int subarraySum(int[] nums, int k) {
    int ans = 0;
    int sum = 0;
    HashMap<Integer, Integer> h = new HashMap<>();
    h.put(0,1);

    for(int i = 0; i < nums.length; i++) {
        sum += nums[i];
        if(h.containsKey(sum - k)) {
            ans += h.get(sum - k);
        }
        h.put(sum, h.getOrDefault(sum, 0) + 1);
    }

    return ans;
    }

}