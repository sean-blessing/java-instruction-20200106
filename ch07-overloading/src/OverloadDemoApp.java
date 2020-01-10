
public class OverloadDemoApp {

	public static void main(String[] args) {
		int sum1 = sum(44, 33);
		System.out.println(sum1);
		
		int sum2 = sum(44,33,22);
		System.out.println(sum2);

	}
	
	private static int sum(int i, int j, int k) {
		return i + j + k;
	}

	private static int sum(int a, int b) {
		return a + b;
	}

}
