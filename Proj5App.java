/**
*This class calls the WorkTicket class, and is called from the command line
*It's purpose is to get input from the user for the various pieces of information you might need to have on a work ticke at a body shop
*It allows the user to input information for up to 50 objects and stores them in an array
*It will also allow to the user to search through said array for tickets
*@author Jarod DeWeese
*@version 5
*/
import java.util.*;
public class Proj5App
{
	/**
	*This is the main method, it creates an array of length 50
	*and stores objects in it, then allows the user to search through
	*@param args is a placeholder
	*/
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		final int MAX_SIZE_OF_ARRAY = 50;
		boolean shouldContinue = true;
		String tempString;	

		WorkTicket[] workTicketsArray = new WorkTicket[MAX_SIZE_OF_ARRAY];
		int i = 0;
		do
		{
			// System.out.print("At the beginning of dowhile and i is :" +i);
		//read in customer info and create a temporary Customer object
			System.out.print("\nEnter the customer's name: ");
			String n =  s.nextLine();
			System.out.print("\nEnter the customer's address: ");
			String a = s.nextLine();
			System.out.print("\nEnter the customer's city: ");
			String c = s.nextLine();
			System.out.print("\nEnter the customer's state:");
			String ss =s.nextLine();
			System.out.print("\nEnter the customer's zip: ");
			String z = s.nextLine();
			System.out.print("\nEnter the customer's phone #: ");
			String p = s.nextLine();
			Customer tempCustomer = new Customer(n,a,c,ss,z,p);

			//-Read in info for a car and create a Car object
			System.out.print("\nEnter the of the VIN: ");
			String inVin = s.nextLine();
			System.out.print("\nEnter the make of the car: ");
			String	inMake = s.nextLine();
			System.out.print("\nEnter the model of the car: ");
			String inModel = s.nextLine();
			System.out.print("\nEnter the year of the car: ");
			int inYear = Integer.parseInt(s.nextLine());
			Car tempCar = new Car(inVin, inMake, inModel, inYear);
			//Read in info for a service quote and create a ServiceQuote object
			System.out.print("\nEnter the charge for parts: ");
			double inPartsCharge = Double.parseDouble(s.nextLine());
			System.out.print("\nEnter the charge for labor: ");
			double inLaborCharge = Double.parseDouble(s.nextLine());
			//Create temporary ServiceQuote object			
			ServiceQuote tempServiceQuote = new ServiceQuote(inPartsCharge, inLaborCharge);
			//Create a temporary WorkTicket object
			WorkTicket tempWorkTicket = new WorkTicket(tempCustomer, tempCar, tempServiceQuote);
			//If not a duplicate, store WorkTicket Object in Array else display message and re-enter
			boolean hasADuplicate = false;
			//Checks for duplicates before enternig temporary object into array TODO
			for(int k = 0; k <= i -1; k++)
			{
				if(workTicketsArray[k].equals(tempWorkTicket))
				{
					hasADuplicate = true;
					i--;
					System.out.println("Duplicate Work Ticket found, please re-enter information\n");
				}
			}

			workTicketsArray[i] = tempWorkTicket;
				//System.out.print("\nSTART "+ i+ workTicketsArray[i]);
			// }

			if(i >=50 || !wouldLikeToContinue())//sets the termination condition
			{
				shouldContinue = false;
			}
			else
			{
				shouldContinue = true;
			}
			i++;
		}while(shouldContinue);

		final int MAX_ITERATIONS = i-1;
		for(int j = 0; j<=MAX_ITERATIONS; j++)
		{
			System.out.println(workTicketsArray[j].toString());
		}
		//s.nextLine();
		System.out.println("All work tickets displayed.\n");
		// System.out.print("Would you like to search through the tickes? Enter Y)es or N)o :");
		// String tempString = s.nextLine();
		// shouldContinue = true;
		// if(tempString.toLowerCase().charAt(0) == 'y')
		{
			do
			{
				System.out.print("Do you want to search for Work Tickets? Enter Y)es or N)o :");
				tempString = s.nextLine();
				System.out.println();
				if(tempString != null && tempString.toLowerCase().charAt(0) =='y')
				{
					shouldContinue = true;
					System.out.print("Enter a ticket number to search for: ");
					tempString = s.nextLine();
					System.out.println(searchArray(tempString, workTicketsArray, i -1));
				}

				else
				{
					shouldContinue = false;
				}
			}while(shouldContinue);
		}
	}//end main
	/**
	*Gets input from the user to see if they would like to continue
	*@return Boolean true or false indicating if the user would like to continue
	*
	*/
	public static boolean wouldLikeToContinue()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Press N enter to exit OR Y to enter another: ");
		String tempString = s.nextLine().toLowerCase();
		//System.out.println(tempString);	
		if(tempString.charAt(0) == 'y')
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	/**
	*Searches the Array passed in to see if any workticket's ticket Numbers is equals to inString
	*@param inString is the String to search through the Array to find a match
	*@param inArray Is the Workticket[] array to search through for a match
	*@param inMAX_OF_ARRAY Is the upper bound index of the array to search i.e. the method won't search past that index
	*
	*/
	public static String searchArray(String inString, WorkTicket[] inArray, int inMAX_OF_ARRAY)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<=inMAX_OF_ARRAY; i++)
		{
			//System.out.print(i);
			if(inArray[i].getTicketNum().equals(inString))
			{
				//System.out.print("\n"+inArray[i].getTicketNum() +"\n" + inString);
				sb.append(inArray[i].toString());
				//return sb.toString();
			}
		}
		return sb.toString();
	}
}//end class