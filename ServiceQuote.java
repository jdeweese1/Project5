/**
*This class calls is called by the WorkTicket class
*This class contains constructors and methods for ServiceQuote objects such as the equals method and the toString, getQuoteNum, getTaxRate, getSalesTax methods
*
*@author Jarod DeWeese
*@version 5
*/
//This class is called by the WorkTicket class
import java.text.*;
import java.util.*;
public class ServiceQuote
{
	private String	quoteNum;
	private double	partsCharges;
	private double	laborCharges;


	public ServiceQuote()
	{
	}
	public ServiceQuote(double inPartsCharges, double inLaborCharges)
	{
		Random r = new Random();
		Random randAlphabet = new Random();
		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char tempChar1 =  Alphabet.charAt(r.nextInt(26));
		char tempChar2 = Alphabet.charAt(r.nextInt(26));
		quoteNum = String.valueOf(tempChar2)+String.valueOf(tempChar1)+ String.valueOf(r.nextInt(9000) +1000);	
		partsCharges = inPartsCharges;
		laborCharges = inLaborCharges;
	}
	/**
	*Checks to see if the two objects are equals i.e have the same Quote number
	*@param inServiceQuote is the ServiceQuote object passed into the method that will be checked for equality
	*@return Boolean true or false indicating if the two ServiceQuote objects are equals
	*/
	public boolean equals(ServiceQuote inServiceQuote)
	{
		if(inServiceQuote.quoteNum.equals(quoteNum))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	* toString() returns the String info of a ServiceQuote object
	@return Quote Number, Parts Charges, Labor Charges, Sales Tax, and estimated total charges
	*/
	public  String toString()
	{
		DecimalFormat df = new DecimalFormat("$###,###,###.##");
		StringBuilder sb = new StringBuilder();
		sb.append("\tQuote Number: " + quoteNum);	
		sb.append("\n\tParts Charge: " + df.format(partsCharges));
		sb.append("\n\tLabor Charge: " + df.format(laborCharges));
		sb.append("\n\tSales Tax: " + getSalesTax());
		sb.append("\n\n\tTotal Estimated Charges: " + df.format(getTotalCharges()));
		return sb.toString();

	}
	/**
	*If passed in a String, getSalesTax() return back "$0" + the String passed in
	*@param inString the that will be prepended to
	@return $0 plus the String passed in
	*/
	private String getSalesTax(String inString)
	{
		return "$0" + inString;
	}
	/**
	*calculates the dollars of tax for the combined labor and parts charge
	*@return String containing the total amount of tax due
	*/
	private String getSalesTax()
	{
		DecimalFormat df = new DecimalFormat("$##,###.##");
		double temp = (laborCharges + partsCharges) * getTaxRate();
		return String.valueOf(df.format(temp));
	}
	/**
	*getTotalCharges() returns back the base charges, plus the charges from sales tax
	*@return Estimated total charges as a double
	*/
	private double getTotalCharges()
	{
		return (laborCharges + partsCharges) *getTaxRate() +(laborCharges + partsCharges);
	}
	/**
	*getTaxRate() returns the current tax rate as a double Ex: if it returns .065 then the tax rate is 6.5%
	*@return the tax rate as a double
	*/
	private double getTaxRate()
	{
		return .065;
	}
	/**
	*getQuoteNum() returns the quote Number of the current object
	*@return Returns the quote Number as a String
	*/
	public String getQuoteNum()
	{
		return quoteNum;
	}

}