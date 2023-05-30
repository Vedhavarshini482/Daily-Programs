
public class Program21 {

	public static void main(String[] args) {
		System.out.println(new Program21().isMatch("mississippi", "mis*is*p*."));
	}

	public boolean isMatch(String s, String p) {

		if (p.length() == 0)
			return s.length() == 0;

		if (p.length() > 1 && p.charAt(1) == '*') {

			if (isMatch(s, p.substring(2)))
				return true;

			if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)))
				return isMatch(s.substring(1), p);

		} else {
			if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)))
				return isMatch(s.substring(1), p.substring(1));
		}

		return false;
	}
}