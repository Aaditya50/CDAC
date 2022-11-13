class ReverseString{
    
    public static void reverse(char[] s,int i,int j){
        if(i==j) return;
        char ch=s[i];
        reverse(s,i+1,j);
        System.out.print(ch);
        
    }

    public static void main(String[] args){
        String s = "Aaditya";
        char[] c = s.toCharArray();
        int n = c.length;
        reverse(c,0,n);
    }
}