class Solution {
    public int removeDuplicates(int[] nums) {

        int [] copy = new int[nums.length];
        int res = 0;


        for (int i = 0; i < nums.length; i++) {
            if(i!=0){
                if(nums[i-1]==nums[i]) {
                    continue;
                }
            }
            copy[res]=nums[i];
            res++;
        }


        for (int i = 0; i < nums.length; i++) {
            nums[i] = copy[i];
        }

        return res;
    }
}