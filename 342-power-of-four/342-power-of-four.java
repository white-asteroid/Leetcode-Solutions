class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0)
            return false;
        if(n==1 || n==4)
            return true;
        double x = Math.log(n) / Math.log(4);
        // System.out.println(x);
        if(x%1==0)
            return true;
        return false;
        
    }
}