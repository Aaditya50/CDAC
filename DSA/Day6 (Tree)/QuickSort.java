class QuickSort{
    public static void main(String[] args){
        int[] arr = {4,2,6,1,7,9,3,5};
        // int pivot = 3;
        QuickSort(arr,0,arr.length-1);
        display(arr);
    }

    public static void QuickSort(int[] arr,int lo,int hi){
        if(lo>hi) return;
        int pivot = arr[hi];
        int pi = PartitionArray(arr,pivot,lo,hi);
        QuickSort(arr,lo,pi-1);
        QuickSort(arr,pi+1,hi);
    }

    public static int PartitionArray(int[] arr,int pivot,int lo,int hi){
        int c1 = lo,c2 = lo;
        while(c1<=hi){
            if(arr[c1]<=pivot){
                swap(arr,c1,c2);
                c1++;
                c2++;
            }else {
                c1++;
            }
        }
        return (c2-1);

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