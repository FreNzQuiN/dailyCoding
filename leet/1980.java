class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<String> set = new HashSet<>();
        for (String num : nums) {
            set.add(num);
        }
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    sb.append('1');
                } else {
                    sb.append('0');
                }
            }
            String s = sb.toString();
            if (!set.contains(s)) {
                return s;
            }
        }
        return "";
    }

    public String findDifferentBinaryStringCantor(String[] nums) {
        int n = nums.length;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = nums[i].charAt(i);
            result.append(c == '0' ? '1' : '0');
        }
        return result.toString();
    }
}
