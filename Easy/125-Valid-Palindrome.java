class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean=new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if (ch>='a' && ch<='z'){
                clean.append(ch);
            }else if(ch>='A' && ch<='Z'){
                ch=(char)(ch-'A'+'a');
                clean.append(ch);
            }
            else if(ch>='0' && ch<='9'){
                clean.append(ch);
            }
        }
        if(clean.length()<= 1) return true;

        for (int i = 0; i < clean.length()/2; i++) {
            if(clean.charAt(i)!=clean.charAt(clean.length()-1-i)) return false;;
        }


        return true;


    }
}