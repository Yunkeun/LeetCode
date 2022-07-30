class Solution:
    def insertInOrder(self, nums: List[int], target: int) -> int:
        for i in range(len(nums)):
            if nums[i] > target:
                return i
        return len(nums)
        
    def searchInsert(self, nums: List[int], target: int) -> int:
        if not target in nums:
            return self.insertInOrder(nums, target)
        return nums.index(target)