class Solution {
    public char findTheDifference(String s, String t) {

        // XOR APPROACH :

        char ans = 0;

        for(int i = 0; i < s.length(); i++){
            ans ^= s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++){
            ans ^= t.charAt(i);
        }
        return ans;  

        // COUNT ARRAY : 

        // int [] count = new int [26];

        // for(int i = 0; i < s.length(); i++){
        //     count[s.charAt(i) - 'a']++;
        // }
        // for(int i = 0; i < t.length(); i++){
        //     count[t.charAt(i) - 'a']--;

        //     if(count[t.charAt(i) - 'a'] < 0){
        //         return t.charAt(i);
        //     }
        // }
        // return ' ';
    }
}   