import java.util.*;

class Solution {
    
    private static List<Integer> firstContainNums;
    private static List<Integer> firstNotContainNums;
    
    public int rob(int[] nums) {
        // 첫 집 선택 시, 마지막 집 고려 x
        // 첫 집 선택 dp와 아닌 dp 나누자
        int size = nums.length;
        if (size == 1) {
            return nums[0];
        }
        setNewNums(size, nums);
        return Math.max(robHouse(firstContainNums), robHouse(firstNotContainNums));
    }
    
    private void setNewNums(int size, int[] nums) {
        firstContainNums = new ArrayList<>();
        firstNotContainNums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                firstContainNums.add(nums[i]);
                continue;
            }
            if (i == size-1) {
                firstNotContainNums.add(nums[i]);
                continue;
            }
            firstContainNums.add(nums[i]);
            firstNotContainNums.add(nums[i]);
        }
    }
    
    private int robHouse(List<Integer> nums) {
        int size = nums.size();
        int[] sum = new int[size];
        sum[0] = nums.get(0);
        for (int i = 1; i < size; i++) {
            if (i == 1) {
                sum[1] = Math.max(nums.get(0), nums.get(1));
                continue;
            }
            sum[i] = Math.max(sum[i-1], sum[i-2]+nums.get(i));    
        }
        return sum[size-1];
    }
}
