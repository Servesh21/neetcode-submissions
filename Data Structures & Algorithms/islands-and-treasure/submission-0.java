class Pair{
    int row,col,dis;
    Pair(int r,int c,int d){
        this.row = r;
        this.col =c;
        this.dis = d;
    }
}

class Solution {
    
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] vis = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 0){
                    q.offer(new Pair(i,j,0));
                    vis[i][j] = 1;
                }
            }
        }
        int[] dRow = new int[]{-1,0,1,0};
        int[] dCol = new int[]{0,1,0,-1};
        while(!q.isEmpty()){
            int row = q.peek().row , col = q.peek().col,dis = q.peek().dis;
            q.poll();
            for(int i=0;i<4;i++){
                int nrow = row +dRow[i],ncol = col + dCol[i];
                if(nrow >=0 && nrow < n && ncol >=0 && ncol <m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == Integer.MAX_VALUE){
                    q.offer(new Pair(nrow,ncol,dis+1));
                    grid[nrow][ncol] = dis+1;
                    vis[nrow][ncol] =1;
                }
            }
        }
        
    }
}
