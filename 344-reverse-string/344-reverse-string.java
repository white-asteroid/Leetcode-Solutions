class Solution {
    public void reverseString(char[] s) {
        char c;
        int i=0,j=s.length-1;
        while(i<j)
        {
            c=s[i];
            s[i++]=s[j];
            s[j--]=c;
        }
    }
}