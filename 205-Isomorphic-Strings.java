class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> h = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            if(h.containsKey(c)) {
                if(h.get(c) != t.charAt(i))
                    return false;
            } else {
                if(h.containsValue(t.charAt(i)))
                    return false;
                h.put(c, t.charAt(i));
            }
            
        }
        
        return true;
        
    }
}