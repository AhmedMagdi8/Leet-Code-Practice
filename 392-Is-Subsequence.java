class Solution {
    public boolean isSubsequence(String s, String t) {

        char[] arr1 = t.toCharArray();
        char[] arr2 = s.toCharArray();

        int j = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = arr2[i];
            boolean found = false;

            while (j < t.length()) {
                if (c == arr1[j]) {
                    found = true;
                    count++;
                    j++;
                    break;
                }
                j++;
            }

        }
        if (count == s.length())
            return true;
        return false;

    }
}