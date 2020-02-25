
public class PlayOmok {
	public static void main(String[] args) {
		
		char[][] board = new char[10][10];
		int garo = 0;
		int sero= 0;
		int player;
		player = 0;
		
		
		for (int i = 0; i < garo; i++) {
			for (int j = 0; j < sero; j++)
			{
				if (i == 0 && j == 0) {
					board[i][j] = '¦£';
				}
				else if (i == garo - 1 && j == sero - 1) {
					board[i][j] = '¦¥';
				}
				else if (i == garo - 1 && j == 0) {
					board[i][j] = '¦¦';
				}
				else if (i == 0 && j == sero - 1) {
					board[i][j] = '¦¤';
				}
				else if (i == 0)
				{
					board[i][j] = '¦¨';
				}
				else if (j == 0)
				{
					board[i][j] = '¦§';
				}
				else if (i == garo - 1)
				{
					board[i][j] = '¦ª';
				}
				else if (j == garo - 1)
				{
					board[i][j] = '¦©';
				}

				else
					board[i][j] = '¦«';
			}
			System.out.println(board[garo][sero]);
		}

	}

}
