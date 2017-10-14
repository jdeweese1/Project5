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
	private String getSalesTax(String inString)
	{
		return "$0" + inString;
	}
	private String getSalesTax()
	{
		//final double taxRate = .065;
		double temp = (laborCharges + partsCharges) * getTaxRate();
		return String.valueOf(temp);
	}
	private double getTotalCharges()
	{
		return (laborCharges + partsCharges) *getTaxRate();
	}
	private double getTaxRate()
	{
		return .065;
	}
	public String getQuoteNum()
	{
		return quoteNum;
	}

}