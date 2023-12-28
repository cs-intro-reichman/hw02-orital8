/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);   		//gets input 
	
	for(int i = 1; i <= num;i++){
		if ( i % 2 == 0 ){
			for(int j = 1; j <= num;j++){
			System.out.print(" *");
				}
			}
			else
			{
			for(int m = 1; m <= num;m++){
			System.out.print("* ");
			}
		}
		System.out.println();
		}
		}
	}

