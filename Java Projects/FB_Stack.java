import java.lang.*;
import java.util.*;

class FB_Stack{
    public static void Pre(Stack<Integer> pre,Stack<Integer> nex,String str){
        if(str.equals("NEXT") && nex.empty()==false){
            next(pre,nex);
        }
        else if(str.equals("PREVIOUS") && pre.empty()==false){
            previous(pre,nex);
        }
        else{
            cancel(pre,nex);
        }

    }
    public static void previous(Stack<Integer> pre,Stack<Integer> nex){
        int st_p=pre.pop();
        nex.push(st_p);
        System.out.println(st_p-1);
        reenter(pre,nex);
    }
    public static void next(Stack<Integer> pre,Stack<Integer> nex){
        int st_n=pre.pop();
        pre.push(st_n);
        pre.push(st_n+1);
        nex.push(st_n+1);
        System.out.println(st_n+1);
        reenter(pre,nex);
    }
    public static void cancel(Stack<Integer> pre,Stack<Integer> nex){
        pre.clear();
        nex.clear();
        System.out.println("You are out of the page");
    }
    public static void reenter(Stack<Integer> pre,Stack<Integer> nex){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Pre(pre,nex,str); 
    }
    public static void main(String[] args){
        Stack<Integer> pre=new Stack<>();
        Stack<Integer> nex=new Stack<>();
        pre.push(1);
        nex.push(1);
        System.out.println(pre);
        System.out.println(nex);        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ----- NEXT ----- if you want to go to next page\nEnter ------ PREVIOUS ------- if you want to go to previous page\nEnter ------ CANCEL ------- if you want to exit the page");
        String str=sc.nextLine();
        Pre(pre,nex,str);
    }
}