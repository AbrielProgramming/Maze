import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


abstract class AllMonsters {
	private GridSpace occupied;
	private int movementStep;
	private Grid grid;
	
	public AllMonsters(Grid grid, GridSpace space) {
		this.grid=grid;
		occupied=space;
	}

	public Grid getGrid() {
		return grid;
	}
	public void changeOccupiedSpot(GridSpace space) {
		occupied=space;
	}
	
	public void setGrid() {
		getOccupiedSpot().editMovement(false);
		getOccupiedSpot().editOccupiedBy(this);
	}

	public GridSpace getOccupiedSpot() {
		return occupied;
	}

	abstract void move();



}
