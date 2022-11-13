class MergeTwoSortedArrays{
    public static void main(String[] args){
        int[] arr1 = {1,3,5,6,8};
        int[] arr2 = {2,4,7,9,10};
        display(arr1); 
        System.out.println();
        display(arr2);
        int[] ans = MergeTwoSortedArrays(arr1,arr2);
        System.out.println("\nAfter Merging Sorting");
        display(ans); 
        

    }
    public static void display(int[] arr){
        for(int a:arr) System.out.print(a+" ");
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

    public static void swap(int[] arr,int i,int j){
        
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        
    }
}