class Solution {
    public boolean canJump(int[] arr) {
        if(arr.length == 1)
            return true;
        if(arr[0]==0)
            return false;
        int limit= arr[0], cj = arr[0];
        
        for(int i=0;i<arr.length-1 && i<=limit ;i++){
            cj = Math.max(cj,arr[i]);
           
            limit = i+cj;
             // cj--;
            System.out.println("cj : "+cj+" limit : "+limit+" i : "+i);
            if(i+arr[i] >= arr.length-1 )
                return true;
            
            // if(arr)
            cj-=1;
        }
        return false;
    }
}