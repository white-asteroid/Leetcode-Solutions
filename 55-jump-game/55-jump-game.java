class Solution {
    public boolean canJump(int[] arr) {
        if(arr.length == 1)
            return true;
        if(arr[0]==0)
            return false;
        int limit= arr[0], cj = arr[0]; // 'c'an 'j'ump is the number we can jump
                                        // limit is the index upto which we can jump as of now
        for(int i=0;i<arr.length-1 && i<=limit ;i++){
            cj = Math.max(cj,arr[i]);   //checking if ability to jump(cj) is increased
            limit = i+cj;               // "i" is the current block and cj is power to jump
                                        
            if(i+arr[i] >= arr.length-1 ) 
                return true;
            cj-=1;                      //since we jumped 1 box our ability to jump reduces by 1
        }
        return false;
    }
}