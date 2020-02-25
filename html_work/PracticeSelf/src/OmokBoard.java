import java.util.Scanner;

public class OmokBoard extends Omok {
	private char[][] buf;
	private int width;
	private int height;
	private int player;

	public OmokBoard(int width, int height) // �ʱⰪ �����ϱ�

	{

		player = 0;

		buf = new char[30][40];

		this.width = width;

		this.height = height;

		for (int i = 0; i < height; i++) {

			for (int j = 0; j < width; j++)

			{

				if (i == 0 && j == 0) {
					buf[i][j] = '��';
				}

				else if (i == height - 1 && j == width - 1) {
					buf[i][j] = '��';
				}

				else if (i == height - 1 && j == 0) {
					buf[i][j] = '��';
				}

				else if (i == 0 && j == width - 1) {
					buf[i][j] = '��';
				}

				else if (i == 0)

				{
					buf[i][j] = '��';
				}

				else if (j == 0)

				{
					buf[i][j] = '��';
				}

				else if (i == height - 1)

				{
					buf[i][j] = '��';
				}

				else if (j == width - 1)

				{
					buf[i][j] = '��';
				}

				else
					buf[i][j] = '��';
			}
		}
	}

	public void print() // print�޼ҵ�

	{

		for (int i = 0; i < height; i++)

		{

			for (int j = 0; j < width; j++)

				System.out.printf("%c", buf[i][j]);

			System.out.println();

		}

	}

	public void put() // ����� �α�
	{
		int x = getX();
		int y = getY();

		System.out.print("(x)�� �Է����ּ��� :");
		Scanner x1 = new Scanner(System.in);
		x = x1.nextInt();

		System.out.print("(y)�� �Է����ּ��� :");
		Scanner y1 = new Scanner(System.in);
		y = y1.nextInt();

		if (player == 0) {

			this.buf[x][y] = '��';
			player = 1;

		} else if(player == 1){

			this.buf[x][y] = '��';
			player = 0;

		}
	}

}