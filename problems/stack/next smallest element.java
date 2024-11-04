public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:A){
            if(!st.isEmpty() && st.peek() < num)
             arr.add(st.peek());
            else{
                while(!st.isEmpty() && st.peek() >= num)
                st.pop();
                
                if(!st.isEmpty())arr.add(st.peek());
                else arr.add(-1);
            }
            st.push(num);
        }
        return arr;
    }
}
