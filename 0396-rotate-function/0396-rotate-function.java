class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        long sum = 0;
        long rotationSum = 0;

        for(int i = 0; i < n; i++){
            sum += nums[i];
            rotationSum += (long) i * nums[i]; 
        }
        long max = rotationSum;
        for(int k = 1; k < n; k++){
            rotationSum = rotationSum + sum - (long) n * nums[n-k];
            max = Math.max(max , rotationSum);
        }
        return (int) max;
        
    }
}