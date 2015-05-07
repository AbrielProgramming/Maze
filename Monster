//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS
//DONT COMMIT OVER THIS

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Monster extends AllMonsters{
	//private GridSpace occupied;
	private char[] movement; //r, l, u, d for movement and must specify both forward and return movement
	//private int speed;	//speed in is seconds
	private int movementStep;
	//private Grid grid;

	public Monster(Grid grid, GridSpace start, char[] move) {
		super(grid, start);
		//occupied=start;
		movement=move;
		//speed=spd;
		movementStep=0;
		//this.grid=grid;

	}


	//	public void changeOccupiedSpot(GridSpace space) {
	//		occupied=space;
	//	}
	//	
	//	public void setGrid() {
	//		getOccupiedSpot().editMovement(false);
	//		getOccupiedSpot().editOccupiedBy(this);
	//	}
	//
	//	public GridSpace getOccupiedSpot() {
	//		return occupied;
	//	}
	//
	//	public char[] getMovementArray() {
	//		return movement;
	//	}

	public void move() {
		//need to make sure doesnt go over edge
		if (movement!=null){
			char dir=movement[movementStep];
			GridSpace space=super.getOccupiedSpot();
			if (space.getOccupiedBy()!=null &&(space.getOccupiedBy().getClass()==Plate.class || space.getOccupiedBy().getClass()==SlidingPlate.class)) {
				//do nothing
			} else {
				space.editMovement(true);
				space.editOccupiedBy(null);
			}
			if (dir=='r') {
				GridSpace newSpace=getGrid().getGridSpace(space.getX()+1, space.getY());
				super.changeOccupiedSpot(newSpace);
				if (newSpace.getOccupiedBy()!=null&&newSpace.getOccupiedBy().getClass()!=Plate.class && newSpace.getOccupiedBy().getClass()!=SlidingPlate.class ) {
					super.getOccupiedSpot().editMovement(false);
					super.getOccupiedSpot().editOccupiedBy(this);
				}

			} else if (dir=='l') {
				super.changeOccupiedSpot(getGrid().getGridSpace(super.getOccupiedSpot().getX()-1, super.getOccupiedSpot().getY()));
				GridSpace newSpace=super.getOccupiedSpot();
				if (newSpace.getOccupiedBy()!=null&&newSpace.getOccupiedBy().getClass()!=Plate.class && newSpace.getOccupiedBy().getClass()!=SlidingPlate.class ) {
					super.getOccupiedSpot().editMovement(false);
					super.getOccupiedSpot().editOccupiedBy(this);
				}
			} else if (dir=='u') {
				super.changeOccupiedSpot(getGrid().getGridSpace(super.getOccupiedSpot().getX(), super.getOccupiedSpot().getY()-1));
				GridSpace newSpace=super.getOccupiedSpot();
				if (newSpace.getOccupiedBy()!=null&&newSpace.getOccupiedBy().getClass()!=Plate.class && newSpace.getOccupiedBy().getClass()!=SlidingPlate.class ) {
					super.getOccupiedSpot().editMovement(false);
					super.getOccupiedSpot().editOccupiedBy(this);
				}
			} else if (dir=='d') {
				super.changeOccupiedSpot(getGrid().getGridSpace(super.getOccupiedSpot().getX(), super.getOccupiedSpot().getY()+1));
				GridSpace newSpace=super.getOccupiedSpot();
				if (newSpace.getOccupiedBy()!=null&&newSpace.getOccupiedBy().getClass()!=Plate.class && newSpace.getOccupiedBy().getClass()!=SlidingPlate.class ) {
					super.getOccupiedSpot().editMovement(false);
					super.getOccupiedSpot().editOccupiedBy(this);
				}
			}
			if (movementStep==movement.length-1) {
				movementStep=0;
			} else {

				movementStep++;
			}

		}


	}



}
