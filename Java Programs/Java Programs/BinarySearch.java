class BinarySearch{
    public static void main(String[] args){
        int[] arr={1,4,8,9,10};
        int l=0;
        int h=4;
        int target=8;
        int mid=l+(h-l)/2;
        boolean flag=false;
        while(l<=h){
            mid=l+(h-l)/2;
            if(target==arr[mid]){
                flag=true;
                System.out.println("Target found at "+mid);
                break;
            }
            else if(target>arr[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        if(!flag){
            System.out.println("Target not found");
        }

    }
}