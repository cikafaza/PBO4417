public class UjiKendaraan{
	public static void KendaraanMelaju(Object Vehicle){
		Vehicle kendaraan = new Vehicle();
		kendaraan.goStraight();
	}	
	public static void main(String[] args){
		
		UjiKendaraan kendaraanku = new UjiKendaraan();
		KendaraanMelaju(kendaraanku);
		
		System.out.println("TEST VEHICLE");
		Vehicle vehicle = new Vehicle();
		vehicle.goStraight();
		vehicle.turnLeft();
		vehicle.turnRight();
		
		System.out.println("------------------------------");
		
		System.out.println("TEST BICYCLE");
		Bicycle sepeda = new Bicycle();
		sepeda.turnLeft();
		sepeda.ringBell();
		sepeda.turnRight();
		
		System.out.println("------------------------------");
		
		System.out.println("TEST MOTOR VEHICLE");
		MotorVehicle motor = new MotorVehicle();
		System.out.println("Size of Engine : "+motor.getSizeofEngine());
		System.out.println("Licence Plate : "+motor.getLicencePlate());
		
		System.out.println("------------------------------");
		
		System.out.println("TEST MOTOR CYCLE");
		MotorCycle sepedamotor = new MotorCycle(); 
		sepedamotor.setGearFoot(3);
		System.out.println("Gear : "+sepedamotor.getGearFoot());
		
		System.out.println("------------------------------");
		
		System.out.println("TEST CAR");
		Car mobil = new Car();
		mobil.getSeatBelt();
		System.out.println(mobil.getSeatBelt());		
	}
}