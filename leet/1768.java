class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int len = Math.min(word1.length(), word2.length());
        for(int i=0; i<len; i++) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }
        res.append(word1.substring(len));
        res.append(word2.substring(len));
        return res.toString();
    }
}