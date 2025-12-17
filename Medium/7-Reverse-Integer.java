class Solution {
    public int reverse(int x) {
        Integer num = new Integer(x);
        StringBuilder str = new StringBuilder(num.toString());

        int pos = str.length()-1;
        while(true){
            if(str.charAt(pos)=='0' && x!=0){
                str.deleteCharAt(pos);
                pos--;
            } else{
                break;
            }
        }
        str.reverse();

        if(x<0){
            str.deleteCharAt(str.length()-1);
            try {
                return Integer.parseInt(str.toString())*-1;
            } catch (NumberFormatException e){
                return 0;
            }
        }

        try {
            return Integer.parseInt(str.toString());
        } catch (NumberFormatException e){
            return 0;
        }
    }
}