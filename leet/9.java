class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder(Integer.toString(x));
        if(s.toString().equalsIgnoreCase(s.reverse().toString())) return true;
        return false;
    }
}