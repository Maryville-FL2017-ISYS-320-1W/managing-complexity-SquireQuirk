/*
  	ISYS 320
  	Name(s): Patrick Quirk
  	Date: 11/13/17
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| !		| \		| HEADING		| HEADING		| HEADING		|	
0					22	 0		
1					18	 2 each
2					14	 4
3					10	 6
4					6    8
5					2	 10
*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 Since there are 22 characters in each line we can use that to find the remainder and print out the ! that are left
 If I multiply the line number by 2 that will give us the number of backslashes on each end
 
 
 
 
 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {
		PrintSquare();

	}
	
	public static void PrintSquare() {
		
		int numOfChar = 22;
		String print = "";
		int numOfExcl = 0;
		int numOfBack = 0;
		
		for(int line = 0; line <= 5; line++)
		{
			numOfBack = line * 2;
			numOfExcl = numOfChar - numOfBack*2;
			
			
				for(int b = 0; b < numOfBack; b++)
				{
					print += "\\";
				}
				
				for(int e = 0; e < numOfExcl; e++ )
				{
					print += "!";
				}
				
				for(int b = 0; b < numOfBack; b++)
				{
					print += "\\";
				}
				
				print += "\n";
				
			
		}
		
		System.out.print(print);
	}

}
