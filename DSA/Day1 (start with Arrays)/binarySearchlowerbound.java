import java.util.*;

class binarySearchlowerbound{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Limit of Array and Array Element=");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter element want to search = ");
        int m =scn.nextInt();
        binarySearchlowerbound(arr,m);
        
    }

    public static void binarySearchlowerbound(int[] arr,int m){
        int j=arr.length-1;
        int i=0;
        int fi=-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]<m){
                i=mid+1;
            }else if(arr[mid]>m){
                j=mid-1;
            }else{
                fi=mid;
                j=mid-1;
            }
        }
        System.out.println(fi);

    }
}