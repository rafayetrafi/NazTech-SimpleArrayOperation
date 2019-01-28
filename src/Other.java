
public class Other {
	
	int[] array = {10,20,30,40,50,60,10,56,50,65,99,77,20,101,100};
	
	public void countCommonNumber()
	{
		int count = 0;
		
		for (int i = 0; i<array.length; i++)
		{
			for(int j = i+1; j<array.length; j++)
			{
				if(array[i] == array[j])
				{
					count++;
					System.out.println(array[i]);
				}
			}
		}
		
		System.out.println("Total duplicate Numbers are: " + count);
	}
	
	public void findMax2ndMaxValue()
	{
		int max = array[0];
		int sMax = 0;
		
		for (int i = 1; i< array.length; i++)
		{
			if(array[i] > max)
			{
				sMax = max;
				max = array[i];
			}
			else if(array[i] > sMax && array[i] != max)
			{
				sMax = array[i];
			}
			
		}
		
		int total = max * sMax;
		
		System.out.println("Max number is: " + max);
		System.out.println("Second Max number is: " + sMax);
		System.out.println("Multiplication of Max & 2nd Max: " + total);

	}
	
	
	
	
	
	
	

}
