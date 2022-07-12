class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int h= arr.length - 1;
        ArrayList<Integer> arrli  = new ArrayList<Integer>();
        int mid = l + (h-l)/2,pos=-1;
        
          while(l<=h)
            {   
            
             mid = l + (h-l)/2;
             if(arr[h]<x) 
             {
                 mid = h;
                 break;
             }
              else if (arr[0] > x)
              {
                  mid = l;
                  break;
              }
            if(arr[mid] == x)
            {
                break;
            }
             if (arr[mid] <= x && arr[mid+1] > x) // main border
                break;
            else if(arr[mid] > x)
                h=mid-1;
            else if(arr[mid]<x)
                l= mid+1;
            
        }
        // System.out.println(mid);
        // pos = mid;
        int s =mid, e=mid+1;
        if(mid == arr.length - 1) // if x is greater than largest element in array
        {
            int i = arr.length -k ; 
            while(i<arr.length)
            {
                arrli.add(arr[i]);
                i++;
            }
            return arrli;
        }
        for(int i =0;i<k;i++)
        {
            
            if(s>=0 && e < arr.length && Math.abs(arr[s]-x) <= Math.abs(arr[e]-x) )
            {
                arrli.add(0,arr[s]);
                //add in front
                s--; 
            }
            else 
            if(s>=0 && e < arr.length && Math.abs(arr[s]-x) > Math.abs(arr[e]-x) )
            {
                arrli.add(arr[e]);    
                // add in last
                e++;
            }
            
            else if(s >= 0 && e >= arr.length )
                {
                    arrli.add(0,arr[s]);    
                    s--;    
                }
            else if(s<0 && e<arr.length){
                 arrli.add(arr[e]); 
                e++;
               
            }
        }
       
        return arrli;
    }
}