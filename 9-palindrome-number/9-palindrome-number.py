class Solution:
    def toReverse(self, x: str) -> str:
        newWord = ''
        for c in reversed(x):
            newWord += c
        return newWord
    
    def isPalindrome(self, x: int) -> bool:
        reversedWord = self.toReverse(str(x))
        if str(x) == reversedWord:
            return True
        return False