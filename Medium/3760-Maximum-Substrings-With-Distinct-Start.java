class Solution {
    public int maxDistinct(String s) {
        int count = 0;

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),1);
        }



        return map.size();
    }
}