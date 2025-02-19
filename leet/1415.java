class Solution {
    public String getHappyString(int n, int k) {
        List<String> happyStrings = generateHappyStrings(n);
        Collections.sort(happyStrings);

        if (k > happyStrings.size()) {
            return "";
        } else {
            return happyStrings.get(k - 1);
        }
    }

    private List<String> generateHappyStrings(int n) {
        List<String> result = new ArrayList<>();
        generateHappyStringsRecursive(n, "", result);
        return result;
    }

    private void generateHappyStringsRecursive(int n, String current, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }

        for (char c : "abc".toCharArray()) {
            if (current.isEmpty() || current.charAt(current.length() - 1) != c) {
                generateHappyStringsRecursive(n, current + c, result);
            }
        }
    }

    public static void main(String[] args) {
        Solution hs = new Solution();
        System.out.println(hs.getHappyString(1, 3)); // Output: c
        System.out.println(hs.getHappyString(1, 4)); // Output: 
        System.out.println(hs.getHappyString(3, 9)); // Output: cab
    }
}
