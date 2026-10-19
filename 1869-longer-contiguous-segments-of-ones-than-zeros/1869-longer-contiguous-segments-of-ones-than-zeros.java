class Solution {
    public boolean checkZeroOnes(String s) {

        int count = 0;
        int max1 = 0;
        int max0 = 0;
        char prev = ' ';

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == prev){
                count++;
            }
            else{
                count = 1;
            }
            if(ch == '1'){
                max1 = Math.max(max1,count);
            }else{
                max0 = Math.max(max0,count);
            }
            prev = ch;
        }  
        return max1 > max0;  
    }
}