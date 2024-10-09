class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0]; // At least one element exists, so we start with the first element

        // Traverse the array
        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);  // Either start a new subarray or continue the current one
            maxSum = Math.max(maxSum, currentSum);  // Update maxSum if we found a larger sum
        }

        return maxSum;
    }

    
}