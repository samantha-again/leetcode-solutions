class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length; 
        if (length < 2) {
            return new int[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (target - current == nums[j]) {
                    int[] arr = {i, j};
                    return arr;
                }
            }
        }
        return new int[0];
    }
}
