class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        def bs(target):
            l = 0
            u = len(nums)
            while l<u:
                mid = l + ((u-l)//2)
                if nums[mid] < target:
                    l = mid + 1
                else:
                    u = mid
            return l
        low, high = bs(target), bs(target+1)-1
        if low <= high:
            return [low,high]
        return [-1,-1]