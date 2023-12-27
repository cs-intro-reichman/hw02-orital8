
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int randomNumber1 = (int) (Math.random() * (10 )); 		//generate random number
		boolean checkboy=false;									//0-4 for boy 5-9 for girl
		boolean checkgirl=false;
		if(randomNumber1 > 4)
		checkgirl= true;			
		else
			checkboy=true;	
		if (randomNumber1 <= 4){
		System.out.print("b"); 
		}
		else{
		System.out.print("g");
		}
		int i = 1;
			while (checkboy == false || checkgirl == false){
			randomNumber1 = (int) (Math.random() * (10 ));
			if (randomNumber1<=4){
			System.out.print("b");
			checkboy= true;
			i++;
			}
				else;
				if (randomNumber1 > 4) {
				System.out.print("g");
				checkgirl=true;
				i++;
					}
					else;
				}
				System.out.println();
				System.out.print("You made it... and you now have "+ i +" children.");
	}
}
