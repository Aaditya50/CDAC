class zerosandones{
    public static void main(String[] args){
        int[] arr = {0,1,0,2,1,1,0,2,0,1,2,0,1,0};
        int i=0,j=arr.length-1,k=0;
       
    //Sorting 0 and 1


        // while(i<j){
        //     if(arr[i]==1){
        //         if(arr[j]!=1){
        //             // arr[j] = arr[i]+arr[j];
        //             // arr[i] = arr[j]-arr[i];
        //             // arr[j] = arr[j]-arr[i];

        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //         j--;
        //     }else i++;
        // }



    // Sorting 0 , 1 and 2
        while(k<=j){
            if(arr[k]==0){
                arr[k]=arr[i];
                arr[i]=0;
                i++;
            }
            if(arr[k]==2){
                arr[k]=arr[j];
                arr[j]=2;
                j--;
                k--;
            }
            k++;
        }
        for(int x:arr){
            System.out.print(x);
        }
    }
}