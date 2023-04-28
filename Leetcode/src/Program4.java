import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = scanner.nextInt();
		scanner.close();
		new Program4().reverse(x);
	}

	public int reverse(int x) {
		long rev = 0;
		while (x != 0) {
			rev = (rev * 10) + (x % 10);
			x /= 10;
		}
		return (Integer.MAX_VALUE < rev || rev < Integer.MIN_VALUE) ? 0 : (int) rev;
	}
}