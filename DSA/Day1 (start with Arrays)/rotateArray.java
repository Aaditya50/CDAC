import java.util.*;


class rotateArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Limit of Array and Array Element=");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the value of k =");
        int k = scn.nextInt();
        rotateA(arr,k);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    public static void reverseA(int[] arr,int i, int j){
    
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        
    }

    public static void rotateA(int[] arr,int k){
        k=k%arr.length;
        if(k<0){
            k+=arr.length;
        }

        reverseA(arr,0,arr.length-k-1);
        reverseA(arr,arr.length-k,arr.length-1);
        reverseA(arr,0,arr.length-1);
    }
}