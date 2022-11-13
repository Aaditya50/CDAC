class fibonacci{
    public static void main(String[] args){
        
        
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n){
        if(n==0 || n==1) return n;
        
        int f1=fibonacci(n-1);
        int f2=fibonacci(n-2);
        
        return f1+f2;  

    }   

}
