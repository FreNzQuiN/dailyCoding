class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            int kurang = target-nums[i];
            if(sum.containsKey(kurang) && sum.get(kurang)!=i){
                return new int[]{i, sum.get(kurang)};
            }
        }
        return new int[]{};
    }
}