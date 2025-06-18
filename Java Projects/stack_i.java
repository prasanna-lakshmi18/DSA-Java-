import java.lang.*;
import java.util.*;

class stack_i{
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        //st.pop();
        int sts=st.pop();
        st.push(sts);
        st.push(sts+1);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.search(30));
        System.out.println(st.empty());
    }
}