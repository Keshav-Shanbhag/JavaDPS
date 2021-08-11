
public class TwoWheeler extends Vehicle {
	private boolean kickStartAvailable;

	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		String s1=isKickStartAvailable()?"YES":"NO";
		System.out.println("Kick Start Available:"+s1);
		
	}
	
}
