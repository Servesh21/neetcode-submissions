class Solution {
    public int maxRate(int[] piles){
        int max=0;
        for(int x:piles){
            max = Math.max(x,max);
        }
        return max;
    }
    public int calcHours(int[] piles, int mid){
        int totalhours =0;
        for(int x:piles){
            totalhours += Math.ceil((double)x/mid);
        }
        return totalhours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high = maxRate(piles);
        int res=0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(calcHours(piles,mid)<=h){
                high = mid-1;
                res=mid; 
            }else{
                low = mid+1;
            }
        }
        return res;

    }
}
