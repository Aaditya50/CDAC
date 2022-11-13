


class spiralDisplay{
    public static void main(String[] args){
        N=
        int[][] arr = { {1,2,3,4},       
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}  
                      };

        spiralDisplay(arr);
    }

    public static void spiralDisplay(int[][] arr){
        int left = 0;  
        int right = arr[0].length;
        int top = 1;
        int bottom = arr.length; 
        int last = right*bottom;
        int count=0;
        // int[][] ans = new int[right][bottom];
        right--;bottom--;   
        
        while(count<last){ 

            for(int i=left;i<=right && count<last;i++){
                System.out.print(arr[left][i]+" "); 
                count++;
            }
        
            for(int i=top;i<=bottom && count<last;i++){
                System.out.print(arr[i][right]+" "); 
                count++;
            }

            for(int i=right-1;i>=left && count<last;i--){
                System.out.print(arr[bottom][i]+" ");
                count++;
            }

            for(int i=bottom-1;i>=top && count<last;i--){ 2 1 
                System.out.print(arr[i][left]+" "); 
                count++;
            }
            left++;top++;right--;bottom--;
           
        }

    }

    public static void display(int[][] ans){
        for(int i=0)
    }
}