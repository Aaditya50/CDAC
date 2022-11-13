import java.util.*;

class Fibonacci{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Limit for fibonacci series");
        int n = scn.nextInt();
        int a=0,b=1;
        if(n<1) return; 
        System.out.print(a+" ");
        for(int i=2;i<=n;i++){
            System.out.print(b+" ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}