import java.util.ArrayList;
import java.util.List;

public class Program9 {

	public static void main(String[] args) {
		System.out.println(new Program9().program().toString());
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());
		for (int i = 0; i < nums.length; i++) {
			List<List<Integer>> current = new ArrayList<>();
			for (List<Integer> list : result) {
				for (int j = 0; j < list.size() + 1; j++) {
					list.add(j, nums[i]);
					List<Integer> temp = new ArrayList<>(list);
					current.add(temp);
					list.remove(j);
				}
			}
			result = new ArrayList<>(current);
		}
		return result;
	}

	public int[] program() {
		int nums[] = new int[] { -4, -1, 0, 3, 10 };

		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
}