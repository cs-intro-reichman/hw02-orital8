/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);   		//gets input 
	
	for(int i = 1; i <= num;i++){					// first loop duplicate the lines
		if ( i % 2 == 0 ){							// if the line number is even than....
			for(int j = 1; j <= num;j++){
			System.out.print(" *");
				}
			}
			else
			{
			for(int m = 1; m <= num;m++){			//if its not even, print space before *
			System.out.print("* ");
			}
		}
		System.out.println();
		}
		}
	}

