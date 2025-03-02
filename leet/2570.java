class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> arr = new HashMap<>();

        for(int[] num : nums1){
            arr.put(num[0], arr.getOrDefault(num[0],0) + num[1]);
        }
        for(int[] num : nums2){
            arr.put(num[0], arr.getOrDefault(num[0],0) + num[1]);
        }

        List<int[]> resList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : arr.entrySet()) {
            resList.add(new int[] { entry.getKey(), entry.getValue() });
        }

        int[][] result = new int[resList.size()][2];
        for(int i=0;i<resList.size();i++){
            result[i] = resList.get(i);
        }

        Arrays.sort(result, (a, b) -> Integer.compare(a[0],b[0]));
        return result;
    }
}
