class findindexofno{
    public static void main(String[] args){
        int[] arr  = {1,2,3,4,5,6,7,8,9};
        System.out.println("index = "+ findindexofno(arr,0,6));
    }

    public static int findindexofno(int[] arr,int i,int val){
        if(i==arr.length) return -1;
        
        if(arr[i]==val) return i;
        
        return findindexofno(arr,i+1,val);
    }   

}
