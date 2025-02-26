class Solution {
    public boolean isValid(String s) {
        Stack<Character> kurung = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                kurung.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if(kurung.isEmpty()) return false;
                char top = kurung.pop();
                if (c == ')' && top !='(' || c == '}' && top !='{' || c == ']' && top !='[') {
                    return false;
                }
            }
        }
     return kurung.isEmpty();
    }
}