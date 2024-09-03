class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++) {
            int[] arr = matrix[i];
            int nextIndex = Arrays.binarySearch(arr, target);
            if(nextIndex >= 0 && nextIndex < arr.length)
                return true;
        }
        
        return false;
    }
}