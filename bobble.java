import java.util.*;
class bobble{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)  ;
        System.out.println("Enter the elements in to the array: ");
        int[] arr=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for(int j=0;j<5-i-1;j++){
                if(arr[j+1]<arr[j]){   
                    //If the next element is less than the present one,
                    // it will swap with the next element ,
                    //so that the greater element will be on the right side or the greater side
                    System.out.println(j+"arr[j]"+arr[j]+" j+1 "+j+1+" arr[j]"+arr[j+1]);
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                for(int k=0;k<5;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }

    
    
    }
}