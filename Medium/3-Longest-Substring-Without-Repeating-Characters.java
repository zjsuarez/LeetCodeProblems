class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder str = new StringBuilder();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            loop2:
            for (int j = i; j < s.length(); j++) {

                for (int k = 0; k < str.length(); k++) {
                    if(s.charAt(j)==str.charAt(k)) break loop2;
                }
                str.append(s.charAt(j));
            }

            if(str.length()>max){
                max = str.length();
            }
            str = new StringBuilder();
        }


        return max;
    }
}