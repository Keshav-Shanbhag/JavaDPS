
public class Vehicle {
	private String make;
	private String vehicleNumber;
	private String fuelType;
	private int fuelCapacity;
	private int cc;
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}

	public void displayMake()
	{
		System.out.println("***"+make+"***");
	}
	public void displayDetailInfo()
	{
		
	}
	public void displayBasicInfo()
	{
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number:"+this.vehicleNumber);
		System.out.println("Fuel Capacity:"+this.fuelCapacity);
		System.out.println("Fuel Type:"+this.fuelType);
		System.out.println("cc:"+this.cc);
		
	}
}
