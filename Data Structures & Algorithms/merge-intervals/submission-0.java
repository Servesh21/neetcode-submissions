class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals,(a,b) -> (a[0] - b[0]));
        int[] end = intervals[0];
        for(int[] interval:intervals){
            if(end[1] < interval[0])
            {
                merged.add(new int[]{end[0],end[1]});
                end = interval;
            }else{
                end[1] = Math.max(end[1] , interval[1]);

            }
        }
        merged.add(new int[]{end[0],end[1]});
        return merged.toArray(new int[merged.size()][]);
    }
}
