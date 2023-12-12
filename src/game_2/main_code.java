package game_2;

class Solution {
	public void solveSudoku(char[][] board) {
		solve(board);
		for(char[] c:board) System.out.println(c);
	}

	private boolean solve(char[][] board) {

		int row = board.length;
		int col = board[0].length;
		for(int i = 0; i<row; i++) {
			for(int j =0; j<col; j++) {
				if(board[i][j] == '.') {
					for(int val = 1; val<=9; val++) {
						if(isSafe(i,j,board,val)) {
							board[i][j] = (char)('0'+val);
							boolean ans = solve(board);
							// basically after this line the value will choose between 1-9
							//if after inputing number if somehow ans returns false meaning that
							//somewhere in the code inputing that number returns false
							//then it will try another value 
							if(ans) return true;
							
							else board[i][j]= '.';//backtrack
						}
						
					}
					return false;
				}
				
			}
		}
		return true;
		
	}

	private boolean isSafe(int r, int c, char[][] board, int val) {
		//check row
		char s = (char)('0'+val);
		for(int i = 0; i<board.length; i++) {
			if(board[r][i] == s) return false;
			if(board[i][c] == s) return false;
			if(board[3*(r/3) + (i/3)][3*(c/3)+(i%3)] == s) return false;
		}
		return true;
	}
}

public class main_code {

	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		Solution ss = new Solution();
		ss.solveSudoku(board);

	}

}
