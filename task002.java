class mazee
{
    static int N = 4;
    void printsol(int [][] sol)
    {
        for (int i = 0; i < sol.length; i++)
        {
            for (int j = 0; j < sol[i].length; j++)
            {
                System.out.println(" " + sol[i][j] + " ");
            }
        }
    }
    boolean isSafe(int [][]maze, int x, int y)
    {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }
    boolean solve(int [][]maze, int x, int y, int[][] sol)
    {
        if (x == N-1 && y == N-1)
        {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y)== true)
        {
            sol[x][y] =1;
            if (solve(maze, x+1, y, sol))
                return true;
            if (solve(maze, x, y+1, sol))
                return true;

        sol[x][y] =0;
        return false;
        }
        return false;
    }
    boolean path(int [][] maze)
    {
        int[][] sol = {{0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0},};
        if (solve(maze, 0, 0, sol) == false){
            System.out.println("does not exist");
            return false;
        }
        printsol(sol);
        return true;
    }
}
public class task002 {

}
