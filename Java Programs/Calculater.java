import java.util.*;

class calculater{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int res;//to store result of the operation
        int num1;
        int num2;
        System.out.println("Enter Number1");
        num1=sc.nextInt();
        System.out.println("Enter number1");
        num2=sc.nextInt();
        System.out.println("Enter the choice of operation");
        System.out.println("1.Add\n2.sub\n3.mul\n4.div\n");
        int choi=sc.nextInt();
        switch (choi) {
            case 1:
                res=num1+num2;
                System.out.println(res);
                break;
            case 2:
                res=num1-num2;
                System.out.println(res);
                break;
            case 3:
                res=num1*num2;
                System.out.println(res);
                break;
            case 4:
                res=num1/num2;
                System.out.println(res);
                break;
            default:
                System.out.println("Invalid choice");
                throw new AssertionError();
        }

    }
}
