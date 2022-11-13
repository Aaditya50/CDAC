class RecursionMinMax{
    public static void main(String[] args){
        int[] arr  = {1,2,3,4,5,6,7,8,9};
        System.out.println("min = "+ RecursionMin(arr,0));
        System.out.println("max = "+ RecursionMax(arr,0));
    }

    public static int RecursionMin(int[] arr,int i){
        if(i==arr.length-1) return arr[i];
        int min=RecursionMin(arr,i+1);
        if(arr[i]<min) min=arr[i];
        return min;
    }

    public static int RecursionMax(int[] arr,int i){
        if(i==arr.length-1) return arr[i];
        int max=RecursionMax(arr,i+1);
        if(arr[i]>max) max=arr[i];
        return max;
    }
}