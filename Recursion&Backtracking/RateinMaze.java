class Solution {
      private void solve(int row, int col, int[][] maze,boolean[][] visited, String path,ArrayList<String> ans) {
          int n = maze.length; 
          //last el m h toh
          if(row== n-1 && col==n-1){
              ans.add(path);
              return;
          }
          visited[row][col] = true;
        //down
        if(isSafe(row+1,col, maze, visited)){
            solve(row+1, col, maze, visited, path +"D", ans);
        }
          //left
              if (isSafe(row, col - 1, maze, visited)) {
            solve(row, col - 1, maze, visited, path + "L", ans);
        }
           //right
           if (isSafe(row, col + 1, maze, visited)) {
            solve(row, col + 1, maze, visited, path + "R", ans);
        }
        //up
        if (isSafe(row - 1, col, maze, visited)) {
            solve(row - 1, col, maze, visited, path + "U", ans);
        }
     
        
      
          // Backtracking
        visited[row][col] = false;
    }  
                       
        private boolean isSafe(int row, int col, int[][] maze,boolean[][] visited) {
          int n = maze.length;
          
        return row>=0  && row< n && col>=0 && col<n && maze[row][col]==1 && !visited[row][col];
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>(); // store the ans
        
        int n = maze.length;
           boolean[][] visited = new boolean[n][n];  //check whether el visted or not
        
        if(maze[0][0]==0 || maze[n-1][n-1]==0){
            return ans;
        }
            solve(0,0,maze,visited, "", ans);
            
            return ans;
        
        
    }
}
