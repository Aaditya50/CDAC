import java.util.*;


class linearSearch{
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
        linear(arr,m);
        
    }

    public static void linear(int[] arr,int m){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==m){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }
}