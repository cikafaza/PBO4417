public class TestTV {
	public static void main(String[]args){
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.setChannel(3);
		tv2.setVolume(2);
		
		System.out.println("TV1's Channel is " + tv1.channel 
		+ " and volume level is " + tv1.volumeLevel);
		System.out.println("TV2's Channel is " + tv2.channel 
		+ " and volume level is " + tv2.volumeLevel);
		}
	}

class TV {
	int channel;
	int volumeLevel;
	boolean on;
	
	public TV(){}
	public void turnOn(){
		on = true;
	}
	public void setChannel(int newChannel){
		channel = newChannel;
	}
	public void setVolume(int newVolumeLevel){
		volumeLevel = newVolumeLevel;
	}
}