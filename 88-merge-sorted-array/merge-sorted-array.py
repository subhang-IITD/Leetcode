class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        last = m+n-1
        left = m-1
        right = n-1

        while right >=0 and left >=0:
            if nums1[left] >= nums2[right]:
                nums1[last] =  nums1[left] 
                last-=1
                left-=1
            else:
                nums1[last] = nums2[right]
                right -=1
                last-=1
            
        while right >=0 :
            nums1[last] = nums2[right]
            last-=1
            right-=1
        
        
        


            



