/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		
		int randomNumber1 = (int) (Math.random() * (10 ));
		int last = randomNumber1;
		
		while (randomNumber1 >= last){
		System.out.print(randomNumber1+" "); 
		 last = randomNumber1;
		randomNumber1 = (int) (Math.random() * (10 ));
		}			
	}
}
