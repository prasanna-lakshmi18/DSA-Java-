class Merge:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        '''
        i=0
        j=0
        nums1=nums1[0:m]
        nums2=nums2[0:n]
        if nums1 and nums2:
            while i<m:
                if nums1[i]>=nums2[j]:
                    nums1.insert(i,nums2[j])
                    j+=1
                    m+=1
                i+=1
            nums1.extend(nums2[j::])'''
            
        for i, j in enumerate(range(m, m + n)):
            nums1[j] = nums2[i]
        nums1.sort()