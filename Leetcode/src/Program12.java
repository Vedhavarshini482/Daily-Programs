public class Program12 {

	public static void main(String[] args) {
		System.out.println(new Program12().myPow(2.0000, -2));

//		        ***************************************STRING REPEATED PROBLEM***************************************
//		String str = "hello world";
//		char s[] = new char[str.length()];
//		s = str.toLowerCase().toCharArray();
//
//		int arr[] = new int[25];
//
//		for (int i = 0; i < str.length(); i++) {
//			if (s[i] != ' ') {
//				arr[(int) s[i] - 97]++;
//				if (arr[(int) s[i] - 97] > 1)
//					s[i] = ' ';
//			}
//		}
//		for (int i = 0; i < str.length(); i++)
//			if (s[i] != ' ') {
//				System.out.println(str.charAt(i) + " occurs " + arr[(int) str.charAt(i) - 97]);
//			}
//		*********************************************************************************************************************

	}

	public double myPow(double x, int n) {
		double ans = 1;
		if (n == 0)
			ans = 1;
		else if (n > 0) {
			for (int i = 1; i <= n; i++)
				ans *= x;
			return ans;
		} else {
			for (int i = 1; i <= (-1) * n; i++)
				ans *= x;
			return 1 / ans;
		}
		return ans;
	}
}