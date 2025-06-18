import java.util.*;
//import java.lang.*;
class Student_Management_System{
    public static void Entry_fee(int Entry,HashMap<String,Integer> User_details){//LR -- Login/Register
        Scanner sc=new Scanner(System.in);
        int entry=Entry;
        HashMap<String,Integer> US_s=new HashMap<>();
        if (Entry == 0){
            System.out.print("Enter your id(Please Enter atleast 3characters)");
            String User_name=sc.nextLine();
            int Status=sc.nextInt();
            System.out.print("\nEnter 1 -- Student \n2 -- Faculty \n Choose( 1 or 2 ):  ");
            if(User_details.containsKey(User_name)){
                System.out.print("Enter your id(Please Enter atleast 3characters)");
            }
            else{
                User_details.put(User_name,Status);
            }
        }
        else{
            System.out.print("Enter your id:");
            String user=sc.nextLine();
            if(User_details.containsKey(user)){
                int num=User_details.get(user);
                Details(num);
            } 
            else{
                System.out.print("Enter valid id");
                Entry_fee(Entry,User_details);
            }
        }
    }
    public static void Details(int Status){
        if(Status==1){
            Student();
        }
        else{
            Faculty();
        }

    }
    public static void Student(){
        //User_details.get

    }
    public static void Faculty(){
        //public HashMap<String,Array

    }
    
    public static void main(String[] args){
        HashMap<String,Integer> User_details=new HashMap<>();
        System.out.println("Login | Register\nEnter 1 for Login 0 for Register");
        Scanner sc=new Scanner(System.in);
        int Entry=sc.nextInt();
        Entry_fee(Entry, User_details);
    }
}