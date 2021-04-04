public class TestUji{
	public static void main(String[] args){
		Vehicle kendaraan = new Vehicle();
		kendaraan.goStraight();
		kendaraan.turnLeft();
		kendaraan.turnRight();
		
		System.out.println("-----------------------");
		
		Bicycle sepeda = new Bicycle();
		sepeda.goStraight();
		sepeda.turnLeft();
		sepeda.ringBell();
		sepeda.turnRight();
		
		System.out.println("-----------------------");
		
		MotorVehicle motor = new MotorVehicle();
		System.out.println("Size of Engine : "+motor.getSizeofEngine());
		System.out.println("Licence Plate : "+motor.getLicencePlate());
	}
}
