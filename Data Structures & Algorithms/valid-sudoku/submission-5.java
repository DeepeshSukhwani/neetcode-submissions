class Solution {
    public boolean isValidSudoku(char[][] board) {
        
     Set<Character>[] rows = new HashSet[9];
     Set<Character>[] cols = new HashSet[9];
     Set<Character>[] boxes = new HashSet[9];

     for(int i=0;i<9;i++){
        rows[i] = new HashSet<>();
        cols[i] = new HashSet<>();
        boxes[i] = new HashSet<>();
     }

     for(int i=0;i<board.length;i++){

        for(int j=0;j<board.length;j++){
            
            if(board[i][j]=='.'){
                continue;
            }


            if(!rows[i].add(board[i][j])){
                return false;
            }

            if(!cols[j].add(board[i][j])){
                return false;
            }

            int box= (i/3) *3 + (j/3);

            if(!boxes[box].add(board[i][j])){
                return false;
            }
        }
     }
     return true;




    }
}
