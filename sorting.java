import java.util.*;

class sorting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            for(int j=0;j<6;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }    
        }
        for(int i=0;i<6;i++){
            System.out.print(arr[i]+" ");
        }

    }
}