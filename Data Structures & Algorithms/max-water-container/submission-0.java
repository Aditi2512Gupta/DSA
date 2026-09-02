class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0, r = n - 1;
        int maxWater = 0;

        while(l < r) {
            int w = r - l;
            int ht = Math.min(heights[l], heights[r]);
            int currWater = ht * w;
            maxWater = Math.max(maxWater, currWater);

            if(heights[l] < heights[r])
                l++;

            else
                r--;
        }

        return maxWater;
    }
}
