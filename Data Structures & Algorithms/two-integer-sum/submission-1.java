class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i =0;i<nums.length;i++){
            int cp = target - nums[i];
            if(map.containsKey(cp) && map.get(cp) != i){
                return new int[]{i,map.get(cp)};
            }
        }
        return new int[]{-1,-1};

    }
}