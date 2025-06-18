import java.util.*;

class Selectionsort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array ::");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int temp_inde=i;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp_inde=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[temp_inde];
            arr[temp_inde]=temp;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        

        
        
    }
}