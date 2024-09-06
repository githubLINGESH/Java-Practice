import java.util.*;

class Path{
    ArrayList<String> path = new ArrayList<String>();
    void RoboRec(int[][] a,int r,int c,String s, int n, int[][] v){
        
        if(r==n-1 && c==n-1){
            path.add(s);
            return;
        }

        v[r][c] = 1;

        if(r+1<=n-1 && a[r+1][c]==1 && v[r+1][c]==0){
            RoboRec(a,r+1,c,s+"D",n,v);
        }
        if(c-1>=0 && a[r][c-1]==1 && v[r][c-1]==0){
            RoboRec(a,r,c-1,s+"L",n,v);
        }
        if(r-1>=0 && a[r-1][c]==1 && v[r-1][c]==0){
            RoboRec(a,r-1,c,s+"U",n,v);
        }
        if(c+1<=n-1 && a[r][c+1]==1 && v[r][c+1]==0){
            RoboRec(a,r,c+1,s+"R",n,v);
        }
        v[r][c] = 0;
    }

    ArrayList<String> getPath(int[][] a, int n){
        int[][] v = new int[n][n];

        if(a[0][0]==0){
            path.add("Invalid Path");
            return path;
        }

        String s = "";
        RoboRec(a,0,0,s,n,v);

        return path;
    }
}
class RoboMaze{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Path p = new Path();
        int[][] a = {
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 1, 1, 0},
            {0, 1, 1, 1},
        };

        int n = a.length;

        ArrayList<String> path = p.getPath(a,n);
        String pa = String.join(" ",path);
        System.out.println(pa);

    }
}