import heapq
class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        heap = []
        for i in range(len(arr)):
            heapq.heappush(heap,(-abs(x-arr[i]),-arr[i]))

            if(len(heap)>k):
                heapq.heappop(heap)
            
        min_heap = []
        while heap:
            heapq.heappush(min_heap, -heapq.heappop(heap)[1])  
        result = []
        while min_heap:
            result.append(heapq.heappop(min_heap))

        return result