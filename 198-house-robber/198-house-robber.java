class Solution {
    public int rob(int[] nums) {
        // [1] => 바로 선택
        // [1, 2] => max(1, 2)
        // [1, 2, 3] => max(1+3, 2)
        // [1, 2, 3, 4] => max(1+3, 2+4, 1+4)
        // [1, 2, 3, 4, 5] => max(이전꺼, 그전꺼+5)
        int size = nums.length;
        int[] sum = new int[size];
        sum[0] = nums[0];
        for (int i = 1; i < size; i++) {
            if (i == 1) {
                sum[1] = Math.max(nums[0], nums[1]);
                continue;
            }
            sum[i] = Math.max(sum[i-1], sum[i-2]+nums[i]);
        }
        return sum[size-1];
    }
}