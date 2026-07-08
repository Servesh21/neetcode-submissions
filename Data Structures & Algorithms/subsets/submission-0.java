class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> db = new ArrayList<>();
        subsets(nums,res,db,0);
        return res;
    }
    public void subsets(int[] nums,List<List<Integer>> res,List<Integer> db,int i){
        if(i >= nums.length){
            res.add(new ArrayList<>(db));
            return;
        }
        db.add(nums[i]);
        subsets(nums,res,db,i+1);
        db.remove(db.size() - 1);
        subsets(nums,res,db,i+1);
    }
}
