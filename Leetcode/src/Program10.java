
public class Program10 {

	public static void main(String[] args) {
		System.out.println(new Program10().jump(new int[] { 2, 1 }));
	}

	public int jump(int[] nums) {
		int i, jump = 0, prev = 0;

		if (nums.length == 1)
			return 0;

		for (i = 0; i < nums.length; i++) {
			if (i + nums[i] == nums.length - 1) {
				prev = jump;
				jump = i + 1;
			}
			jump = Math.min(prev, jump);
		}
		return jump;
	}
}