class Solution {
    public int reverse(int x) {
        Integer num = new Integer(x);
        StringBuilder str = new StringBuilder(num.toString());

        str.reverse();

        if(x<0){
            str.deleteCharAt(str.length()-1);
        }

        try {
            if(x<0){
                return Integer.parseInt(str.toString())*-1;
            }
            return Integer.parseInt(str.toString());
        } catch (NumberFormatException e){
            return 0;
        }
    }
}