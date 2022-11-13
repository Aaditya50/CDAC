class MergeSort{
    public static void main(String[] args){
        int[] arr = {3,5,2,6,1,9,4,8,10};
        display(arr);
        int[] ans =  MergeSort(arr,0,arr.length-1);
        System.out.println("\nAfter MergeSort Sorting");
        display(ans);

    }
    public static void display(int[] arr){
        for(int a:arr) System.out.print(a+" ");
    }
    public static int[] MergeSort(int[] arr,int i,int j){
        if(i==j) {
            int[] ans = new int[1];
            ans[0] = arr[i];
            return ans;
        }
        int mid = (i+j)/2;
        int[] n1 = MergeSort(arr,i,mid);
        int[] n2 = MergeSort(arr,mid+1,j);
        int[] res = MergeTwoSortedArrays(n1,n2);
        return res;

    }

    public static int[] MergeTwoSortedArrays(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int k=0;
        int i=0,j=0;
        int[] ans = new int[n1+n2];
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }else if(arr1[i]>arr2[j]){
                ans[k]=arr2[j];
                k++;
                j++;
            }  
        }
        while(i<n1){ 
            ans[k]=arr1[i];
            k++;i++;    
        }
        while(j<n2){
            ans[k]=arr2[j];
            j++;k++;
        }
        return ans;

    }

}