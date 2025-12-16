class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str = "";
        int max = 0;


        int pos = 0;
        for (int i = pos; i < s.length(); i++) {
            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(j)==s.charAt(i)){
                    if(str.length()>max) max = str.length();
                    str = "";
                    break;
                }

            }
            str = str + s.charAt(i);
            pos++;
        }

        return max;
    }
}