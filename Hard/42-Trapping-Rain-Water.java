class Solution {
    public int trap(int[] height) {
        int res = 0;


        for (int i = 0; i < height.length; i++) {
            boolean barr = false;
            int count = 0;
            for (int j = i+1; j < height.length; j++) {
                if (height[i]>height[j]) {
                    count+=height[i]-height[j];
                } else{
                    barr = true;
                }
                if(barr){
                    for (int k = i; k < j; k++) {
                        height[k]=height[i];
                    }
                    res+=count;
                    break;

                }
            }
        }

        for(int i = 0; i < height.length / 2; i++)
        {
            int temp = height[i];
            height[i] = height[height.length - i - 1];
            height[height.length - i - 1] = temp;
        }

        for (int i = 0; i < height.length; i++) {
            boolean barr = false;
            int count = 0;
            for (int j = i+1; j < height.length; j++) {
                if (height[i]>height[j]) {
                    count+=height[i]-height[j];
                } else{
                    barr = true;
                }
                if(barr){
                    for (int k = i; k < j; k++) {
                        height[k]=height[i];
                    }
                    res+=count;
                    break;

                }
            }
        }







        return res;
    }
}