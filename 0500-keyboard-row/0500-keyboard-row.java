class Solution {
    public String[] findWords(String[] words) {

        Set<Character> row1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));

        Set<Character> row2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));

        Set<Character> row3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));

        List<String> ans = new ArrayList<>();
        for(String word : words){
            String lower = word.toLowerCase();

            Set<Character> row;
            char first = lower.charAt(0);
            if(row1.contains(first)){
                row = row1;
            }
            else if(row2.contains(first)){
                row = row2;
            }
            else{
                row = row3;
            }
            boolean valid = true;
            for(int i = 0; i < lower.length(); i++){
                char ch = lower.charAt(i);
                if(row.contains(ch) == false){
                    valid = false;
                    break;
                }
            }
             if(valid){
                    ans.add(word);
            }
        }
        return ans.toArray(new String[0]);
        
    }
}