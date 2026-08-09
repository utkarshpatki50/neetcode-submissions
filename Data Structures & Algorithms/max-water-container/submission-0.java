class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0, right = n - 1;
        int maxProduct = 0;

        while (left <= right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            maxProduct = Math.max(maxProduct, area);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxProduct;
    }
}
