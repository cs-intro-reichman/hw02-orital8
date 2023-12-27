/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);   		//gets input 
		
	for (int i = 1; i<=num; i++) {				//checking if i is divisor of num
		if (num%i==0)
		System.out.println(i);
		else ;
						}
		
	}
}
