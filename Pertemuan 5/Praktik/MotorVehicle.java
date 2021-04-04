public class MotorVehicle extends Vehicle{
	public int sizeofEngine = 1;
	public String licencePlate = "H 1 IDN";
	
	public MotorVehicle(){
	}
	public MotorVehicle(int sizeEng, String lcPlate){
		this.sizeofEngine = sizeofEngine;
		this.licencePlate = lcPlate;
	}
	public int getSizeofEngine(){
		return sizeofEngine;
	}
	public String getLicencePlate(){
		return licencePlate;
	} 
}