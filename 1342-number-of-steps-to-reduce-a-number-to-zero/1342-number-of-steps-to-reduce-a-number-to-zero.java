class Solution {
    public int numberOfStepsRec(int n , int c)
    {
        if(n==0)
            return c;
        if(n%2==0)
            return numberOfStepsRec(n/2,++c);
        else
            return numberOfStepsRec(n-1,++c);
    }
    public int numberOfSteps(int n) {
        return numberOfStepsRec(n,0);
    }
}