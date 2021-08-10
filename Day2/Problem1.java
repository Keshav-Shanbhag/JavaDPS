import java.util.Scanner;

public class Problem1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first,last;
		Scanner scan=new Scanner(System.in);
		first =scan.nextLine();
		last=scan.nextLine();
		last=last.toUpperCase();
		first=first.toLowerCase();
		first=first.substring(0, 1).toUpperCase()+first.substring(1);
		System.out.println(first+" "+last);
	}

}
