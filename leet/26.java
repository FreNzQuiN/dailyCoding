class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0,j;
        for(j=1;j<n;j++){
            if(nums[i]!=nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}