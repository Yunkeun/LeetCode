class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        needleSize = len(needle)
        if needleSize == 0:
            return 0
        for i in range(len(haystack)-needleSize+1):
            stack = ''
            for j in range(i, i+needleSize):
                stack += haystack[j]
            if stack == needle:
                return i
        return -1