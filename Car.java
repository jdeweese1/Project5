//This class is called by the WorkTicket class

import java.util.*;
public class Car
{
	private String vin;
	private String make;
	private String model;
	private int year;


	public Car()
	{} 
	public Car(String inVin, String inMake, String inModel, int inYear)
	{
		vin = inVin;
		make = inMake;
		model = inModel;
		year = inYear;

	}
	/**
	*Checks to see if the two objcects are equals i.e have the same VIN number
	*@param inCar is the car object passed into the method that will be checked for equality
	*@return Boolean true or false indicating if the two car objects are equals
	*/
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
	/**
	*toString() returns the vin # followed by the year, make, and model of the car object
	*@return String cotaining the vin, year, make, and model of the car object
	*/
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\tVIN #: " + this.vin);
		sb.append("\n\t " + this.year+ " " + this.make + " "+ this.model);
		return sb.toString();
	}

}