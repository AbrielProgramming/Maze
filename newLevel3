import java.util.ArrayList;


public class Level3 extends Maze {
	private ArrayList<Plate> plates=new ArrayList();
	private ArrayList<SlidingPlate> slidingPlates;
	private ArrayList<AllMonsters> monsters;
	public Level3(DisplayGame game){
		super(game);
	}
	public boolean dark(){
		return true;
	}
	public ArrayList<AllMonsters> getMonsters(){
		return monsters;
	}
	public boolean platesRandom(){
		return false;
	}
	public ArrayList<SlidingPlate> getSlidingPlates(){
		return slidingPlates;
	}
	public ArrayList<Plate> getPlates(){
		return plates;
	}
	public GridSpace gameCompleteSpace(){
		return super.getGrid().getGridSpace(21, 4);
	}
	
	public int light() {
		return 50;
	}
	public void setPlates(){
		plates=new ArrayList<Plate>();
		slidingPlates=new ArrayList<SlidingPlate>();
		monsters=new ArrayList<AllMonsters>();
		
		FollowMonster newMon2=new FollowMonster(super.getGrid(), super.getGrid().getGridSpace(5, 0), super.getGame().getPlayer());
		super.getGrid().addMonster(newMon2);
		monsters.add(newMon2);
		
		FollowMonster newMonster3=new FollowMonster(super.getGrid(),super.getGrid().getGridSpace(23, 16),super.getGame().getPlayer());
		super.getGrid().addMonster(newMonster3);
		monsters.add(newMonster3);
		
		FollowMonster newMonster4=new FollowMonster(super.getGrid(),super.getGrid().getGridSpace(29, 1),super.getGame().getPlayer());
		super.getGrid().addMonster(newMonster4);
		monsters.add(newMonster4);
		
		Plate trial=new Plate(super.getGrid(),2,5,20,"horizontal");
		super.getGrid().addPlate(trial);
		plates.add(trial);
		Plate pl2=new Plate(super.getGrid(), 5, 3, 7, "vertical");
		super.getGrid().addPlate(pl2);
		plates.add(pl2);
		Plate pl10=new Plate(super.getGrid(), 2, 15, 11, "horizontal");
		super.getGrid().addPlate(pl10);
		plates.add(pl10);
		Plate pl11=new Plate(super.getGrid(), 16, 5, 5, "vertical");
		super.getGrid().addPlate(pl11);
		plates.add(pl11);
		Plate pl12=new Plate(super.getGrid(), 13, 15, 14, "vertical");
		super.getGrid().addPlate(pl12);
		plates.add(pl12);
		Plate pl15=new Plate(super.getGrid(), 11, 0, 15, "vertical");
		super.getGrid().addPlate(pl15);
		plates.add(pl15);
		Plate pl3=new Plate(super.getGrid(), 22, 7, 23, "vertical");
		super.getGrid().addPlate(pl3);
		plates.add(pl3);
		Plate pl26=new Plate(super.getGrid(), 21, 2, 8, "horizontal");
		super.getGrid().addPlate(pl26);
		plates.add(pl26);
		Plate pl27=new Plate(super.getGrid(), 15, 14, 8, "horizontal");
		super.getGrid().addPlate(pl27);
		plates.add(pl27);
		Plate pl16=new Plate(super.getGrid(), 7, 19, 11, "vertical");
		super.getGrid().addPlate(pl16);
		plates.add(pl16);
		
		SlidingPlate pl28=new SlidingPlate(super.getGrid(), 19, 0, 5, "vertical", 3, "horizontal");
		super.getGrid().addPlate(pl28);
		slidingPlates.add(pl28);
		plates.add(pl28);
		
		SlidingPlate pl5=new SlidingPlate(super.getGrid(), 16, 5, 14, "horizontal", 6, "vertical");
		super.getGrid().addPlate(pl5);
		slidingPlates.add(pl5);
		plates.add(pl5);
		
		SlidingPlate pl21=new SlidingPlate(super.getGrid(), 0, 11, 6, "horizontal", 4, "horizontal");
		super.getGrid().addPlate(pl21);
		slidingPlates.add(pl21);
		plates.add(pl21);
		
		SlidingPlate pl22=new SlidingPlate(super.getGrid(), 22, 5, 4, "vertical", 3, "horizontal");
		super.getGrid().addPlate(pl22);
		slidingPlates.add(pl22);
		plates.add(pl22);
		
		SlidingPlate pl23=new SlidingPlate(super.getGrid(), 5, 29, 4, "horizontal", 6, "horizontal");
		super.getGrid().addPlate(pl23);
		slidingPlates.add(pl23);
		plates.add(pl23);
		
		SlidingPlate pl24=new SlidingPlate(super.getGrid(), 0, 22, 4, "horizontal", 3, "vertical");
		super.getGrid().addPlate(pl24);
		slidingPlates.add(pl24);
		plates.add(pl24);
		
		SlidingPlate pl25=new SlidingPlate(super.getGrid(), 24, 2, 10, "vertical", 3, "vertical");
		super.getGrid().addPlate(pl25);
		slidingPlates.add(pl25);
		plates.add(pl25);
		
		SlidingPlate pl20=new SlidingPlate(super.getGrid(), 0, 9, 4, "horizontal", 5, "horizontal");
		super.getGrid().addPlate(pl20);
		slidingPlates.add(pl20);
		plates.add(pl20);
		
		SlidingPlate pl30=new SlidingPlate(super.getGrid(), 18, 18, 10, "horizontal", 7, "vertical");
		super.getGrid().addPlate(pl30);
		slidingPlates.add(pl30);
		plates.add(pl30);
	}
	public int gridWidth(){
		return 30;
	}
	public int gridHeight(){
		return 30;
	}
	public String getLevel(){
		return "Level 3";
	}
	public void addPlayer(Player toAdd){
		toAdd.changeOccupiedSpot(super.getGrid().getGridSpace(0, 0));
	}
	public GridSpace playerStart(){
		GridSpace space=super.getGrid().getGridSpace(0,0);
		return space;
	}

	@Override
	boolean monstersRandom() {
		// TODO Auto-generated method stub
		return false;
	}

}

