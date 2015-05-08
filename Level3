import java.awt.*;
import java.util.ArrayList;


public class Level3 extends Maze{
	private ArrayList<Plate> plates;
	private ArrayList<SlidingPlate> slidingPlates;
	private ArrayList<AllMonsters> monsters;
	public Level3(DisplayGame game){
		super(game);
	}
	public ArrayList<SlidingPlate> getSlidingPlates(){
		return slidingPlates;
	}
	public ArrayList<Plate> getPlates(){
		return plates;
	}
	public boolean dark(){
		return false;
	}
	public boolean monstersRandom(){
		return false;
	}
	public void setPlates(){
		
		plates=new ArrayList<Plate>();
		slidingPlates=new ArrayList<SlidingPlate>();
		monsters=new ArrayList<AllMonsters>();
		
		char[] monsterDirection={'d','d','d','u','u','u'};
		Monster newMonster=new Monster(super.getGrid(),super.getGrid().getGridSpace(15, 14),monsterDirection);
		super.getGrid().addMonster(newMonster);
		monsters.add(newMonster);
		//System.out.println(super.getPlayer().getName());
		
		
		
		plates.add(new Plate(super.getGrid(),1,1,28,"horizontal"));
		plates.add(new Plate(super.getGrid(),28,1,28,"vertical"));
		plates.add(new Plate(super.getGrid(),1,3,25,"vertical"));
		plates.add(new Plate(super.getGrid(),1,28,28,"horizontal"));
		plates.add(new Plate(super.getGrid(),2,3,25,"horizontal"));
		plates.add(new Plate(super.getGrid(),26,3,24,"vertical"));
		plates.add(new Plate(super.getGrid(),3,26,23,"horizontal"));
//		
		plates.add(new Plate(super.getGrid(),24,6,19,"vertical"));
		plates.add(new Plate(super.getGrid(),5,24,19,"horizontal"));
		plates.add(new Plate(super.getGrid(),5,7,10,"vertical"));
		plates.add(new Plate(super.getGrid(),6,7,16,"horizontal"));
		plates.add(new Plate(super.getGrid(),22,7,16,"vertical"));
		
//		
		plates.add(new Plate(super.getGrid(),7,9,14,"vertical"));
		plates.add(new Plate(super.getGrid(),8,9,13,"horizontal"));
		plates.add(new Plate(super.getGrid(),20,10,11,"vertical"));
		plates.add(new Plate(super.getGrid(),9,20,11,"horizontal"));
		plates.add(new Plate(super.getGrid(),9,11,10,"vertical"));
		plates.add(new Plate(super.getGrid(),10,11,9,"horizontal"));
		plates.add(new Plate(super.getGrid(),18,12,7,"vertical"));
		plates.add(new Plate(super.getGrid(),11,18,7,"horizontal"));
		plates.add(new Plate(super.getGrid(),11,13,5,"vertical"));
		plates.add(new Plate(super.getGrid(),12,13,5,"horizontal"));
//		

		SlidingPlate s1=new SlidingPlate(super.getGrid(),4,5,21,"horizontal",2,"vertical");
		plates.add(s1);
		slidingPlates.add(s1);
//		
		SlidingPlate s2=new SlidingPlate(super.getGrid(),3,5,22,"vertical",3,"vertical");
		plates.add(s2);
		slidingPlates.add(s2);
//		
		SlidingPlate s3=new SlidingPlate(super.getGrid(),6,1,3,"horizontal",2,"vertical");
		plates.add(s3);
		slidingPlates.add(s3);
//		
		SlidingPlate s4=new SlidingPlate(super.getGrid(),16,14,3,"vertical",1,"vertical");
		plates.add(s4);
		slidingPlates.add(s4);
//		
		SlidingPlate newPlate=new SlidingPlate(super.getGrid(),7,22,15,"horizontal",4,"horizontal");
		plates.add(newPlate);
		slidingPlates.add(newPlate);
		
		SlidingPlate s5=new SlidingPlate(super.getGrid(),18,11,8,"vertical",8,"vertical");
		plates.add(s5);
		slidingPlates.add(s5);
		
		SlidingPlate s6=new SlidingPlate(super.getGrid(),5,17,7,"vertical",2,"horizontal");
		plates.add(s6);
		slidingPlates.add(s6);
		
		SlidingPlate s7=new SlidingPlate(super.getGrid(),26,12,4,"vertical",2,"horizontal");
		plates.add(s7);
		slidingPlates.add(s7);
		
		for (Plate plate : plates){
			super.getGrid().addPlate(plate);
		}
	}
	public boolean platesRandom(){
		return false;
	}
	public ArrayList<AllMonsters> getMonsters(){
		
		return monsters;
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
		toAdd.changeOccupiedSpot(super.getGrid().getGridSpace(0,0));
	}
	public GridSpace playerStart(){
		return super.getGrid().getGridSpace(0,0);
	}
	public GridSpace gameCompleteSpace(){
		return super.getGrid().getGridSpace(12, 14);
	}


}

