package com.canute.level;

import com.canute.graphics.Screen;
import com.canute.level.tile.Tile;

public class Level {

	protected int width, height;
	protected int[] tilesInt;
	protected int[] tiles;

	public Level(int width, int height)
	{
		this.width = width;
		this.height = height;
		tilesInt = new int[width * height];
		generateLevel();
	}

	public Level(String path) {
		loadLevel(path);
		generateLevel();
	}

	protected void generateLevel() 
	{
		System.out.println("Generation of Random Level");
	}

	protected void loadLevel(String path) {
		System.out.println("Loading premade Level");
	}

	public void update() {

	}

	private void time() {

	}

	public void render(int xScroll, int yScroll, Screen screen)
	{
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width + 16) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height + 16) >> 4;

		for (int y = y0; y < y1; y++)
		{
			for (int x = x0; x < x1; x++)
			{
				getTile(x, y).render(x, y, screen);
			}
		}
	}

	//Grass = 0xFF00FF00
	//Grass2 = 0xFF00D100
	//Grass3 = 0xFF00A800
	//Flower = 0xFFFFFF00
	//Flower2 = 0xFFD000FF
	//Rock = 0xFF7F7F00
	
	public Tile getTile(int x, int y) {
		if (x < 0 || y < 0 || x >= width || y >= height) {
			return Tile.voidTile;
		}
		if (tiles[x + y * width] == 0xFF00FF00)
			return Tile.grass;
		if (tiles[x + y * width] == 0xFF00D100)
			return Tile.grass2;
		if (tiles[x + y * width] == 0xFF00A800)
			return Tile.grass3;
		if (tiles[x + y * width] == 0xFFFFFF00)
			return Tile.flower;
		if (tiles[x + y * width] == 0xFFD000FF)
			return Tile.flower2;
		if (tiles[x + y * width] == 0xFF7F7F00)
			return Tile.rock;
		if (tiles[x + y * width] == 0xFF823400)
			return Tile.woodfloor;
		
		return Tile.voidTile;
	}

}
