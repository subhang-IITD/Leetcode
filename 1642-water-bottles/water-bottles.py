class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        
        full = numBottles
        e = 0
        total = 0

        total+= numBottles
        e+=numBottles
        full=0

        while e>= numExchange:
            e -= numExchange
            full+= 1
            
            if full>0:
                total+= full
                e += full
                full = 0
                
            
        return total