class Solution {
    public boolean isPalindrome(int x) {
        int numeroinvertido = 0;
        int number = x;

        if (x<0){
            return false;
        }

        while (x!=0){
            int temporal = x%10;
            numeroinvertido = numeroinvertido * 10 + temporal;
            x = x/10;
        }

        return number==numeroinvertido;
    }
}