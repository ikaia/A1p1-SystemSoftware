
import java.util.*;  
public class A1p1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter some integer (2~20):"); //Prompting the user to enter an input 
		int num = input.nextInt();

		if(num <=2 || num>=20) //Tell user number should be 2 and 20

		{

			System.out.println("Wrong input"); //Display wrong input

		}

		else { //If number between 2 and 20

			for(int rows = 0; rows < num; rows++) //Loop representing num (Ex: 4 rows prints less than 4 so 3 dashes) of rows

			{

				for(int col = 0; col < num + rows; col++) //Loop representing num of columns vertically 
 
				{

					if(rows == 0) //Display pattern for first row equal 0

					{

						if(col == num - rows) //(Ex: num = 4 and rows = 3 ... 1 star is printed)

						{

							System.out.print("*"); 

						}

						else if(col==(num + rows-1)) //

						{

							System.out.print("*");

						}

						else{

							System.out.print("-");

						}

					}

					else // Repeat for all next rows 

					{

						if(col == num - rows-1)

						{

							System.out.print("*");

						}

						else if(col==(num + rows-1))

						{

							System.out.print("*");

						}

						else{

							System.out.print("-");

						}

					}

				}

				System.out.println(""); //Next row

			}

		}

	}

}