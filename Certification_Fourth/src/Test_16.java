
public class Test_16 {

	public static void main(String[] args) {
		int[] a={1,2,3,4};
		int[] b={2,3,1,0};
		System.out.println((a=b)[3]);
		System.out.println(a[(a=b)[3]]);
		
		System.out.println("for loop");
		for(int i:a)
		{
			System.out.println(i);
		}

	}

}
