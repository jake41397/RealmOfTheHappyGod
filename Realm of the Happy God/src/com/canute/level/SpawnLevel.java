package com.canute.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.canute.level.tile.Tile;

public class SpawnLevel extends Level{

	public SpawnLevel(String path) {
		super(path);
	}
	
	protected void loadLevel(String path)
	{
		System.out.println(path);
		try 
		{
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			int w = width = image.getWidth();
			int h = height = image.getHeight();
			tiles = new int[w * h];
			image.getRGB(0, 0, w, h, tiles, 0, w);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
			System.out.println("Exception! Could not load level file!");
		}
	}

	protected void generateLevel() 
	{
	}

}
