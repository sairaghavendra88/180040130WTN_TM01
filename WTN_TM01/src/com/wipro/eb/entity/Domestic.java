package com.wipro.eb.entity;

public class Domestic extends Connection {

	public Domestic(int currentReading, int previousReading, float[] slabs) {
		super(currentReading, previousReading, slabs);
		// TODO Auto-generated constructor stub
		
	}
	public float computeBill()
	{
		int read=currentReading-previousReading;
		float ans;
		if(read>50)
		{
		  ans=(read-50)*slabs[0];
		  read=read-50;
		  if(read>50)
		  {
			  ans=ans+(read-50)*slabs[1];
			  read=read-50;
			  ans=ans+read*slabs[2];
		  }
		  else
		  {
			  ans=ans+read*slabs[1];
		  }
		}
		else
		{
			ans=read*slabs[0];
		}
		return ans;
	}
}
