class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        Map<Character, Integer> romawi = new HashMap<>();
        romawi.put('I',1);
        romawi.put('V',5);
        romawi.put('X',10);
        romawi.put('L',50);
        romawi.put('C',100);
        romawi.put('D',500);
        romawi.put('M',1000);
        int hasil=0;
        int prevVal=0;

        for(int i=s.length()-1;i>=0;i--){
            char currentChar=s.charAt(i);
            int currentVal=romawi.get(currentChar);
            if(currentVal<prevVal) hasil -= currentVal;
            else hasil +=currentVal;
            prevVal=currentVal;
        }
        return hasil;
    }
    
}