class Solution:
    def maxFreqSum(self, s: str) -> int:
        counter = Counter(s)
        vowel = set('aeiou')
        max_v = 0
        max_c = 0

        for ch ,val in counter.items():
            if ch in vowel:
                max_v = max(max_v,counter[ch])
            elif ch not in vowel:
                max_c = max(max_c,counter[ch])
        
        return max_v + max_c
