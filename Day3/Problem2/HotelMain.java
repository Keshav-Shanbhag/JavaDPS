import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator\n"+
							"1. Deluxe Room\n"+
							"2. Deluxe AC Room\n"+
							"3. Suite AC Room\n"+
							"Select Room Type:");
		int ch=scan.nextInt();
		System.out.println("Hotel Name:");
		String hotel_name=scan.next();
		System.out.println("Room Square Feet Area:");
		int sq_ft=scan.nextInt();
		System.out.println("Room has TV (yes/no):");
		String s1=scan.next();
		boolean tv=(s1.equals("yes"))?true:false;
		
		System.out.println("Room has Wifi (yes/no):");
		String s11=scan.next();
		boolean wifi=(s11.equals("yes"))?true:false;
		
		if(ch==1)
		{
			DeluxeRoom r=new DeluxeRoom(hotel_name, sq_ft, tv, wifi, 10);
			System.out.println("Room Tariff per day is:"+r.calculateTariff());
		}
		else if(ch==2)
		{
			DeluxeSeaViewRoom r=new DeluxeSeaViewRoom(hotel_name, sq_ft, tv, wifi, 12);
			System.out.println("Room Tariff per day is:"+r.calculateTariff());
		}
		else if(ch==3)
		{
			SuiteRoom r=new SuiteRoom(hotel_name, sq_ft, tv, wifi, 15);
			System.out.println("Room Tariff per day is:"+r.calculateTariff());
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}

}
