import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Problem41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r); 
	    
	    try
	    {
	    System.out.println("Enter the total runs scored");
	    int runs=  Integer.parseInt(br.readLine());
	
	    System.out.println("Enter the total overs faced");
	    int overs= Integer.parseInt(br.readLine());
	 
	    System.out.println("Current Run Rate :"+((float)runs/(int)overs));
	    }
	    catch (Exception e) {
			// TODO Auto-generated catch block
	    	
	    	System.out.println(e.toString());
		} 
		
	}

}
