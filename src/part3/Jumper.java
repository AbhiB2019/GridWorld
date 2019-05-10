import info.gridworld.actor.Bug;


public class JumperBug extends Bug {
	public JumperBug() {
		super()
	}
	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} else {
			turn();
			turn();
			steps = 0;
		}
	}
    public void move()  {
        Grid<Actor> gr = getGrid();
        if(gr == null)  {
            return;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        if(gr.isValid(next))    {
            moveTo(next);
        } else{
            removeSelfFromGrid();
        }
    }
}