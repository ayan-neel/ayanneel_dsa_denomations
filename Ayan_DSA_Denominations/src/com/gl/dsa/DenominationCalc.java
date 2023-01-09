package com.gl.dsa;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DenominationCalc {
	int [] denominations;
	int amount;
	DenominationCalc(int []a, int amount)
	{
		denominations = a;
		this.amount=amount;
	}
	TreeMap<Integer,Integer> denominationCount;
	public void denomination()
	{
		denominationCount= new TreeMap<Integer, Integer>(Collections.reverseOrder()); //keeping track of the denomination count // keys in descending order
		int amt = amount;
		descSort();
			
		for(int i=0;i<denominations.length;i++)
		{
			denominationCount.put(denominations[i],0);
			if(amt<denominations[i])
				continue;
			int count =amt/denominations[i];
			denominationCount.put(denominations[i],count);
			amt=amt%denominations[i];
			
		}
		if(amt!=0) {
			System.out.println("Exact payment not possible with the given denomination!");
			return;}
		Iterator<Map.Entry<Integer, Integer>> iterator = denominationCount.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, Integer> entry = iterator.next();
			if(entry.getValue()!=0)
				System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
	public void descSort()
	{
		for(int i=0;i<denominations.length;i++) //applying insertion sort since it's a small array.
		{
			for(int j=i;j>0;j--)
			{
				if(denominations[j-1]<denominations[j])
				{
					exch(j,j-1);
				}
			}
		}
		System.out.println(Arrays.toString(denominations));
	}
	private void exch(int j, int k)
	{
		int temp=denominations[j];
		denominations[j]=denominations[k];
		denominations[k]=temp;
	}
	
	
	
}
