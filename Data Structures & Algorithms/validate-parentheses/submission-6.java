class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> map = Map.of(
    ')', '(',
    ']', '[',
    '}', '{'
);

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(map.get(ch)!=stack.pop()){
                    return false;
                }
               
            }
        }

        return stack.isEmpty();

    }
}
