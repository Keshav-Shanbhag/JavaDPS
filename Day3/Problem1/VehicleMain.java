import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("1.Four Wheeler\n"
				+ "2.Two Wheeler\n"+"Enter Vehicle Type:");
		int ch=scan.nextInt();
		if(ch==1)
		{
			
			System.out.println("Vehicle Make:");
			String make=scan.next();
			System.out.println("Vehicle Number:");
			String Vehicle_number=scan.next();
			System.out.println("Fuel Type:\n"+
								"1.Petrol\n"+"2.Diesel");

			int ch2=scan.nextInt();
			String fueltype=(ch2==1)?"Petrol":"Diesel";
			System.out.println("Fuel Capacity:");
			int fuel_capacity=scan.nextInt();
			System.out.println("Engine CC:");
			int cc=scan.nextInt();
			System.out.println("Audio System:");
			String audio_system=scan.next();
			System.out.println("Number of Doors:");
			int doors=scan.nextInt();
			
			FourWheeler f1=new FourWheeler(make, Vehicle_number, fueltype, fuel_capacity, cc, audio_system, doors);
			f1.displayMake();
			f1.displayBasicInfo();
			f1.displayDetailInfo();

		}
		else
			if(ch==2)
			{
				System.out.println("Vehicle Make:");
				String make=scan.next();
				System.out.println("Vehicle Number:");
				String Vehicle_number=scan.next();
				System.out.println("Fuel Type:\n"+
									"1.Petrol\n"+"2.Diesel");

				int ch2=scan.nextInt();
				String fueltype=(ch2==1)?"Petrol":"Diesel";
				System.out.println("Fuel Capacity:");
				int fuel_capacity=scan.nextInt();
				System.out.println("Engine CC:");
				int cc=scan.nextInt();
				System.out.println("Kick Start Available(yes/no):");
				String s1=scan.next();
				boolean kick_start=(s1.equals("yes"));
				
				TwoWheeler t1=new TwoWheeler(make, Vehicle_number, fueltype, fuel_capacity, cc, kick_start);
				t1.displayMake();
				t1.displayBasicInfo();
				t1.displayDetailInfo();
				
			}
			else{
				System.out.println("Invalid Input");
			}
		
	}

}
