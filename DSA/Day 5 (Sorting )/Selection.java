class Selection{
    public static void main(String[] args){
        int[] arr = {3,5,2,6,1,9,4,8};
        display(arr);
        Selection(arr);
        System.out.println("\nAfter Selection Sorting");
        display(arr);

    }
    public static void display(int[] arr){
        for(int a:arr) System.out.print(a+" ");
    }
    public static void Selection(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[idx]){
                    idx=j;
                }
            }
            swap(arr,i,idx);
        }

    }

    public static void swap(int[] arr,int i,int j){
        
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        
    }
}