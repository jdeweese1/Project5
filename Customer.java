/**
*This class calls is called by the WorkTicket class
*This class contains constructors and methods for Customer objects such as the equals method, toString, getCustomerName, and get CustID
*
*@author Jarod DeWeese
*@version 5
*///This class is called by the WorkTicket class
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
	/**
	*Checks to see if the two objcects are equals i.e have the same CustID number
	*@param inCustomer is the Customer object passed into the method that will be checked for equality
	*@return Boolean true or false indicating if the two Customer objects are equals
	*/
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
	/**
	*toString() returns the CUSTID, name, address, city, state, zip, and phone number of the customer
	*@return String cotaining the CUSTID, name, address, city, state, zip, and phone number of the customer
	*/
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
		sb.append("\n");
		return sb.toString();

	}
	/**
	*getCustomerName() returns back the customer's name
	*@return The name of the customer as a String
	*/

	public String getCustomerName()
	{
		return name;
	}
	/**
	*getCustID() returns back the customer's ID
	*@return The Customer ID of the customer as a String
	*/
	public String getCustID()
	{
		return custID;
	}
	
}