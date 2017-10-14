
//This class calls the WorkTicket class, and is called from the command line
import java.util.Scanner;
public class Proj5App
{
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
			System.out.print("At the beginning of dowhile and i is :" +i);
//read in customer info and create a temporary Customer object
			System.out.print("\nEnter the customer's name: ");
			String n = "Customername" ;//D s.nextLine();
			System.out.print("\nEnter the customer's address: ");
			String a = "CustomerAddress" ;//D s.nextLine();
			System.out.print("\nEnter the customer's city: ");
			String c = "Manhattan KS" ;//D s.nextLine();
			System.out.print("\nEnter the customer's state:");
			String ss = "KS" ;//Ds.nextLine();
			System.out.print("\nEnter the customer's zip: ");
			String z = "6724" ;//Ds.nextLine();
			System.out.print("\nEnter the customer's phone #: ");
			String p = "tahu" ;//Ds.nextLine();
			Customer tempCustomer = new Customer(n,a,c,ss,z,p);

//-Read in info for a car and create a Car object
			System.out.print("\nEnter the of the VIN: ");
			String inVin = "VINVIN" ;//Ds.nextLine();
			System.out.print("\nEnter the make of the car: ");
			String	inMake = "Ford" ;//Ds.nextLine();
			System.out.print("\nEnter the model of the car: ");
			String inModel = "Fiesta" ;//Ds.nextLine();
			System.out.print("\nEnter the year of the car: ");
			int inYear = 1278 ;//Ds.nextInt();
			Car tempCar = new Car(inVin, inMake, inModel, inYear);


//Read in info for a service quote and create a ServiceQuote object
			System.out.print("\nEnter the charge for parts: ");
			double inPartsCharge = 8.0;//D s.nextDouble();
			System.out.print("\nEnter the charge for labor: ");
			double inLaborCharge = s.nextDouble();
//Create temporary ServiceQuote object			
			ServiceQuote tempServiceQuote = new ServiceQuote(inPartsCharge, inLaborCharge);
//Create a temporary WorkTicket object
			WorkTicket tempWorkTicket = new WorkTicket(tempCustomer, tempCar, tempServiceQuote);
//If not a duplicate, store WorkTicket Object in Array else display message and re-enter
			boolean hasADuplicate = false;
//Checks for duplicates before enternig temporary object into array TODO
			// if(i>0)
			// {
			// 	for(int j = 0; j <i-1; j++ )
			// 	{

			// 	}
			// }
			// else
			// {
				workTicketsArray[i] = tempWorkTicket;
				System.out.print("\nSTART "+ i+ workTicketsArray[i]);
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
			System.out.println("j =" +j);
			System.out.println(workTicketsArray[j].toString());
		}
		s.nextLine();
		System.out.println("All work tickets displayed.");
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
					searchArray(tempString, workTicketsArray);
				}

				else
				{
					shouldContinue = false;
				}
			}while(shouldContinue);
		}
	}//end main
	public static boolean wouldLikeToContinue()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Press any key then enter to exit OR enter to enter another: ");
		String tempString = s.nextLine();
		//System.out.println(tempString);	
		if(tempString.length() > 0)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
}//end class