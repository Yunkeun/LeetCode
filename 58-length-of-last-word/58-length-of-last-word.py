class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        words = s.split(' ')
        for i in range(len(words)-1, 0, -1):
            if words[i] == '':
                continue
            return len(words[i])
        return len(words[0])