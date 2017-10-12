//This class is called by the WorkTicket class

import java.util.*;
public class Car
{
	private String vin;
	private String make;
	private String model;
	private int year;


	public Car()
	{
	} 
	public Car(String inVin, String inMake, String inModel, int inYear)
	{

	} 
	public boolean equals(Car inCar)
	{
		if(inCar.vin.equals(vin))
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
		StringBuilder sb = new StringBuilder();
		sb.append("VIN #: " + vin);
		sb.append("\n " + year+ " " + make + " "+ model);
		return sb.toString();
	}

}