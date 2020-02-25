import java.util.Scanner;

public class OmokBoard extends Omok {
	private char[][] buf;
	private int width;
	private int height;
	private int player;

	public OmokBoard(int width, int height) // 초기값 설정하기

	{

		player = 0;

		buf = new char[30][40];

		this.width = width;

		this.height = height;

		for (int i = 0; i < height; i++) {

			for (int j = 0; j < width; j++)

			{

				if (i == 0 && j == 0) {
					buf[i][j] = '┌';
				}

				else if (i == height - 1 && j == width - 1) {
					buf[i][j] = '┘';
				}

				else if (i == height - 1 && j == 0) {
					buf[i][j] = '└';
				}

				else if (i == 0 && j == width - 1) {
					buf[i][j] = '┐';
				}

				else if (i == 0)

				{
					buf[i][j] = '┬';
				}

				else if (j == 0)

				{
					buf[i][j] = '├';
				}

				else if (i == height - 1)

				{
					buf[i][j] = '┴';
				}

				else if (j == width - 1)

				{
					buf[i][j] = '┤';
				}

				else
					buf[i][j] = '┼';
			}
		}
	}

	public void print() // print메소드

	{

		for (int i = 0; i < height; i++)

		{

			for (int j = 0; j < width; j++)

				System.out.printf("%c", buf[i][j]);

			System.out.println();

		}

	}

	public void put() // 오목알 두기
	{
		int x = getX();
		int y = getY();

		System.out.print("(x)를 입력해주세요 :");
		Scanner x1 = new Scanner(System.in);
		x = x1.nextInt();

		System.out.print("(y)를 입력해주세요 :");
		Scanner y1 = new Scanner(System.in);
		y = y1.nextInt();

		if (player == 0) {

			this.buf[x][y] = '●';
			player = 1;

		} else if(player == 1){

			this.buf[x][y] = '○';
			player = 0;

		}
	}

}
