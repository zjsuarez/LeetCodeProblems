class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}class Solution {
    public int searchInsert(int[] nums, int target) {

        if(target>nums[nums.length-1]) return nums.length;

        for (int i = 0; i < nums.length; i++) {
            if(i!=0){
                if(nums[i-1]<target && nums[i]>=target){
                    return i;
                }
            }
        }
        return 0;
    }

}