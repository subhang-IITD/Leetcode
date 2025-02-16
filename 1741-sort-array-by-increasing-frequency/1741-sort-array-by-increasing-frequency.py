import heapq
from collections import Counter
class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        heap  = []
        counted = Counter(nums)
        for num ,freq in counted.items():
            heapq.heappush(heap,(freq,-num))

        result = []
        while(len(heap)>0):
            tup = heapq.heappop(heap)
            freq =tup[0]
            num = -tup[1]
            for i in range(freq):
                result.append(num)
        
        return result