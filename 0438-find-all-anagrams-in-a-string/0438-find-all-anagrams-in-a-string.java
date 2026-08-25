class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if(p.length() > s.length()){
            return ans;
        }
        int[] freqs = new int[26];
        int[] freqp = new int[26];

        for(int i = 0; i < p.length(); i++){
            freqs[s.charAt(i) - 'a']++;
            freqp[p.charAt(i) - 'a']++;
        }

        if(matches(freqs, freqp)){
            ans.add(0);
        }

        for(int right = p.length(); right < s.length(); right++){
            freqs[s.charAt(right) - 'a']++;
            freqs[s.charAt(right - p.length()) - 'a']--;

            if(matches(freqs, freqp)){
                ans.add(right - p.length() + 1);
            }
        }
        return ans;

    }
    private boolean matches(int[] a, int[] b){
        for(int i =0; i < 26; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}