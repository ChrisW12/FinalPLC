public class Number_5 {

public static void main(String []args){
        
        boolean flag = false;
        
        for (int i = 1; i <= n; i++) {
            
            int Counter = 0;
            for (int j = 1; j <= n; j++) { 
                if (x[i][j] != 0) 
                    Counter++;
            }
            
            if (flag == false && Counter == n) {
            System.out.println("First all zero row is: ", i);
            flag = true;
        ;
        }
     }
}
