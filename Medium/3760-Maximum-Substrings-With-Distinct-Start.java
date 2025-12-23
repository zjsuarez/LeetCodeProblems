class Solution {
    public int maxDistinct(String s) {
        int count = 0;

        Map<Integer,Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(!map.containsValue(s.charAt(i))){
                map.put(map.size(),s.charAt(i));
                count++;
            }
        }



        return count;
    }
}