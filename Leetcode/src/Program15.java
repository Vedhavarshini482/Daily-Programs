
public class Program15 {

	public static void main(String[] args) {
		new Program15().dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 });
	}

//	leetcode 739
	public int[] dailyTemperatures(int[] temperatures) {
		int[] array = new int[temperatures.length];

		for (int i = 0; i < temperatures.length; i++) {
			int count = 0, j = i + 1;
			while (j < temperatures.length) {
				count++;
				if (temperatures[i] < temperatures[j])
					break;
				j++;
			}
			if (j == array.length)
				count = 0;

			array[i] = count;
			if (count == temperatures.length) {
				int k = 0;
				for (j = array[i]; j >= 1; j--)
					array[k++] = j;
				break;
			}

		}
		for (int i : array) 
			System.out.print(i + " ");
		return array;
	}
}