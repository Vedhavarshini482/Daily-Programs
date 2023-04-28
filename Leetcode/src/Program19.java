
public class Program19 {

	public static void main(String[] args) {
		new Program19().successfulPairs(new int[] {3,1,2}, new int[] {8,5,8}, 16);
	}

	public int[] successfulPairs(int[] spells, int[] potions, long success) {

		for (int i = 0; i < spells.length; i++) {
			int count = 0;
			for (int j = 0; j < potions.length; j++) {
				if ((long)potions[j] * (long)spells[i] >= success)
					count++;
			}
			spells[i] = count;
		}

//		for (int i : spells)
//			System.out.print(i + " ");
		return spells;
	}
}
