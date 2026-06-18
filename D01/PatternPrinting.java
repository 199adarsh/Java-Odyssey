/*
    
1. Start
2. Decalare two loops
3. Use two for loops 
4. 1st for loop will print the spaces from 4 to 0
5. 2nd for loop will print star and one space from 1 to 
6. Print the stars and spaces using pattern 

	
    *
   * * 
  * * *
 * * * *
* * * * *   

*/

public class PatternPrinting{
	
	public static void main (String[] args){
		int i = 4;
		String sc = "XyZ0";
		int j =1;
		for (int k = 1; k < 6; k++){
			for(i = 5; i>k; i--  ){
				System.out.print(" ");
			}
		    for( j = 0; j < k; j++){
				System.out.print("* ");				
			}
			System.out.println("");
			i--;
			j++;
		}
		
	}
	
}