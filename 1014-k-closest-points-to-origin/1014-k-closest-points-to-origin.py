import heapq
class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        heap = []
        for i in range(len(points)):
            distance = points[i][0]**2 + points[i][1]**2
            heapq.heappush(heap,(-distance,points[i]))

            if(len(heap)>k):
                heapq.heappop(heap)
            
        result = []
        while(len(heap)>0):
            out = heapq.heappop(heap)
            result.append(out[1])
        return result