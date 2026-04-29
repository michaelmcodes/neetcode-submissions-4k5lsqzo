class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0, r = clean.length() - 1;

        while(r > l){
            if(clean.charAt(l) != clean.charAt(r)){ return false; }
            l++;
            r--;
        }
        return true;
    }
}
