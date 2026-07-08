class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            int dis = j-i;
            int curHeight= Math.min(heights[i],heights[j])*dis;
            max = Math.max(max,curHeight);
            if(heights[i]<heights[j]) i++;
            else j--;
        }
        return max;
    }
}
