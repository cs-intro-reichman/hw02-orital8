/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
	
		String word = args[0];				
		int length = word.length()-1;  					//checking word length, -1 for fit the index counter
		int middle = (length/2);   						//pulls out the middle char location
		if(length%2 != 0)									// check if length is odd
			middle = middle+1;
		else;
			
		char m = word.charAt(middle);					//pulls out the middle char 
		int i = length;									//counter for while loop
		String reverse="";								//variable for reverse string
		
			while (i>=0){								//loop for reverse the string
		
			char c = word.charAt(i);
			reverse= reverse+c;
			i=i-1;
			
			}
			System.out.println(reverse);
			System.out.println("The middle character is "+ m);
		}
}
