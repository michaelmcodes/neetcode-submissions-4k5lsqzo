class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        for(int i=0; i < s.length(); i++){
            Set<Character> subString = new HashSet<>();
            for(int j=i; j < s.length(); j++){
                if(subString.contains(s.charAt(j))){
                    break;
                }
                subString.add(s.charAt(j));
            }
            res = Math.max(res, subString.size());
        }
        return res;
    }
}
