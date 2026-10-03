

class Solution {

    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        // i <= n because at i == n we use a virtual height of 0
        for (int i = 0; i <= n; i++) {
    
           
            int currentHeight = (i == n) ? 0 : heights[i];

            // Current bar is smaller, so calculate areas
            // for bars that are no longer able to extend
            while (!stack.isEmpty()
                    && currentHeight <= heights[stack.peek()]) {

                int top = stack.pop();

                // Find width of the rectangle
                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = heights[top] * width;

                maxArea = Math.max(maxArea, area);
            }

            // Don't push the virtual bar
            if (i < n) {
                stack.push(i);
            }
        }

        return maxArea;
    }
}