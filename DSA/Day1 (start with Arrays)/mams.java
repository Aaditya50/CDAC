import java.util.*;
class mams{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1= new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = scn.nextInt();
        }
        int[] arr2= new int[n1];
        for(int i=0;i<n1;i++){
            arr2[i] = scn.nextInt();
        }
        int[] ans = new int[n1];
        for(int i=0;i<arr1.length;i++){
            ans[i]=arr1[i]+arr2[i];
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}