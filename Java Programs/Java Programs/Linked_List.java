import java.util.*;
class Linked_List{
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println("Linked List elements: "+ll);
        ll.addFirst(5);
        int res=0;
        ll.addLast(40);
        System.err.println("Linked List elements: "+ll);
        System.err.println(ll.size()+" is the Length of Linked List");
        for(int i=0;i<ll.size();i++){
            res=res+ll.get(i);
        }
        System.out.println("Linked List elements sum:"+res);
        
    }
}