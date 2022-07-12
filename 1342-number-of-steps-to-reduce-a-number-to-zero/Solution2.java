class Solution {
    public int firstMissingPositive(int[] arr) {
         // ArrayList<Integer> arrli = new ArrayList<Integer>(arr.length);
        
        for(int i =0;i<arr.length;i++)
        {
            int cor = arr[i]-1;
            if(arr[i]>0 && arr[i]<= arr.length && arr[i]!=arr[cor])
            {
                swap(arr,i,cor);
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i =0;i<arr.length;i++)
        {
            
            if(arr[i]!=i+1)
                return i+1;
        }
        
        
        return arr.length+1;
        
        
    }
     public void swap(int[] arr,int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
