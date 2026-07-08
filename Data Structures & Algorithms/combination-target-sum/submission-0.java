class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combinationSum(nums,0,ds,res,target);
        return res;
    }
    public void combinationSum(int[] nums,int i,List<Integer> ds,List<List<Integer>> res,int target){
        if(i == nums.length){
        if(target == 0){
            res.add(new ArrayList<>(ds));
            
        }
        return;
        }
        if(nums[i] <= target){
            ds.add(nums[i]);
            int newtarget = target - nums[i];
            combinationSum(nums,i,ds,res,newtarget);
            ds.remove(ds.size() -1);
        }
        combinationSum(nums,i+1,ds,res,target);

    }
}
