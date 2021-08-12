import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		try
		{
		System.out.println("Enter the player name");
		String name=scan.next();
		System.out.println("Enter the player age");
		int age=scan.nextInt();
		if(age<19)
		{
			throw new CustomException("InvalidAgeRangeException");
		}
		
		
			System.out.println("Player name : "+name);
			System.out.println("Player age : "+age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
