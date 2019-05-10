Do You Know? Set 1 
1. No, the bug only moves if the space in front of it is open or if there is a flower in it
2. Forward
3. It turns 45 degrees to the right
4. It leaves a flower in the cell that it was in before
5. If the bug is facing the edge, it rotates 45 degrees to the right when told to move
6. The bug turns 45 degrees to the right
7. No
8. A flower wilts over time, the color gets darker
9. No, it stays in its current location.
10. No, a grid square can only have one thing on it at a time

Part 1 Exercises
1.
0 Degrees: North
45 Degrees: Northeast
90 Degrees: East
135 Degrees: Southeast
180 Degrees: South
225 Degrees: Southwest
270 Degrees: West
315 Degrees: Northwest
360 Degrees: North

2. The bug can only be moved to a different part of the grid using the moveTo method, with the setDirection method being used to change the bugs direction. Trying to move the bug outside of the bounds will cause an IllegalArgumentException error.
3. The setColor method
4. When the rock is made right on top of the bug, the bug ceases to exist. This applies to any argument. When a new object is placed right on top of another one, the old object ceases to be shown on the grid, replaced with the new one.
Do You Know? Part 2
1. Defines the number of steps a BoxBug moves on each side of its box
2. It keeps track of how many steps BoxBug has taken 
3. Because when faced with an obstacle on the side, a bug must turn 90 degrees. Since the turn method only turns the bug 45 degrees, you must call the turn method twice to turn the full 90 degrees
4. The BoxBug class extends the Bug class, and the Bug class has a move method. As a result, the BoxBug class inherits that move method
5. Yes, since the side length is determined and can't be changed with client code. 
6. Yes. If there is an object blocking the boxbug's path, it will stop and create a new box for it to path
7. steps is equal to 0 two times. First when the BoxBug has not moved yet, and when it has finished making its box, and it has to make another

Part 2 Exercises
5. 
Step 1 - Create another BoxBug
Step 2 - Add it to the word at a random location

Do You Know? Set 3
1. loc1.getrow()
2. false
3. (4, 4)
4. 135 degrees
5. It indicates the direction of the adjacent neighbor. It then returns the location in terms of a compass in order to indicate the direction that the adjacent neighbor is in

Do You Know? Set 4
1. gr.getOccupiedLocations().size() will find the total amount of taken spaces on the grid
gr.getNumRows() * gr.getNumCols() - gr.getOccupiedLocations() will find the total empty spaces on the grid
2. gr.isValid(new Location(10, 10)) will return true if that location exists on the grid
3. Because Grid is an interface and in Java an interface signals which methods another class must implement. You can find the implementations in the AbstractGrid, BoundedGrid, and UnboundedGrid classes
4. Getting elements with the [] notation is a little easier in terms of ease of typing, rather than typing entire method calls. 

Do You Know? Set 5
1. A color, a direction, and a location
2. Blue, facing North
3. An actor has a state and a behavior, whereas an interface doesn't allow the coder to put in instance variables or methods
4. No, if the actor is already in the grid, it won't put itself in again. It will run an IllegalStateException. It also cannot be removed again, as it will give the exact same error as before. It can be placed and then put back in, it will compile and run without error
5. Must use the setDirection method and then run setDirection(getDirection + 90).

Do You Know? Set 6
1. 
if (!gr.isValid(next)){
    return false
}
2. 
Actor neighbor = gr.get(next);
return (negithbor == null) || (neighbor instanceof Flower);
3. isValid and get. Make sure its empty.
4. getAdjacentLocation. used to find the bugs next possible location
5. getLocation, getDirection, getGrid
6. The bug will remove itself 
7. Yes, the variable loc is needed
8. Its easier to see which bug dropped what flowers because theyre the same color
9. Yes. A flower will be placed in a bugs vacated location
10. 
Flower flower = new Flower(getColor());
flower.putSelfInGrid(gr, loc); 
11. Four times

Do You Know? Set 7
1. act, getActors, processActors, getMoveLocations, selectMoveLocation, makeMove
2. getActors, processActors, getMoveLocations, selectMoveLocation, makeMove
3. Yes, it needs to in order to select diffferent locations
4.  It could eat all of the actors in its list, it could make them all change colors, or it could ask them all to move.
5.  getMoveLocations, selectMoveLocation, makeMove
Moving a critter is a three-step process. First, the act method calls the getMoveLocations method. For abasic critter, this method returns a list of all the empty adjacent locations around the critter. After receiving the list of possible empty locations, the selectMoveLocation randomly chooses one of the locations and returns thatlocation. If there are no empty locations to choose from, selectMoveLocation returns the current location ofthe critter. The returned location is then passed to the makeMove method, and the critter is moved to the new location. 
6. Critter extends actor. Actor has a default constructor, and if you don't create a constructor, java will do it for you

Do You Know? Set 8
1. The act method calls getActors, processActors, getMoveLocations, selectMoveLocation,
and makeMove. The ChameleonCritter class overrides the processActors and makeMove
methods. Thus, it will produce a different result
2. It first changes the direction of the critter to face the new direction. It then calls super.makeMove of the critter to move to the new location.
3. Modift the makeMove method to drop flowers in the old location
4. Because it processes the same list of actors that the base class does.
5. Actor
6. By calling the getGrid method

Do You Know? Set 9
1. It gains that method through the Critter class. There's no need for the CrabCritter to be overridden
2. It would want to use getAdjacentLocation to figure out whats around it, and then implement an eat method to remove another actor from the grid.
3. Because the crab class needs to figure out what is around it in order to figure out where the other actors are.
4. (4,3) (4,4) (4,5)
5. Similarities, both run as actors, both use getAdjacentLocation to get the locations of actors around them. Difference is that CrabCritter is allowed to eat other actors, while Critter is not.
6. If the parameter loc is in the same place as the crabs location, it turns instead of moving.
7. The crab has the processActor from the critter class. This method tells the crabCritter to only eat things that aren't rocks and arent't critters. Since crabs are critters, crabs will not eat eachother
