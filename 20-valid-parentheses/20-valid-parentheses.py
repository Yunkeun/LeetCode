class Solution:
    def isValid(self, s: str) -> bool:
        leftBrackets = ['(', '{', '[']
        rightBrackets = [')', '}', ']']
        stack = []
        for i in range(len(s)):
            if i == 0 and s[i] in rightBrackets:
                return False
            if s[i] in leftBrackets:
                stack.append(s[i])
                continue
            if not stack:
                return False
            if rightBrackets.index(s[i]) != leftBrackets.index(stack[-1]):
                return False
            else:
                stack.pop()
        if not stack:
            return True
        return False