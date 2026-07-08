class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> mp = new HashSet<>();
        for(int x:nums){
            mp.add(x);
        }
        int sequence=0;
        for(int i=0;i<nums.length;i++){
            int streak=0,curr=nums[i];
            while(mp.contains(curr)){
                streak++;
                curr++;
            }
            sequence = Math.max(streak,sequence);
        }
        return sequence;
    }
}
