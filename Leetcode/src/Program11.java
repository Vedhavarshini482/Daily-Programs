import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program11 {

	public static void main(String[] args) {
		String strs[] = new String[] { "", "" };
		new Program11().groupAnagrams(strs);
	}

	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> anagram = new ArrayList<>();

		String string[] = new String[strs.length];

		for (int i = 0; i < strs.length; i++) {
			char[] dup = new char[strs[i].length()];
			dup = strs[i].toCharArray();
			Arrays.sort(dup);
			string[i] = String.valueOf(dup);
		}

		for (int i = 0; i < strs.length; i++) {
			ArrayList<String> list = new ArrayList<>();
			if(!string[i].equals("-1"))
				list.add(strs[i]);
//			string[i]="-1";
			for (int j = i + 1; j < strs.length; j++) {
				if (string[i].equals("-1")) {
					list = new ArrayList<>();
					break;
				}
				else if (string[i].equals(string[j])) {
					string[j] = "-1";
					list.add(strs[j]);
				}	
			}
		
			if (list.size() != 0)
				anagram.add(list);
		}
		System.out.println(anagram);
		return anagram;
	}
}