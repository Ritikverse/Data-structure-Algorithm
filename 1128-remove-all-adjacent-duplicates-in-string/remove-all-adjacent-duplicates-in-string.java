class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty() || stack.peek() != s.charAt(i) ){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        String str = "";
        while(!stack.isEmpty()){

            str = str + stack.pop();
        }
        return new StringBuilder(str).reverse().toString();
    }
}