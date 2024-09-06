class Nqueens{
    static boolean validate(char[][] board, int r, int c, int n){

        for(int i=0;i<r;i++){
            if(board[i][c]=='Q'){
                return false;
            }
        }

        for(int i=1;i<=r;i++){
            if(c-i>=0 && board[r-i][c-i]=='Q'){
                return false;
            }

            if(c+i<n && board[r-i][c+i]=='Q'){
                return false;
            }
        }

        return true;
    }
    static void solveNQueens(char[][] board,int r, int n){
        if(r==n){
            printBoard(board,n);
            System.out.println();
            return;
        }

        for(int c=0;c<n;c++){
            if(validate(board,r,c,n)){
                board[r][c] = 'Q';
                solveNQueens(board,r+1,n);
                board[r][c] = '.';
            }
        }
    }

    static void printBoard(char[][] board,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        solveNQueens(board,0,n);
        }
}