class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sumlist = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates,0,sumlist,res,target);
        return res;
    }
    public void dfs(int[] candidates,int index,List<Integer> sumlist, List<List<Integer>> res,int target){
        if(target == 0) {
            res.add(new ArrayList<>(sumlist));
            return;
        }
        for(int i = index; i< candidates.length;i++){
            if(i>index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i]>target) break;
            sumlist.add(candidates[i]);
            dfs(candidates,i+1,sumlist,res,target-candidates[i]);
            sumlist.remove(sumlist.size() - 1 );
        }

    }
}
