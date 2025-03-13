package stack;

import java.util.Stack;

public class StackByUsingCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

//        Insert Element into stack
        st.push(12);
        st.push(13);
        st.push(32); 
        System.out.println(st);
        
        // remove element from stack
        st.pop();
        st.pop();
        
        // to check current topmost element
        System.out.println(st.peek());
        System.out.println(st.peek());
    }
}
