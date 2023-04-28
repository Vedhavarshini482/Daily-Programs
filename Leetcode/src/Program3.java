import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int k = scanner.nextInt();
		System.out.println("Enter the target value");
		int n = scanner.nextInt();
		scanner.close();
		new Program3().combinationSum3(k, n);
	}

	public List<List<Integer>> combinationSum3(int k, int n) {
		int number = 1;
		List<List<Integer>> combinations = new ArrayList<List<Integer>>();
		for (int i = 1; i <= 9; i++) {
			int sum = 0;
			List<Integer> list = new ArrayList<Integer>();
			for (int j = number; j <= k; j++) {
				list.add(j);
				sum += j;
			}
			if (sum == n)
				combinations.add(list);
		}
		System.out.println(combinations);
		return null;
	}
}
