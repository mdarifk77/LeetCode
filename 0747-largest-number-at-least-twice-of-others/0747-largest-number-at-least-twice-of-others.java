class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > largest){
                sLargest = largest;
                largest = nums[i];
                index = i;
            }
            else if ( nums[i] > sLargest){
                sLargest = nums[i];
            }
        }
        if(largest >= 2 * sLargest){
            return index;
        }
        return -1;
        
    }
}