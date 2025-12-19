class Solution {
    public String countAndSay(int n) {


        String rle = "1";

        for (int i = 1; i < n; i++) {
            rle = rle(rle);
        }

        return rle;
    }

    public String rle(String n) {
        StringBuilder str = new StringBuilder();

        int count = 0;
        char ch = n.charAt(0);
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i)!=ch){
                str.append(count);
                str.append(ch);
                ch = n.charAt(i);
                count = 0;
            }
            count++;
        }
        str.append(count);
        str.append(ch);
        ch = n.charAt(n.length()-1);

        return str.toString();
    }

}