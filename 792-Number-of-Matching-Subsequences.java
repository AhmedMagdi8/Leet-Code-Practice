import java.util.*;

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        
        // Create a map to store the indices of each character in s
        Map<Character, List<Integer>> charIndicesMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charIndicesMap.computeIfAbsent(c, k -> new ArrayList<>()).add(i);
        }
        
        // Check each word to see if it is a subsequence of s
        for (String word : words) {
            if (isSubsequence(word, charIndicesMap)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isSubsequence(String word, Map<Character, List<Integer>> charIndicesMap) {
        int prevIndex = -1;
        
        for (char c : word.toCharArray()) {
            if (!charIndicesMap.containsKey(c)) {
                return false;
            }
            
            List<Integer> indices = charIndicesMap.get(c);
            int nextIndex = Collections.binarySearch(indices, prevIndex + 1);
            
            if (nextIndex < 0) {
                nextIndex = -nextIndex - 1;
            }
            
            if (nextIndex >= indices.size()) {
                return false;
            }
            
            prevIndex = indices.get(nextIndex);
        }
        
        return true;
    }
}