class Solution {
    public boolean validPalindrome(String s) {
        int i = 0; 
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (isPalindrome(s, i + 1, j)) {
                    return true;
                }
                if (isPalindrome(s, i, j - 1)) {
                    return true;
                }
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }

    
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    
}