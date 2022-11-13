class PartitionArray{
    public static void main(String[] args){
        int[] arr = {4,2,6,1,7,9,3,4,5};
        int pivot = 3;
        PartitionArray(arr,pivot);
        display(arr);
    }

    public static void PartitionArray(int[] arr,int pivot){
        int c1 = 0,c2 = 0;
        while(c1<arr.length){
            if(arr[c1]>pivot){
                c1++;
            }else{
                swap(arr,c1,c2);
                c1++;
                c2++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] arr){
        for(int a:arr) System.out.print(a+" ");
    }

}