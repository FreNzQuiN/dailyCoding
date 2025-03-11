class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            int now = nums[i];
            if(now != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
