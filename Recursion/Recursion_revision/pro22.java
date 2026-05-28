import java.util.*;

public class pro22 {
    public static void main(String[] args) {
        pro22 obj = new pro22();
    
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
    
        ArrayList<String> result = obj.ratInMaze(maze);
    
        if (result.size() == 0) {
            System.out.println("No Path Found");
        } else {
            for (String path : result) {
                System.out.println(path);
            }
        }
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> list = new ArrayList<String>();
        int n = maze.length;
        boolean[][] visit = new boolean[n][n];

        helper(0, 0, n, maze, "", visit, list);
        Collections.sort(list); 
        return list;
    }

    public void helper(int r, int c, int n, int[][] maze, String path,
                       boolean[][] visit, ArrayList<String> list) {

        if (r < 0 || c < 0 || r >= n || c >= n || maze[r][c] == 0 || visit[r][c]) {
            return;
        }

        if (r == n - 1 && c == n - 1) {
            list.add(path);
            return;
        }

        visit[r][c] = true;

        helper(r + 1, c, n, maze, path + "D", visit, list); 
        helper(r, c - 1, n, maze, path + "L", visit, list); 
        helper(r, c + 1, n, maze, path + "R", visit, list);
        helper(r - 1, c, n, maze, path + "U", visit, list);

        visit[r][c] = false;
    }

   
}
