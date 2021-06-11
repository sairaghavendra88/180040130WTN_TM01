package com.wipro.eb.entity;

public class Commercial extends Connection{

	public Commercial(int currentReading, int previousReading, float[] slabs) {
		super(currentReading, previousReading, slabs);
		// TODO Auto-generated constructor stub
	}
	
	public float computeBill()
	{
		int read=currentReading-previousReading;
		float amount;
		float ans;
		if(read>50)
		{
		  amount=(read-50)*slabs[0];
		  read=read-50;
		  if(read>50)
		  {
			  amount=amount+(read-50)*slabs[1];
			  read=read-50;
			  amount=amount+read*slabs[2];
		  }
		  else
		  {
			  amount=amount+read*slabs[1];
		  }
		}
		else
		{
			amount=read*slabs[0];
		}
		if(amount>=10000)
		{
			ans=(float) (amount+(amount*0.09));
		}
		else if(amount>=5000)
		{
			ans=(float) (amount+(amount*0.06));
		}
		else if(amount<5000)
		{
			ans=(float) (amount+(amount*0.02));
		}
		return ans;
	}

}
