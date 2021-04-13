public class Car extends MotorVehicle{
	private Boolean seatbelt = false;
	
	public Car(){
	}
	public void setSeatBelt(Boolean seatbelt){
		this.seatbelt = seatbelt;
	}
	public Boolean getSeatBelt(){
		return seatbelt;
	}
}