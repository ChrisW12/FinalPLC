

public class Number6Pt2 {


public static void main(String[] args) {

	
	int max = 0;
	int min = 0;
	int mid = 0;

	int x = 1;
	int y = 2;
	int z = 3;
  
	
	long startTime = System.nanoTime();
	
	if(x>y) {
		if(x>z) {
			if(y>z) {
				max = x;
				min = z;
				mid = y; 
				}
			
			else
			{
				max = x;
				min = y;
				mid = z;
			}
		}
		else
		{
			max = z;
			min = y;
			mid = x;
  
  
		}
  
	}
	else
	{
		if(y<z)
		{
			max = z;
			min = x;
			mid = y;

		}	
		else
		{
			if(x<y)
			{
				max = y;
				min = x;
				mid = z;  
			}
			else
			{
				max = y;
				min = z;
				mid = x;
			}
		}
  
	}
  
	long endTime = System.nanoTime();
	
	long timeElapsed = endTime - startTime;
	
	System.out.println("Max is "+ max);
	System.out.println("Min is "+ min);
	System.out.println("Mid is "+ mid);
	
	System.out.println("Execution time in nanoseconds was: " +  timeElapsed);
	}
  
	}
