class Solution {
    public int minSubArrayLen(int target, int[] nums) {
int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int currentSum = 0;

        // Sliding window approach
        for (int right = 0; right < n; right++) {
            currentSum += nums[right];  // Expand the window by adding the current element

            // Shrink the window from the left while the sum is greater than or equal to target
            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);  // Update the minimal length
                currentSum -= nums[left];  // Shrink the window from the left
                left++;
            }
        }

        // If minLength is unchanged, no such subarray exists, return 0
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;

   
        
    }
}