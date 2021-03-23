class GamePlayer{
	private double width;
	private double height;
	private int positionX;
	private int positionY;
	
	public GamePlayer(){
	}
	public GamePlayer(double width,double height){
	}
	public GamePlayer(double width,double height,int positionX,int positionY){
	}
	public void setDimension(double width,double height){
		this.width = width;
		this.height = height;
	}
	public void setPosition(int positionX,int positionY){
		this.positionX = positionX;
		this.positionY = positionY;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public int getX(){
		return positionX;
	}
	public int getY(){
		return positionY;
	}
	public void Run(){
		System.out.println("Player is running");
	}
	public void Run(int incrementX){
		positionX = positionX + incrementX;
		System.out.println("Player still running...current X position= "+positionX);
	}
}
	
class GameEnemy{
	private double width;
	private double height;
	private int positionX;
	private int positionY;
	
	public GameEnemy(){
	}
	public GameEnemy(double width,double height){
	}
	public GameEnemy(double width,double height,int positionX,int positionY){
	}
	public void setDimension(double width,double height){
		this.width = width;
		this.height =  height;
	}
	public void setPosition(int positionX,int positionY){
		this.positionX = positionX;
		this.positionY = positionY;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public int getX(){
		return positionX;
	}
	public int getY(){
		return positionY;
	}
	public void Run(){
		System.out.println("Enemy is running");
	}
}
	
public class TestGame{
	public static void main(String[] args){
		GamePlayer player = new GamePlayer();
		player.setDimension(12,12);
		player.setPosition(10,220);
		System.out.println("Position Player: "+player.getX()+", "+player.getY());
		System.out.println("Dimention Player: "+player.getWidth()+", "+player.getHeight());
		player.Run(12);
		
		GameEnemy enemy = new GameEnemy();
		enemy.setDimension(12,12);
		enemy.setPosition(10,10);
		System.out.println("Position Enemy: "+enemy.getX()+", "+enemy.getY());
		System.out.println("Dimention Enemy: "+enemy.getWidth()+", "+enemy.getHeight());
		enemy.Run();
	}
}	