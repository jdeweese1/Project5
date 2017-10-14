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
		int tempID = r.nextInt(9000)+1000;
		custID = name.substring(0,4)+ tempID;
		//System.out.println("Cust ID is: " + custID);
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
		sb.append("\tCustomer ID: "+ custID);
		sb.append("\n\tName: " + name);
		sb.append("\n\tAddress: "+ address);
		sb.append("\n\tCity: " + city);
		sb.append("\n\tState: " + state);
		sb.append("\n\tZip code" + zip);
		sb.append("\n\tPhone #: " + phone);
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