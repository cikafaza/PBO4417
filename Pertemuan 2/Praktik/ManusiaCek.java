class Manusia{
	private String nama;
	private boolean punyaTV;
	
	public Manusia(){
	}
	public Manusia(String nama){
		this.nama=nama;
	}
	public String namaSaya(){
		return nama;
	}
	public void beliTV(TV tvku) {
		punyaTV = true;
	}
	public void jualSemuaTV() {
		punyaTV = false;
	}
	public boolean cekTV(){
		return punyaTV;
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
public class ManusiaCek{
	public static void main(String[] args){
		Manusia man1 = new Manusia("Erik");
		System.out.println(man1.namaSaya());
			
		TV tvku = new TV();
		man1.beliTV(tvku);
		System.out.println(man1.cekTV());
		man1.jualSemuaTV();
		System.out.println(man1.cekTV());
	}
}