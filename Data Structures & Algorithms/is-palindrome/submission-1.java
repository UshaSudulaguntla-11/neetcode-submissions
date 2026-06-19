class Solution {
    public boolean isPalindrome(String s) {
         String result = s.toLowerCase().replaceAll("[^a-z0-9]", "");
         char[] Array = result.toCharArray();
         int left=0;
        int right=Array.length-1;
        while(left<right){
            if(Array[left]!=Array[right]){
                return false;
            }
            left++;
            right--;
        
        }
         return true;
    }
}
