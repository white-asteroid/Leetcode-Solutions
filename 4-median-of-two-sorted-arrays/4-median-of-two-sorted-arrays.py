class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1 += nums2
        nums1.sort()
        if len(nums1) %2 == 1:
            return nums1[len(nums1)//2] / 1
        mid = len(nums1)//2
        return (nums1[mid-1] + nums1[mid]) / 2
