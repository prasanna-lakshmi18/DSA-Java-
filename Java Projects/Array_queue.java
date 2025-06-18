import java.lang.*;
import java.util.*;

class Array_queue{
    
    public static void Remov(Queue<String> Tasks){
        Scanner sc=new Scanner(System.in);
        if(!Tasks.isEmpty()){
            System.out.print(Tasks.peek()+" is Done? ::");
            String Stat=sc.nextLine();
            System.out.println();
            if(Stat.equals("Done")){
                System.out.println(Tasks.remove());
            }
            Remov(Tasks);
        }
        else{
            System.out.println("Hurray! You have done all the tasks.");
        }
    }
    
    
    public static void main(String[] args) {
        Queue<String> Tasks=new ArrayDeque<>();
        Queue<Integer> Suc_Tasks=new ArrayDeque<>();
        System.out.println("Enter the tasks to performed:");
        boolean sta=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Y if you want to add task.\nAny key otherwise.!");
        String S=sc.nextLine();
        while(sta){
            if(S.equals("Y")){
                String Tas=sc.nextLine();
                Tasks.add(Tas);
                System.out.println("More Tasks..! Enter Y .");
                S="";
                S=sc.nextLine().trim();
            }
            else{
                sta=false;
                Remov(Tasks);
            }
        }
    }
}