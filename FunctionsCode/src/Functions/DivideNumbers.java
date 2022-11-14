package Functions;

public class DivideNumbers {
	
	public static int divideNumbers(int num, int deno) {
		if (deno == 0) {
			return Integer.MIN_VALUE ;
			 	 	
		}
		return num/deno;
		
	}

	public static void printDivisionResult(int num, int deno) {
		if (deno==0) {
			return;
		}
		System.out.println(num/deno);
	}
	
	
	public static void main(String[] args) {
		int num = 8 ;
		int deno = 4;
		printDivisionResult(num,deno);
		
//		int result = divideNumbers(num, deno);
//		System.out.println(result);
		

	}

}
