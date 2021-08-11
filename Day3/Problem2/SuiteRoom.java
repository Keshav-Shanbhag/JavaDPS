
public class SuiteRoom extends HotelRoom{
	private int ratePerSqFeet;

	public int getRatePerSqFeet() {
		return this.ratePerSqFeet;
	}
	
	

	public SuiteRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet =(this.isHasWifi()==true)?(ratePerSqFeet + 2):(ratePerSqFeet);
		
	}
	
}
