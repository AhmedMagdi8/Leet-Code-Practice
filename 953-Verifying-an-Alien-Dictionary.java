import java.util.HashMap;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> h = new HashMap<>();
        
        for (int i = 0; i < order.length(); i++) {
            h.put(order.charAt(i), i);
        }
        
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            
            if (!isOrdered(word1, word2, h)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isOrdered(String word1, String word2, HashMap<Character, Integer> orderMap) {
        int len = Math.min(word1.length(), word2.length());
        
        for (int j = 0; j < len; j++) {
            char first = word1.charAt(j);
            char second = word2.charAt(j);
            
            int orderFirst = orderMap.get(first);
            int orderSecond = orderMap.get(second);
            
            if (orderFirst < orderSecond) {
                return true;
            } else if (orderFirst > orderSecond) {
                return false;
            }
        }
        
        return word1.length() <= word2.length();
    }
}
