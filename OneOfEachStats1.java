/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
	int T = Integer.parseInt(args[0]);						//number of trails
	int Two = 0;												//families with 2 children
	int Three = 0; 											//families with 3 children
	int Four = 0;												//families with 4 children or more
	double sum = 0;												//for caculating the average
		
															//The paste part from OneOfEachStats
			for (int j = 0; j<T; j++){							//loop for T times
		int randomNumber1 = (int) (Math.random() * (10 )); 		//generate random number
		boolean checkboy = false;									//0-4 for boy 5-9 for girl
		boolean checkgirl = false;
		if(randomNumber1 > 4)
		checkgirl= true;			
		else
			checkboy=true;	
		int i = 1;
			while (checkboy == false || checkgirl == false){
			randomNumber1 = (int) (Math.random() * (10 ));
			if (randomNumber1 <= 4){
			checkboy = true;
			i++;
			}
				else;
				if (randomNumber1 > 4) {
				checkgirl=true;
				i++;
					}
					else;														//end of paste part from OneOfEachStats
				}
				if(i==2)
					Two++;
				if(i==3)
					Three++;
				if(i>=4)
					Four++;
				sum=sum+i;
			}			
double Average= sum/T;															//loop ends
	System.out.println("Average: "+Average+" children to get at least one of each gender.");				
	System.out.println("Number of families with 2 children: "+Two);
	System.out.println("Number of families with 3 children: "+Three);
	System.out.println("Number of families with 4 or more children: "+Four);
	if(Two>=Three&&Two>=Four)
	System.out.println("The most common number of children is 2.");								//the IF's checking which number-
	if(Three>Two&&Three>=Four)																	//- of children is the most common
	System.out.println("The most common number of children is 3.");
	if(Four>Two&&Four>Three)
	System.out.println("The most common number of children is 4 or more.");

	}
}
