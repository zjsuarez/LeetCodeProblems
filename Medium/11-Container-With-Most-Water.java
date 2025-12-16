class Solution {
    public int maxArea(int[] height) {
        int max = 0;

        int l = 0;
        int r = height.length-1;

        while(l<r){
            int min = Math.min(height[l],height[r]);
            if((Math.min(height[l],height[r]) * (r-l))>max) max = (Math.min(height[l],height[r]) * (r-l));

            while(l < r && height[l] <= min) l++;
            while(l < r && height[r] <= min) r--;
        }



        return max ;
    }
}