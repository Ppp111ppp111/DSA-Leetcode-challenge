class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] exampleHeight = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(exampleHeight);
        System.out.println(result);
    }
}