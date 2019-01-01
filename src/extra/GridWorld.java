package extra;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World Programmers = new World();
		Programmers.show();

		Bug HoneyBee = new Bug();

		Location Hawaii = new Location(4, 3);

		Programmers.add(Hawaii, HoneyBee);

		Bug LadyBug = new Bug();

		Location SanDiego = new Location(1, 8);

		Programmers.add(SanDiego, LadyBug);

		LadyBug.setColor(Color.WHITE);

		LadyBug.turn();
		LadyBug.turn();

		// Location HawaiiLeft = new Location(1, 7);
		// Location HawaiiRight = new Location(1, 9);

		// Programmers.add(HawaiiLeft, Frangipani);
		// Programmers.add(HawaiiRight, Frangipani);

		/*for (int r = 0; r <= 9; r++) {
			for (int c = 0; c <= 9; c++) {
				if (r < 4 && c < 5) {
					Flower Frangipani = new Flower(Color.BLUE);
					Location Flowers = new Location(r, c);
					Programmers.add(Flowers, Frangipani);
				}

				else if (r % 2 == 0) {
					Flower Frangipani = new Flower(Color.RED);
					// Frangipani.setColor(Color.PINK);
					Location Flowers = new Location(r, c);
					Programmers.add(Flowers, Frangipani);
				}

				else if (r % 2 == 1) {

					Flower Frangipani = new Flower(Color.WHITE);
					// Frangipani.setColor(Color.WHITE);
					Location Flowers = new Location(r, c);
					Programmers.add(Flowers, Frangipani);
				}

			}
		}*/
		
		// row = i
		//column = f
		//other = t
		for(int i = 0; i <= 9; i ++) {
			Location Bugs = new Location(i, i);
			Programmers.add(Bugs, HoneyBee);
		}
		
		for(int f = 0; f  <= 9; f++) {
			for(int t = 9; t <= 0; t--) {
				Location Bugs = new Location(f, t);
				Programmers.add(Bugs, HoneyBee);
			}
		}

	}
}
