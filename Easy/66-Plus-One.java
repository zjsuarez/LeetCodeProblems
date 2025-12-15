class Solution {
    public int[] plusOne(int[] digits) {
        boolean allnines = true;
        for (int i = 0; i < digits.length; i++) {
            if(digits[i]!=9){
                allnines=false;
            }
        }
        if (allnines) {
            digits = new int[digits.length+1];
            digits[0]=1;
        } else{
            digits[digits.length-1]+=1;
            if(digits[digits.length-1]==10){
                for (int i = 1; i < digits.length; i++) {
                    digits[digits.length-1-i]+=digits[digits.length-i]/10;
                    if(digits[digits.length-i]==10) digits[digits.length-i]=0;
                }
            }
        }
        return digits;

    }
}