

class Solution {
    public int[] plusOne(int[] digits) {


        int [] tabla;
        boolean allnines = true;

        for (int i = 0; i < digits.length; i++) {
            if(digits[i]!=9){
                allnines=false;
            }
        }

        if (allnines) {
            tabla = new int[digits.length+1];
            tabla[0]=1;
            for (int i = 1; i < tabla.length; i++) {
                tabla[i]=0;
            }
        } else{
            tabla=new int[digits.length];

            for (int i = 0; i < tabla.length; i++) {
                tabla[i]=digits[i];
            }

            tabla[digits.length-1]+=1;
            for (int j = 0; j < tabla.length; j++) {
                for (int i = 0; i < tabla.length; i++) {
                    if (tabla[i]==10) {
                        tabla[i]=0;
                        tabla[i-1]+=1;
                    }
                }
            }
        }



        return tabla;

    }
}