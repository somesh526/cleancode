package cleancode_task;

public class cleancode {
	
	public double simpleinterest(double principalamount,double interestrate,double noofyears)
	{
	   return principalamount*interestrate*noofyears/100;

	}
	public double compoundinterest(double principalamount,double interestrate,double noofyears)
	{
	   return principalamount*Math.pow((1+interestrate/100),noofyears);
    }
	}
