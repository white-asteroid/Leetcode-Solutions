class Solution {
    public boolean isPalindrome(String s) {
            s=s.toLowerCase();
        StringBuilder b=new StringBuilder();
        int f = 1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))|| Character.isLetter(s.charAt(i))){
                b.append(s.charAt(i));
            }
        }
        System.out.println("b is :"+b);
        int n=b.length()-1;
        for(int i=0; i<b.length()/2;i++){
            if(b.charAt(i)!=b.charAt(n-i)) // 1 2 3 3 2 1
                f=0;
        }
        
        // return false;
        
        if(f==0)
            return false;
        else
            return true;
        // return false;
    }
}







// 1 2 3 4 3 2 1