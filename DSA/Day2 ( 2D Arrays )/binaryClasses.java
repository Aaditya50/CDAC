import java.util.*;

class binary{
    public static void binarySearch(int[] arr,int m){
        int j=arr.length-1;
        int i=0;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]<m){
                i=mid+1;
            }else if(arr[mid]>m){
                j=mid-1;
            }else{
                System.out.println("Found at = "+mid);
                return;
            }
        }
        System.out.println(-1);

    }
}

class binaryClasses{
    public static void main(String[] args){
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter the Limit of Array and Array Element=");
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = scn.nextInt();
        // }
        // System.out.println("Enter element want to search = ");
        // int m =scn.nextInt();
        binary b = new binary();

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int m = 6;
        b.binarySearch(arr,m);
        
    }
}
