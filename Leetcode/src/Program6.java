import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int height[] = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++)
			height[i] = scanner.nextInt();
		scanner.close();
		System.out.println(new Program6().trap(height));
	}

	public int trap(int[] height) {
		int index = 0;
		for (int i = 0; i < height.length; i++) {
			if (height[index] < height[i])
				index = i;
		}
		int max = height[0], count = 0;
		for (int i = 0; i < index; i++) {
			if (max > height[i]) {
				count += max - height[i];
			} else {
				max = height[i];
			}
		}
		max = height[height.length - 1];
		for (int i = height.length - 1; i > index; i--) {
			if (max > height[i]) {
				count += max - height[i];
			} else {
				max = height[i];
			}
		}
		return count;
	}
}