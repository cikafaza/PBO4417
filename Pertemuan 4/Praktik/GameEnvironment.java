import java.util.ArrayList; 

public class GameEnvironment{
	private double width;
	private double height;

	private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>(); 
	private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>(); 

	public GameEnvironment(){
	} 
	public GameEnvironment(double width, double height){
		this.width = width;
		this.height = height;
	} 
	public void addPlayer(GamePlayer newPlayer){
		this.arrPlayer.add(newPlayer); 
	} 
	public void removePlayer(GamePlayer newPlayer){ 
		this.arrPlayer.remove(newPlayer); 
	} 
	public void getAllPlayers(){ 
		System.out.println("All of Players: "+arrPlayer);
	}
	public void addEnemy(GameEnemy newEnemy){ 
		this.arrEnemy.add(newEnemy); 
	}
	public void removeEnemy(GameEnemy newEnemy){ 
		this.arrEnemy.remove(newEnemy); 
	}
	public void getAllEnemies(){
		System.out.println("All of Enemies: "+arrEnemy);
	}
	public void Interaction(){
		if (arrPlayer == null || arrEnemy == null){ 
		System.out.println("Player or Enemy not sets");
		}
			for (int i=0;i<arrPlayer.size();i++){
				for (int j=0;j<arrPlayer.size();j++){
					if (arrPlayer.get(i).getY() != arrEnemy.get(j).getY()){
						System.out.println("Player: "+ arrPlayer.get(i) + " and Enemy: " + arrEnemy.get(j) + " not in the same Y position");
					}
					if (EuclideanDistance(arrPlayer.get(i).getX(),arrPlayer.get(i).getY(),arrEnemy.get(j).getX(),arrEnemy.get(j).getY()) < 2 ){
						System.out.println("Player: " + arrPlayer.get(i) + " Attacked");		
						System.out.println("Enemy: " + arrEnemy.get(j) + " Loses");
						removeEnemy(arrEnemy.get(j));
					} 
					else {
						System.out.println("==> Player " + arrPlayer.get(i));
						arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
						System.out.println("current X position = " + arrPlayer.get(i).getX() + " <==");		
					}
				}
			}
	}
	public int EuclideanDistance(int x1, int y1, int x2, int y2){
		return (int) Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
	}
}
