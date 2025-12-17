class Solution {
    public String convert(String s, int numRows) {

        List<String> [] arr = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new ArrayList<>();
        }

        String res = "";

        int pos = 0;

        loop1:
        while(pos<s.length()){
            for (int i = 0; i < numRows; i++) {
                arr[i].add(""+s.charAt(pos));
                pos++;
                if(pos>=s.length()) break loop1;
            }

            int row = numRows-2;
            while(row<=numRows-2 && row>= 1){
                arr[row].add(""+s.charAt(pos));
                pos++;
                if(pos>=s.length()) break loop1;
                row--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].size(); j++) {
                res= res+arr[i].get(j);
            }
        }

        return res;
    }
}