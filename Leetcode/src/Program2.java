import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Program2 program = new Program2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row size of the array");
		int m = scanner.nextInt();
		System.out.println("Enter the coulmn size of the array");
		int n = scanner.nextInt();
		int grid[][] = new int[m][n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		program.minPathSum(grid);
	}

	public int minPathSum(int[][] grid) {
		int sum = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (i == 0 || i < j || j == grid[i].length - 1) {
					System.out.print(grid[i][j] + " ");
					sum += grid[i][j];
				}
			}
		}
		System.out.println(sum);
		return sum;
	}
}