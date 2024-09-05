class Solution {
    public int findMaxLength(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                nums[i] = -1;
        }
        int sum = 0;
        int len = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0,-1);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
// [1,1,-1,-1,-1,-1,-1,-1,1,1]
//  (0, -1) (1, 0) (2, 1) 2 3 (-1,4) (-2, 5) (-3, 6) (-4, 7) 8 9 
            if(h.containsKey(sum)) {
                len = Math.max(len, i - h.get(sum));
            }
            if(!h.containsKey(sum))
                h.put(sum, i);

        }
        return len;
    }
}





            // how many ranges their sum is their half length
            // if(h.containsKey(len/2 - sum )) {
            //     ans = h.get(len/2 - sum ) * 2;
            //     System.out.println(h.get(len/2 - sum));
            //     System.out.println(i +\   \+ h.get(len/2-sum) +\ \+ ans);
            // }
            //h.put(sum, h.getOrDefault(sum,0) + 1);