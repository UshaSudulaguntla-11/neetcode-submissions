class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        
        int maxSeen = -1;
        
        for (int i = n - 1; i >= 0; i--) {
            result[i] = maxSeen;
            if (arr[i] > maxSeen) {
                maxSeen = arr[i];
            }
        }
        
        return result;
    }
}
