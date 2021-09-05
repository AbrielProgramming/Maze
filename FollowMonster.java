
public class FollowMonster extends AllMonsters{
private Player player;

	public FollowMonster(Grid grid, GridSpace start, Player playerPerson) {
		super(grid, start);
		player=playerPerson;
	
	}

	public void move() {
		//need to make sure doesnt go over edge
		//does a monster moving over plate null it
		GridSpace space=getOccupiedSpot();
		if (space.getOccupiedBy()!=null &&(space.getOccupiedBy().getClass()==Plate.class || space.getOccupiedBy().getClass()==SlidingPlate.class)) {
			//do nothing
		} else {
			space.editMovement(true);
			space.editOccupiedBy(null);
		}
		int x=player.getOccupiedSpot().getX();
		int y=player.getOccupiedSpot().getY();
		System.out.println("follow monster is following: distance x= "+x+" distance y= "+y);
		if (Math.abs(x-getOccupiedSpot().getX())>Math.abs(y-getOccupiedSpot().getY())) {
			if (x>space.getX()) {
				super.changeOccupiedSpot(getGrid().getGridSpace(super.getOccupiedSpot().getX()+1, super.getOccupiedSpot().getY()));
				GridSpace newSpace=super.getOccupiedSpot();
				if (newSpace.getOccupiedBy()!=null && newSpace.getOccupiedBy().getClass()!=Plate.class && newSpace.getOccupiedBy().getClass()!=SlidingPlate.class ) {
					super.getOccupiedSpot().editMovement(false);
					super.getOccupiedSpot().editOccupiedBy(this);
				}
			} else if (x==space.getX()){
				//this shouldnt happen
			} else {
				GridSpace newSpace=getGrid().getGridSpace(super.getOccupiedSpot().getX()-1, super.getOccupiedSpot().getY());
				super.changeOccupiedSpot(newSpace);
				
				if (newSpace.getOccupiedBy()!=null && newSpace.getOccupiedBy().getClass()!=Plate.class && newSpace.getOccupiedBy().getClass()!=SlidingPlate.class ) {
					super.getOccupiedSpot().editMovement(false);
					super.getOccupiedSpot().editOccupiedBy(this);
				}
			}
		} else {
			if (y>space.getY()) {
				super.changeOccupiedSpot(getGrid().getGridSpace(super.getOccupiedSpot().getX(), super.getOccupiedSpot().getY()+1));
				GridSpace newSpace=super.getOccupiedSpot();
				if (newSpace.getOccupiedBy()!=null && newSpace.getOccupiedBy().getClass()!=Plate.class && newSpace.getOccupiedBy().getClass()!=SlidingPlate.class ) {
					super.getOccupiedSpot().editMovement(false);
					super.getOccupiedSpot().editOccupiedBy(this);
				}
			} else if (y==space.getY()){
				//also shouldnt affect
			} else {
				super.changeOccupiedSpot(getGrid().getGridSpace(super.getOccupiedSpot().getX(), super.getOccupiedSpot().getY()-1));
				GridSpace newSpace=super.getOccupiedSpot();
				if (newSpace.getOccupiedBy()!=null && newSpace.getOccupiedBy().getClass()!=Plate.class && newSpace.getOccupiedBy().getClass()!=SlidingPlate.class ) {
					super.getOccupiedSpot().editMovement(false);
					super.getOccupiedSpot().editOccupiedBy(this);
				}
			}
		}

	}





}
