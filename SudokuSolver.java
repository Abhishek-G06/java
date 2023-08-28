public class SudokuSolver {
    public static void main(String[] args) {
        int [][] board = new int[][]{
            { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
            { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
            { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
            { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
            { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
            { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
            { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
            { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
        };

        if(helper(board)){
            display(board);
        }else{
            System.out.println(" can't solve");
        }
    }
    
    static boolean helper(int[][] board){
        int n = board.length;
        int r = -1;
        int c = -1;

        boolean empty = true;
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n; j++){
                if(board[i][j] == 0){
                    r = i;
                    c = j;

                    empty = false;
                    break;
                }
            }
            if(empty == false){
                break;
            }
        }
        if(empty == true){
            return true;
        }

        for(int num = 1; num <= 9 ;num++){
            if(isSafe(board, r, c, num)){
                board[r][c] = num;
                if(helper(board)){
                    return true;
                }else{
                    board[r][c] = 0;
                }
            }
        }
        return false;
    }

    public static void display(int[][] board){
        for(int[] r : board){
            for(int num : r){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int r, int c, int num){
        
        // checking for row
        
        for(int i = 0; i< board.length; i++){
            if(board[r][c] == num){
                return false;
            }
        }

        // checking for column 
        
        for(int[] nums : board){
            if(nums[c] == num){
                return false;
            }
        }

        int sqrt= (int)(Math.sqrt(board.length));
        int rSt = r - r % sqrt;
        int cSt = c - c % sqrt;

        for(int i = rSt; i < rSt + sqrt ; i++){
            for(int j = cSt; j < cSt + sqrt; j++){
                if(board[i][j] == num){
                    return false;
                }
            }    
        }

        return true;
    }
}
