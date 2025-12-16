class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str = "";
        int max = 0;

        int l = 0; int r = 0;
        loop:
        while(true)
        {
            str = s.substring(l,r);
            for (int i = 0; i < str.length(); i++) {
                for (int j = i+1; j < str.length(); j++) {
                    if(str.charAt(i)==str.charAt(j)){
                        l++;
                        continue loop;
                    }

                }
            }
            if(str.length()>max) max = str.length();
            if(r==s.length()){
                break;
            }
            r++;
        }
        return max;
    }
}