package game_2;

class Solution {
	public void solveSudoku(char[][] board) {
		
		int row = board.length;
		int col = board[0].length;
		for(int i = 0; i<row; i++) {
			for(int j =0; j<col; j++) {
				for(int val = 1; val<=9; val++) {
					if(isSafe(i,j,board,val)) {
						board[i][j] = (char)val;
						
					}
				}
			}
		}
		for(char[] c:board) System.out.println(c);
	}

	private boolean isSafe(int i, int j, char[][] board, int val) {
		
		return false;
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
