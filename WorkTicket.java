
//This class is called by the Proj5App.java class and calls the Customer, Car, and ServiceQuote classes
import java.text.*;
import java.util.*;
public class WorkTicket
{
	private String ticketNum ;
	private Customer customer;
	private Car car;
	private ServiceQuote quote;
	public WorkTicket()
	{	}//dummy constructor
	public WorkTicket(Customer inCustomer, Car inCar, ServiceQuote inQuote)
	{
		customer = inCustomer;
		car = inCar;
		quote = inQuote;
		ticketNum = customer.getCustID().substring(0,2) 
		+ customer.getCustID().substring(6,8)
		+quote.getQuoteNum().substring(3,6);
	}
	public boolean equals(WorkTicket inWorkTicket)
	{
		if(inWorkTicket == null)
		{
			System.out.println("the inWorkTicket is null");
		}
		if(inWorkTicket.ticketNum.equals(ticketNum) 
			|| inWorkTicket.customer.equals(this.customer) 
			|| inWorkTicket.car.equals(this.car)
		 	|| inWorkTicket.quote.equals(this.quote))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String getTicketNum()
	{
		return ticketNum;
	}
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Ticktet Number: " +ticketNum);
		sb.append("\n" + customer.toString());
		sb.append("\n" + car.toString());
		sb.append("\n" + quote.toString());
		return sb.toString();
	}
}//end class