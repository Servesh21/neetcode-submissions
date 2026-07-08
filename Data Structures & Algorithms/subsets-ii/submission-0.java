class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        subsetsWithDup(nums,0,ds,res);
        return res;
    }
    public void subsetsWithDup(int[] nums,int ind,List<Integer> ds,List<List<Integer>> res){
        res.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i> ind && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            subsetsWithDup(nums,i+1,ds,res);
            ds.remove(ds.size() -1);
        }
    }
}
