/*Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four 
 * million, find the sum of the even-valued terms. */

import java.util.*;

public class EvenNumberFib {

	final static int COUNT = 33; //trial and error issue, not best to use
	public static void main(String[] args)
	{
		int store = sumEvenFib(4000000); //stores sumEvenFib value 
		System.out.println(store); 
	}
	
	public static int sumEvenFib(int num) //adds even-valued fibonacci terms below num
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int prevprev = 0;
		int prev =1;
		int newnum=0;
		int n=0;
		for (int i=2;i<=COUNT;i++) //non-recursive solution
		{
			newnum=prev+prevprev;
			if (newnum%2==0)
			{
				numbers.add(newnum);
			}
			if (newnum>num)
			{
				break;
			}
			prevprev=prev;
			prev=newnum;
		}
		for (int k=0;k<numbers.size();k++)
		{
			n+=numbers.get(k);
		}
		return n;
	}
	
	
	
}