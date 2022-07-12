class Solution {
    public int removeDuplicates(int[] arr) {
        int j = 0;
        for(int i = 1;i<=arr.length;i++)
        {
            if(!(i<arr.length && arr[i] == arr[i-1]))
            {
               arr[j] = arr[i - 1];
                j++;    
            }
        }
        
        return j;
    }
}