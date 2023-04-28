
public class Program14 {

	public static void main(String[] args) {
		new Program14().mergeAlternately("abcd", "pq");
	}

	public String mergeAlternately(String word1, String word2) {

		StringBuilder s = new StringBuilder();

		int n = word1.length() < word2.length() ? word1.length() : word2.length();

		for (int i = 0; i < n; i++) {
			s.append(word1.charAt(i));
			s.append(word2.charAt(i));
		}
		if (n < word1.length())
			s.append(word1.substring(n, word1.length()));
		if (n < word2.length())
			s.append(word2.substring(n, word2.length()));

		System.out.println(s.toString());

		return s.toString();
	}
}