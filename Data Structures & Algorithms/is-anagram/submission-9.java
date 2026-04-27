class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){ return false; }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int[] count = new int[26];

        for(int i = 0; i < sArray.length; i++ ){
            count[sArray[i] - 'a']++;
            count[tArray[i] - 'a']--;
        }

        for(int n : count){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}
