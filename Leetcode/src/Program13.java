
public class Program13 {

	public static void main(String[] args) {
		new Program13().program();
	}

	public void program() {
		String s="1111222244444";
		int[] array=new int[s.length()+1];
		
		for(int i=0;i<array.length;i++)
			System.out.println(array[s.charAt(i)-'0']++);
		
	}
}