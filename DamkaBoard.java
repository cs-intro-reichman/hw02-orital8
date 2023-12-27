/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);   		//gets input 
	
	for(int i = 1; i <= num;i++){
		if ( num % 2 != 0 ){
			for(int j = 0; j < num;j++){
				if (j==num)
					System.out.print("*");
				else
			System.out.print("* ");
				}
				}
			else
			{
			for(int m = 1; m <= num;m++){
				if (m==num)
					System.out.print("*");
				else
			System.out.print("* ");
			}
		}
		System.out.println();
		if (i%2 != 0)
		System.out.print(" ");
		else ;
		}
		}
	}

