import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;


public class Level1 extends Maze{
	private SlidingPlate pl;
	private ArrayList<Plate> plates;
	//Player play=new Player();
	char[] cha;

	Monster newMon;

	public ArrayList<Plate> getPlates(){
		return plates;
	}
	

	public void setPlates(){
		cha=new char[7];
		newMon=new Monster(getGrid(), getGrid().getGridSpace(10, 10), cha);
		getGrid().addMonster(newMon);
		cha[0]='r';
		cha[1]='l';
		cha[2]='u';
		cha[3]='d';
		cha[4]='u';
		cha[5]='l';
		cha[6]='r';
		plates=new ArrayList<Plate>();
		Plate trial=new Plate(super.getGrid(),3,4,3,"vertical");
		SlidingPlate p=new SlidingPlate(super.getGrid(), 1, 1, 3, "horizontal", 3, "horizontal");
		super.getGrid().addPlate(p);
		super.getGrid().addPlate(trial);
		pl=p;
		plates.add(trial);
		plates.add(p);
		Timer time=new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pl.move();
				newMon.move();
				System.out.println("moved");
				repaint();
				for (GridSpace space:pl.getSpacesCovered()) {
					System.out.println(space.getX()+" "+space.getY());
				}
			}


		});
		time.start();
	}

	public int gridWidth(){
		return 20;
	}
	public int gridHeight(){
		return 20;
	}
	public String getLevel(){
		return "Level 1";
	}
	public void addPlayer(Player toAdd){
		super.setPlayer(toAdd);
		toAdd.changeOccupiedSpot(getGrid().getGridSpace(0,0));
	}
	public GridSpace playerStart(){
		return getGrid().getGridSpace(0,0);
	}


	@Override
	ArrayList<SlidingPlate> getSlidingPlates() {
		ArrayList<SlidingPlate> slide=new ArrayList();
		slide.add(pl);
		return slide;
	}


	@Override
	GridSpace gameCompleteSpace() {
		return getGrid().getGridSpace(10, 10);
	}


	@Override
	ArrayList<Monster> getMonsters() {
		ArrayList<Monster> mon=new ArrayList();
		
		
		mon.add(newMon);
		return mon;
	}

}

