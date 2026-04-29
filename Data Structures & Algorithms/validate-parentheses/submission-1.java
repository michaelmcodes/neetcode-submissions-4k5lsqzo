class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> group = new HashMap<>();
        group.put(')', '(');
        group.put('}', '{');
        group.put(']', '[');

        for(char c: s.toCharArray()){
            if(group.containsKey(c)) {
                if(!stack.isEmpty() && stack.peek() == group.get(c)){
                    stack.pop();
                } else {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
