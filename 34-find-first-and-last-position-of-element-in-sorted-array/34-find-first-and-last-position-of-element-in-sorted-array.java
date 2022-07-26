class Solution {
    
    public static void reverse(int[] arr)
    {
        int i=0,j=arr.length-1,temp;
        while(i<j)
        {
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            i++;
            j--;
        }
    }
    
    public int BinarySearch(int[] arr, int t) {
		int s = 0, e = arr.length-1,res=-1;
		int mid = s + (e - s) / 2;
		while (s <= e) {
		
			if (arr[mid] == t)
				{
                    res= mid;
                    e=mid-1;
                }
			else if (arr[mid] > t)
				e = mid - 1;
			else if (arr[mid] < t)
				s = mid + 1;
			mid = s + (e - s) / 2;
		}
        
		return res;

	}
    public int BinarySearchD(int[] arr, int t) {
		int s = 0, e = arr.length-1,res=-1;
		int mid = s + (e - s) / 2;
		while (s <= e) {
		
			if (arr[mid] == t)
            {
                res= mid;
                e=mid-1;
            }
			else if (arr[mid] < t)
				e = mid - 1;
			else if (arr[mid] > t)
				s = mid + 1;
			mid = s + (e - s) / 2;
		}
		return res;

	}
    
    
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        res[0] = BinarySearch(nums, target);
        reverse(nums);
        res[1]= ( BinarySearchD(nums, target) >=0)?nums.length-1 - BinarySearchD(nums, target)  : -1;
        
        return res;
    }
}