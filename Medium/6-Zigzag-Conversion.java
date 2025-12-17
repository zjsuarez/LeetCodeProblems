class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<3) return s;

        String [][] arr = new String[numRows][s.length()];
        int pos = 0;
        int col = 0;

        String res = "";

        loop1:
        while(pos<s.length()){
            for (int i = 0; i < numRows; i++) {
                arr[i][col] = ""+s.charAt(pos);
                pos++;
                if(pos>=s.length()) break loop1;
            }
            int row = numRows-2;
            col++;
            while(row<=numRows-2 && row>= 1){
                arr[row][col] = ""+s.charAt(pos);
                pos++;
                if(pos>=s.length()) break loop1;
                row--;
                col++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]!=null) res= res+arr[i][j];
            }
        }
        return res;
    }
}