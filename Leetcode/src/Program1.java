import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Program1 program = new Program1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = scanner.nextLine();
		scanner.close();
		program.lengthOfLastWord(s);
	}

	public int lengthOfLastWord(String s) {
		String arr[] = s.split(" ");
		String string = arr[arr.length - 1];
		System.out.println(string.length());
		return string.length();
	}
}