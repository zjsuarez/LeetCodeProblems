class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] res = new int[nums.length];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<pivot){
                res[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==pivot){
                res[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>pivot){
                res[index] = nums[i];
                index++;
            }
        }



        return res;
    }
}