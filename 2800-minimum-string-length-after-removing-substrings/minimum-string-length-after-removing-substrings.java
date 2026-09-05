class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
       
        for(int i=0 ; i<s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                 stack.push(c);
            }
            else if(stack.peek()=='A' && c == 'B'){
                stack.pop();
            }
            else if(stack.peek()=='C' && c == 'D'){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        String str ="";
        while(!stack.isEmpty()){
            str = str + stack.pop();
        }
        return str.length();
    }
}