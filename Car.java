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
		vin = inVin;
		make = inMake;
		model = inModel;
		year = inYear;

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
		sb.append("\tVIN #: " + this.vin);
		sb.append("\n\t " + this.year+ " " + this.make + " "+ this.model);
		return sb.toString();
	}

}