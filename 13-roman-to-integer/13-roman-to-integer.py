class Solution:
    def toInt(self, symbol: str) -> int:
        if symbol == 'I':
            return 1
        if symbol == 'V':
            return 5
        if symbol == 'X':
            return 10
        if symbol == 'L':
            return 50
        if symbol == 'C':
            return 100
        if symbol == 'D':
            return 500
        if symbol == 'M':
            return 1000
        return 0

    def romanToInt(self, s: str) -> int:
        sum = 0
        for i in range(0, len(s)-1):
            if self.toInt(s[i]) < self.toInt(s[i+1]):
                sum -= self.toInt(s[i])
            else:
                sum += self.toInt(s[i])
        return sum + self.toInt(s[-1])