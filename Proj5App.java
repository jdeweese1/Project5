
//This class calls the WorkTicket class, and is called from the command line
import java.util.Scanner;
public class Proj5App
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		final int MAX_SIZE_OF_ARRAY = 50;
		boolean shouldContinue = true;		

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
//Checks for duplicates before enternig temporary object into array
			if(i>0)//if there is already objects in the arrray we check for equality
			{
				for(int j = 0; j<=i-1;j++)//Loops through all the objcets that have been put into the array
				{
					System.out.println("Checking for equality:" +i);
					System.out.println("Dingus" +workTicketsArray[i].toString());
					if(tempWorkTicket.equals(workTicketsArray[i])) 
					{
						System.out.println("It seems you have entered a duplicate ticket, please try again");
						j = i;
						hasADuplicate = true;
					}
				}
			}
			if(!hasADuplicate)
			{
				workTicketsArray[i] = tempWorkTicket;
				System.out.println("Press any key then enter to exit OR enter to enter another");
			}
			s.nextLine();
			String tempString =s.nextLine();
			if(tempString.length()> 0 || i >= MAX_SIZE_OF_ARRAY)
			{
				shouldContinue = false;
			}
			if(i>0)
			{
				workTicketsArray[i]= tempWorkTicket;
			}
			else
			{
				workTicketsArray[0] = tempWorkTicket;
			}
			i++;
		}while(shouldContinue);
		final int MAX_ITERATIONS = i;
		for(int j = 0; j<=MAX_ITERATIONS; j++)
		{
			System.out.println(workTicketsArray[i].toString());
		}
		System.out.println("All work tickets displayed.");
	}//end main
}//end class