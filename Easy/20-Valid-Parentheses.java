class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();
        Map <Character, Character> opening = new HashMap<>();
        opening.put(')','(');
        opening.put(']','[');
        opening.put('}','{');
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(opening.containsValue(s.charAt(i))){
                stack.add(stack.size(),s.charAt(i));
                count++;
            } else{
                if(stack.size()==0) return false;
                if(stack.get(stack.size()-1)!=opening.get(s.charAt(i))) return false;
                else {
                    stack.remove(stack.size()-1);
                }
            }
        }

        if(s.length()/2!=count) return false;

        return true;
    }
}