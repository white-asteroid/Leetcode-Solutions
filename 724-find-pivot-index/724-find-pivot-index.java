class Solution {
    public int pivotIndex(int[] arr)  {
		 int i = 0,si=0,sa=0;
        
		 for(int k = 0;k<arr.length;k++)
			 sa+=arr[k];
		 while(i<arr.length)
		 {	
			if(si == sa - si - arr[i] )
                return i;
             si+=arr[i];
			 i++;
		 }
			 
		 return -1;
	        
	    }
}