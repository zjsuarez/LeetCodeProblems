class Solution {
    public int maxDistinct(String s) {
        int count = 0;


        Map<Character,Integer> map = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {

            if(!map.containsKey(s.charAt(i))){

                map.put(s.charAt(i),map.size());

                count++;

            }

        }

        return count;
    }
}