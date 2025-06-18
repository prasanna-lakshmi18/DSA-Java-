//***************************---------------------------------------LinkedList Implementation------------------------------------------*****************************

class Node{
    int data;
    Node refe;
    
    Node(int data){
        this.data=data;
        this.refe=null;
    }
}

class LinkedList{
    private Node head;
    
    LinkedList(){
        this.head=null;
    }
    public void printList(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            Node current=head;
            while(current!= null){
                System.out.print(current.data+"---->");
                current=current.refe;
            }
            System.out.println("null");
        }
    }
    public void addAtBegin(int data){
        Node newNode=new Node(data);
        newNode.refe=head;
        head=newNode;
    }
}


class LinkedListDemo {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        LinkedList ll=new LinkedList();
        ll.addAtBegin(10);
        ll.addAtBegin(20);
        ll.printList();
    }
}
