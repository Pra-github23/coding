class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if n == 0 : return
        if m == 0 :
            i = 0
            while i < n:
                nums1[i] = nums2[i]
                i += 1 
            return

        for i in range(m):
            nums1[len(nums1)-1-i] = nums1[m -1-i]
        
        i =len(nums1) - m
        j = 0
        k =0

        while i < len(nums1) and j < n:

            if nums1[i] < nums2[j]:
                nums1[k] = nums1[i]
                i += 1
            else:
                nums1[k] = nums2[j]
                j += 1
           
            k += 1
        
        while j < n:
            nums1[k] = nums2[j]
            j += 1
            k += 1




        
