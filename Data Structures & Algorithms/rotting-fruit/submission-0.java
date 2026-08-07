class Pair{
    int row,col,time;
    Pair(int r,int c, int t){
        this.time = t;
        this.row = r;
        this.col = c;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length,m = grid[0].length;
        int[][] vis = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        int cntFresh = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2 && vis[i][j] == 0 ){
                    q.offer(new Pair(i,j,0));
                    vis[i][j] =1;
                }
                if(grid[i][j] == 1) cntFresh++;
            }
        }
        int[] dRow = new int[]{-1,0,1,0},dCol = new int[]{0,1,0,-1};
        int cnt =0;
        int time = 0;
        while(!q.isEmpty()){
            int r = q.peek().row,c = q.peek().col,t = q.peek().time;
            time = Math.max(t,time);
            q.poll();
            for(int i=0;i<4;i++){
                int nrow = r + dRow[i],ncol = c + dCol[i];
                if(nrow >=0 && nrow < n && ncol >=0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                    q.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol] = 1;
                    cnt++;
                }
            }
        }
        return cnt == cntFresh ? time : -1;

    }
}
