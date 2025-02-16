import heapq
from collections import Counter
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        heap = []
        counted = Counter(nums)
        for num, freq in counted.items():
            heapq.heappush(heap,(freq,num))

            if(len(heap)>k):
                heapq.heappop(heap)
        result = []
        while(len(heap)>0):
            result.append(heapq.heappop(heap)[1])
        return result[::-1]
