class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
     Stack<Integer> st = new Stack<>();
     Queue<Integer> qu = new LinkedList<>();
     for(int std : students){
      qu.add(std);
     }   
   
    for(int i = sandwiches.length-1;i >= 0 ;i--){
      st.push(sandwiches[i]);
     }   
     int count =0;
     while(!qu.isEmpty() && count <qu.size()){
        if(qu.peek().equals(st.peek())){
            qu.poll();
            st.pop();
            count =0;
        }else{
           qu.add(qu.poll());
           count ++;
        }
     }
     return qu.size();
    }
}