class Solution {
    public boolean isPowerOfFour(int n) {
        double x = Math.log(n) / Math.log(4);
        if(x%1==0)
            return true;
        return false;
        
    }
}