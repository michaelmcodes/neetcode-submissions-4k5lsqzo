class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        int j = 0;
        for(char c : sArray){
            if(c != tArray[j]){
                return false;
            }
            j++;
        }
        return true;
    }
}
