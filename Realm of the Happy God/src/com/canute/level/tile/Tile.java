package com.canute.level.tile;

import com.canute.graphics.Screen;
import com.canute.graphics.Sprite;

public class Tile
{
	
	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile grass2 = new GrassTile(Sprite.grass2);
	public static Tile grass3 = new GrassTile(Sprite.grass3);
	public static Tile flower = new FlowerTile(Sprite.flower);
	public static Tile flower2 = new FlowerTile(Sprite.flower2);
	public static Tile tree = new TreeTile(Sprite.tree);
	public static Tile rock = new RockTile(Sprite.rock);
	public static Tile woodfloor = new FloorTile(Sprite.woodfloor);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	
	public Tile(Sprite sprite)
	{
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen)
	{
		
	}
	
	public boolean solid()
	{
		return false;
	}

}
