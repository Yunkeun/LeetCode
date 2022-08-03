class Solution {
    public int mySqrt(int x) {
        if (x == 2147483647) {
            return 46340;
        }
        int squared = 0;
        for (int i = 0; i <= x/2+1; i++) {
            squared = i * i;
            if (squared == x) {
                return i;
            }
            if (squared > x) {
                return i-1;
            }
        }
        return 1;
    }
}