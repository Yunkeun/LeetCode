class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort(key=len)
        if not strs[0]:
            return ''
        comparison = strs[0][0]
        prefix = ''
        for i in range(len(strs[0])):
            comparison = strs[0][i]
            for word in strs:
                if word[i] != comparison:
                    return prefix
            prefix += comparison
        return prefix
                