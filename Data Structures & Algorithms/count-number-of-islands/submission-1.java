class Pair{
    int row,col;
    Pair(int r,int c){
        this.row = r;
        this.col = c;
    }
}
class Solution {
    public void bfs(int r,int c, int[][] vis,char[][] grid){
         int n = grid.length,m = grid[0].length;
         Queue<Pair> q = new LinkedList<>();
         q.offer(new Pair(r,c));
         vis[r][c] =1;
         int[] dRow = new int[]{-1,0,1,0};
         int[] dCol = new int[]{0,1,0,-1};
         while(!q.isEmpty()){
            int row = q.peek().row,col= q.peek().col;
            q.poll();
         for(int i=0;i<4;i++){
            int nr = row+dRow[i],nc = col + dCol[i];
            if(nr >=0 && nc >=0 && nr < n && nc < m && vis[nr][nc] == 0 && grid[nr][nc] == '1'){
                q.offer(new Pair(nr,nc));
                vis[nr][nc] = 1;
            }
         }
         }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length,m = grid[0].length;
        int[][] vis= new int[n][m];
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && vis[i][j] ==0){
                    bfs(i,j,vis,grid);
                    count++;
                }
            }
        }
        return count;
    }
}
