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