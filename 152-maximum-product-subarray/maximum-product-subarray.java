class Solution {
    public int maxProduct(int[] nums) {
  if (nums == null || nums.length == 0) {
            return 0; // Return 0 if the array is empty
        }

        int maxProduct = nums[0];  // Initialize the result with the first element
        int currentMax = nums[0];  // Initialize currentMax with the first element
        int currentMin = nums[0];  // Initialize currentMin with the first element

        // Traverse the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is negative, swap currentMax and currentMin
            if (nums[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            // Update currentMax and currentMin
            currentMax = Math.max(nums[i], currentMax * nums[i]);//6

            currentMin = Math.min(nums[i], currentMin * nums[i]);//3

            // Update maxProduct
            maxProduct = Math.max(maxProduct, currentMax);//6
        }

        return maxProduct;      
    }
}