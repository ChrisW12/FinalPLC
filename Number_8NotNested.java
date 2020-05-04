
public class Number_6 {


	public static void main(String[] args) {
  
		int x = 5;
		int y = 2;
		int z = 3;
	
		int max = 0;
		int min = 0;
		int mid = 0;
		
		long startTime = System.nanoTime();


			if(x>y && x>z && y>z) {
			
				max = x;
				min = z;
				mid = y;
			}
			else if(x>y && x>z && y<z) {
			
				max = x;
				min = y;
				mid = z;
			}
			else if(y>z && y>x && x>z) {

				max = y;
				min = z;
				mid = x;
			}
			else if(y>z && y>x && z>x) {

			max = y;
			min = x;
			mid = z;
			
			}
			else if(z>x && z>y && x>y) {

				max = z;
				min = y;
				mid = x;
  
			}
			else {

				max = z;
				min = x;
				mid = y;
			}

			long endTime = System.nanoTime();
			
			long timeElapsed = endTime - startTime;
			
			
			System.out.println("Max is "+ max);

			System.out.println("Min is "+ min);

			System.out.println("Mid is "+ mid);
			
			System.out.println("Execution time in nanoseconds was: " +  timeElapsed);

			
			
	}
  
}
