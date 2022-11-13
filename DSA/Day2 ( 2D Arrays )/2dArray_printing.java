class multidim_Array_printing{
    public static void main(String[] args){
        int[][] arr = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16} 
                      };

/*

1 2 3 4 
5 6 7 8
9 10 11 12
13 14 15 16

*/


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

/*

1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16

*/
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
/*

1 2 3 4
8 7 6 5 
9 10 11 12
16 15 14 13

*/

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=arr[i].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            
            System.out.println();
        }
        System.out.println();
        System.out.println();


/*

1 5 9 13
14 10 6 2
3 7 11 15
16 12 8 4

*/

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[j][i]+" ");
                }
            }else{
                for(int j=arr[i].length-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
            
            System.out.println();
        }
        System.out.println();
        System.out.println();

        
    }
}