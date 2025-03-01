class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res = nums;
        for (int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]) {
                res[i] = nums[i] * 2;
                res[i+1]=0;
            } else {
                res[i] = nums[i];
            }
        }
        res[n-1]=nums[n-1];
        int nonZeroIndex = 0;
        for(int i=0;i<n;i++){
            if(res[i]!=0){
                res[nonZeroIndex] = res[i];
                if(i != nonZeroIndex){
                    res[i] = 0;
                }
                nonZeroIndex++;
            }
        }
        return res;
    }
}
