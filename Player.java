
public class Player {
private String name;
private String[] scores; //String[] stores best times for each level
private GridSpace occupied;
private int level;
private String newestTime;

	public Player(String name) {
		this.name=name;
		newestTime="00:00";
		level=1;
		nullBestTimes();
	}
	
	public Player() {
		name="Default";
		newestTime="00:00";
		level=1;
		nullBestTimes();
	}
	
	private void nullBestTimes() {
		scores=new String[4];
		for (String score: scores) {
				score="00:00";
		}
		
	}
	
	public void setGrid() {
		getOccupiedSpot().editOccupiedBy(this);
	}
	
	public void changeOccupiedSpot(GridSpace space) {
		occupied=space;
	} 
	
	public int getLevel() {
		return level;
	}
	
	public void changeLevel(int l) {
		level=l;
	}
	
	public GridSpace getOccupiedSpot() {
		if (occupied==null) {
			return null;
		} else {
			return occupied;
		}
	}

	public void changeName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBestTime(int level) {
		return scores[level];
	}
	
	public String getNewestTime() {
		return newestTime;
	}
	
	public void changeBestTime(int level, String bt) {
		scores[level]=bt;
	}
	
	public void changeNewestTime(String nt) {
		newestTime=nt;
	}


}
