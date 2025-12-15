class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].isEmpty()){
            return ("");
        }
        String[][] values = new String[strs.length][];

        for (int i = 0; i < strs.length; i++) {
            values[i] = strs[i].split("");
        }

        StringBuilder res = new StringBuilder();
        boolean done = false;
        for (int i = 0; i < values[0].length; i++) {
            res.append(values[0][i]);
            for (int j = 0; j < values.length-1; j++) {
                try{
                    if(!values[j][i].equals(values[j+1][i])){
                        res.deleteCharAt(i);
                        done = true;
                        break;
                    }
                } catch (Exception e){
                    res.deleteCharAt(i);
                    done = true;
                    break;
                }

            }
            if(done) break;
        }

        return res.toString();
    }

}