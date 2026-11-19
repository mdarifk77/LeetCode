class Solution {
    public long interchangeableRectangles(int[][] rectangles) {

        Map <String ,Long> map = new HashMap<>();
        long count = 0;

        for(int [] rectangle : rectangles){
            int width = rectangle[0];
            int height = rectangle[1];

            int gcd = findGCD(width, height);
            int w = width/gcd;
            int h = height/gcd;

            String key = w +":"+ h;
            count += map.getOrDefault(key , 0L);
            map.put(key, map.getOrDefault(key, 0L)+1);
        }
        return count;
    }
    private int findGCD(int a , int b){
        while(b !=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}