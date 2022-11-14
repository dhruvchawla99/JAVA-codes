package Functions;
import java.util.Scanner;
public class CheckPrime {
	public static boolean CheckPrime (int n) {
		int div = 2;
		while (div<=n/2) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isPrime = CheckPrime(n);
		System.out.println(isPrime);

	}

}
