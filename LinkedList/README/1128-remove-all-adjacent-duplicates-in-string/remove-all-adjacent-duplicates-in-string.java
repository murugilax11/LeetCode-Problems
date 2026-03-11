class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek() == c){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder s1 = new StringBuilder();
        for(char c: st){
            s1.append(c);
        }
        return s1.toString();
    }
}