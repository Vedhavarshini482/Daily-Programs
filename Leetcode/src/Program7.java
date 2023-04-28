public class Program7 {
	
	public static void main(String[] args) {
		int nums[]= {7,8,9,11,12};
		System.out.println(new Program7().firstMissingPositive(nums));
	}
public int firstMissingPositive(int[] nums) {
        int i,j;
        for( i=1,j=0;j<nums.length;j++) {
        	if(i==nums[j])
        		{
        		i++;
        		j=-1;
        		}
        	if(j==nums.length-1)
        		return i;
        }
        return i;
    }
}
