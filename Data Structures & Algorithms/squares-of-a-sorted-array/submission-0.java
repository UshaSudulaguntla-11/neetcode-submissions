class Solution {
    public int[] sortedSquares(int[] nums) {
            int n=nums.length;
            int[]a=new int[n];
            int left=0;
            int right=n-1;
            int mid=n-1;
            while(left<=right){
                int val1=nums[left]*nums[left];
                int val2=nums[right]*nums[right];
                if(val1<val2){
                    a[mid]=val2;
                    right--;
                }
                else{
                    a[mid]=val1;
                    left++;
                }
                mid--;
            }
        return a;
    }
}