class Insertion{
    public static void main(String[] args){
        int[] arr = {3,5,2,6,1,9,4,8};
        display(arr);
        Insertion(arr);
        System.out.println("\nAfter Insertion Sorting");
        display(arr);

    }
    public static void display(int[] arr){
        for(int a:arr) System.out.print(a+" ");
    }
    public static void Insertion(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }else{
                    break;
                }
            }
        }

    }

    public static void swap(int[] arr,int i,int j){
        
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        
    }
}