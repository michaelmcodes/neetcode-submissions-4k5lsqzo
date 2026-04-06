class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for(int i = 0; i < s.length(); i++){
            count[sArray[i] - 'a'] += 1; 
            count[tArray[i] - 'a'] -= 1; 
        }
        
        for(int val : count){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}
