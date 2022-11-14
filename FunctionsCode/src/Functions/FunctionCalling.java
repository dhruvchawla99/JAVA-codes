package Functions;

public class FunctionCalling {
	public static int sum( int a, int b) {
		int result = a+b;
		return result;
	}

	
	public static int increment(int n ) {
		n++;
//		System.out.println("Icrement " + n);
		return n;
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		
		n =increment(n);
		System.out.println("Main "+ n);
//		int a = 10 ;
//		int b = 6;
//		int result = sum(a,b);
//		System.out.println(result);
//		

	}

}
