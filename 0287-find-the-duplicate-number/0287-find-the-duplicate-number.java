class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int [] freq = new int[n+1];
    
        for(int num : nums){
            freq[num]++;
        }
        for(int i = 0; i < n; i++){
            if (freq[i] >= 2){
                return i;
            }
        }
        return -1;
    }
}