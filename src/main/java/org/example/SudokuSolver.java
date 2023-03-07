package org.example;

public class SudokuSolver {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            boolean[] used = new boolean[9];
            for(int col = 0; col < 9; col++){
                char digit = board[row][col];
                if(digit != '.'){
                    int index = digit - '1';
                    if(used[index]){
                        return false;
                    } else {
                        used[index] = true;
                    }
                }
            }
        }
        // check columns
        for(int col = 0; col < 9; col++){
            boolean[] used = new boolean[9];
            for(int row = 0; row < 9; row++){
                char digit = board[row][col];
                if(digit != '.'){
                    int index = digit - '1';
                    if(used[index]){
                        return false;
                    } else {
                        used[index] = true;
                    }
                }
            }
        }

        //check sub boxes
        for (int box = 0; box < 9; box++){
            boolean[] used = new boolean[9];
            int rowOffset = (box/3) * 3;
            int colOffset = (box % 3) * 3;
            for(int row = 0; row < 3; row++){
                for(int col = 0; col < 3; col++){
                    char digit = board[row + rowOffset][col + colOffset];
                    if(digit != '.'){
                        int index = digit - '1';
                        if(used[index]){
                            return false;
                        } else {
                            used[index] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
