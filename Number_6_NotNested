
public class Number_6 {


	public static void main(String[] args) {
  
		int a = 5;
		int b = 2;
		int c = 3;
	
		int max=0,min=0,mid=0;
		
		long startTime = System.nanoTime();


			if(a>b && a>c && b>c) {
			
				max=a;
				min=c;
				mid=b;
			}
			else if(a>b && a>c && b<c) {
			
				max=a;
				min=b;
				mid=c;
			}
			else if(b>c && b>a && a>c) {

				max=b;
				min=c;
				mid=a;
			}
			else if(b>c && b>a && c>a) {

			max=b;
			min=a;
			mid=c;
			
			}
			else if(c>a && c>b && a>b) {

				max=c;
				min=b;
				mid=a;
  
			}
			else {

				max=c;
				min=a;
				mid=b;
			}

			long endTime = System.nanoTime();
			
			long timeElapsed = endTime - startTime;
			
			
			System.out.println("Max is "+ max);

			System.out.println("Min is "+ min);

			System.out.println("Mid is "+ mid);
			
			System.out.println("Execution time in nanoseconds was: " +  timeElapsed);

			
			
	}
  
}
