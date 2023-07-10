package game_purchase_app;

public class Purches {
	
	int id;
	String gameName;
	
	
	public Purches(int id, String gameName) {
		this.id = id;
		this.gameName = gameName;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
}
