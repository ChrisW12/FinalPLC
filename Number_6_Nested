

public class Number6Pt2 {


public static void main(String[] args) {

	
	int max=0,min=0,mid=0;

	int a = 1;
	int b = 2;
	int c = 3;
  
	
	long startTime = System.nanoTime();
	
	if(a>b) {
		if(a>c) {
			if(b>c) {
				max=a;
				min=c;
				mid=b; 
				}
			
			else
			{
				max=a;
				min=b;
				mid=c;
			}
		}
		else
		{
			max=c;
			min=b;
			mid=a;
  
  
		}
  
	}
	else
	{
		if(b<c)
		{
			max=c;
			min=a;
			mid=b;

		}	
		else
		{
			if(a<c)
			{
				max=b;
				min=a;
				mid=c;  
			}
			else
			{
				max=b;
				min=c;
				mid=a;
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
