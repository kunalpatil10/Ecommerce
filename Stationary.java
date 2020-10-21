/*Display Stationary menu to user. Assign fixed prices to items. 
User will select items from menu along with the quantity. (eg 1. Pen 2. Pencil 3. PaperRim 4. NoteBook.......10 . 
Generate Bill ) When user enters 'Generate Bill' option, display total bill & exit.
(Can use System.exit(0) to terminate java app or simply exit=true )
Que 2. Use Scanner to accept 2 i/ps
Check it's data type . If its integer , accept ints n compute it's average. Otherwise , print error message
 eg : Invalid 1st number or Invalid 2nd number
(Hint : sc.hasNextInt() , sc.nextInt())
*/


package New;

import java.util.Scanner;

public class Stationary
{
	private int choice;
	private int qty ;
	private int total;
	private int price ;

	public void menuList()
	{
		Scanner input = new Scanner(System.in);

		do 
		{
			System.out.println("0.Exit 1.Pen 2.Pencil 3.Eraser 4.Sharpner 5.Notebook");
			System.out.print("Enter choice : ");
			choice = input.nextInt();
			System.out.println();
			
			switch (choice)
			{
			
			case 1:
				System.out.println("Enter quantity :" );
				qty=input.nextInt();
			
				price = 15 * qty;
				System.out.println("Price of Pen = " + price);
				total += price;											// total = total + price //    total = 0     + 15
				System.out.println();
				break;
			
			case 2:
				System.out.println("Enter quantity :" );
				qty=input.nextInt();
				price = 8 * qty;
				System.out.println("Price of Pencil = " + price);
				total += price;
				System.out.println();
				break;
			
			case 3:
				System.out.println("Enter quantity :" );
				qty=input.nextInt();
				price = 3 * qty;
				System.out.println("Price of Eraser = " + price);
				total = total + price;
				System.out.println();
				break;
			
			case 4:
				System.out.println("Enter quantity :" );
				qty=input.nextInt();
				price = 5 * qty;
				System.out.println("Price of Sharpner = " + price);
				total += price;
				System.out.println();
				break;
			
			case 5:
				System.out.println("Enter quantity :" );
				qty=input.nextInt();
				price = 55 * qty;
				System.out.println("Price of Notebook = " + price);
				total += price;
				System.out.println();
				break;
			}
			
		} 
		
			while (choice != 0);
				
				System.out.println("Total Price = " + total);
	}

}
