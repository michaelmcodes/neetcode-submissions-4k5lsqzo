class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            char[] sArray = s.toCharArray();
            for(char c : sArray){
                count[c - 'a'] +=1;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<String>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
