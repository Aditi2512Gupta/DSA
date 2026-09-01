class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int res[] = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];

            while(!stack.isEmpty() && t > stack.peek()[0]) {
                int pairs[] = stack.pop();
                res[pairs[1]] = i - pairs[1];
            }

            stack.push(new int[]{t, i});
        }
        
        return res;
    }
}
