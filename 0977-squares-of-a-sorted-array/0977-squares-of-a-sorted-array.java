class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];

        int left = 0;
        int right = n-1;
        int k = n-1;

        while(left <= right){
            int leftsquare = nums[left] * nums[left];
            int rightsquare = nums[right] * nums[right];
            if(leftsquare > rightsquare){
                ans[k] = leftsquare;
                left++;
            } 
            else{
                ans[k] = rightsquare;
                right--;
            }
            k--;
        }
        return ans;
        
    }
}