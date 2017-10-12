//This class is called by the WorkTicket class
import java.util.*;
public class Customer
{
	private String custID;
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;

	public Customer()
	{}
	public Customer(String n, String a, String c, String s , String z, String p)
	{
		name = n;
		address = a;
		city = c;
		state = s;
		zip = z; 
		phone =p;

		Random r = new Random();
		int tempID = r.nextInt(9999)+1;
		custID = name.substring(0,4)+ tempID+"REMOVETHISAFTERDEBUGGING";
		System.out.println("Cust ID is: " + custID);
	}
	public boolean equals(Customer inCustomer)
	{
		if(custID.equals(inCustomer.custID))
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	public String toString()
	{
		StringBuilder sb =new StringBuilder();
		sb.append("Customer ID: "+ custID);
		sb.append("\nName: " + name);
		sb.append("\nAddress: "+ address);
		sb.append("\nCity: " + city);
		sb.append("\nState: " + state);
		sb.append("\nZip code" + zip);
		sb.append("\nPhone #: " + phone);
		return sb.toString();

	}
	public String getCustomerName()
	{
		return name;
	}
	public String getCustID()
	{
		return custID;
	}
	
}