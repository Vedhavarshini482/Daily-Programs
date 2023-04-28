
public class Program8 {

	public static void main(String[] args) {
		System.out.println(new Program8().program());
	}

	public int program() {
		int[] nums = new int[] { 1, 3, 5, 6 };
		int target = 2;
		int start = 0, end = nums.length - 1;
		int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if (nums[mid] < target) {
				start = mid + 1;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else
				return mid;
		}
		return start;
	}
}