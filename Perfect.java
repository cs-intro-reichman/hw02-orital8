/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int check = Integer.parseInt(args[0]);  
		String str = check+ " is a perfect number since " +check+ " = 1 + ";		//string for saveing divisors
		int counter = 1;
		for (int i = 2; i < check;i++) {											//checking if i is divisor of num
			if(check%i == 0){
			counter = counter+i;													//counting the divisors
			str = str+i+" + ";
			}
			else ;
		}
		if (counter == check){
		String newString = str.substring(0, str.length() - 3);						//delete the last 3 characters from the string
		System.out.println(newString);
		}
		else{
		System.out.println(check+" is not a perfect number");						//noting if number is not perfect 
		}
		}
}

