
/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class ChameleonCritter extends Critter {
	

	public void processActors(ArrayList<Actor> actors){
 		int n = actors.size();
 		if (n == 0){
 			darken();
 			return;
 		}
 		int r = (int) (Math.random() * n);
 		Actor other = actors.get(r);
		setColor(other.getColor());
		}


	private void darken(){
 		Color c = getColor();
		int red = (int) (c.getRed() * (1 - darker));
 		int green = (int) (c.getGreen() * (1 - darker));
 		int blue = (int) (c.getBlue() * (1 - darker));
 		setColor(new Color(red, green, blue));
	}
}