import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Number_1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Chris\\Desktop\\Test.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		while ((st = br.readLine()) != null) {
				testString(st);
			
				
	}
       
		br.close();

	
	}	
	

	
	public static void testString(String val) { 
	   
		System.out.print("Original '" + val + "'  ");
	   
		String x = val.trim();
		
			try {
				int i = Integer.parseInt(x);
				System.out.println("is an integer: " + i);
	    
			} 	catch (NumberFormatException e) {
	        
	    	try {
	            double d = Double.parseDouble(x);	          
	            System.out.println("is a double: " + d);
	       
	            
	        }  catch (NumberFormatException e2) {
	            System.out.println("is a String: " + x);
	        }
	    }
	}
		
		
	
	
}
