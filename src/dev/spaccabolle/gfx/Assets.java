package dev.spaccabolle.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	
	private static final int NUM_BOLLE = 5;

	public static BufferedImage[] btn_start,ballGroup;
	
	public static BufferedImage bolzero = null;
	
	public static BufferedImage cannon,arrow,dark_background;
	
	public static BufferedImage bolzero = null;
	
	public static BufferedImage readBobble = null;
	private static final int NUM_BOLLE = 5;
	public static void init(){
		
		System.out.println("Prova");
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/res/textures/sheet.png"));
		cannon=ImageLoader.loadImage("/res/textures/cannone.png");
	        arrow=ImageLoader.loadImage("/res/textures/freccia.png");
	        dark_background=ImageLoader.loadImage("/res/textures/dark_background.jpg");
		btn_start = new BufferedImage[2];
		btn_start[0] = sheet.crop(width * 6, height * 4, width * 2, height);
		btn_start[1] = sheet.crop(width * 6, height * 5, width * 2, height);
		ballGroup = new BufferedImage[NUM_BOLLE];

	    ballGroup[1] = ImageLoader.loadImage("/res/textures/staticRedBall.png");
	    ballGroup[2] = ImageLoader.loadImage("/res/textures/staticBlueBall.png");
	    ballGroup[3] = ImageLoader.loadImage("/res/textures/staticGreenBall.png");
	    ballGroup[4] = ImageLoader.loadImage("/res/textures/staticYellowBall.png");
	    
	    	

	        ballGroup[1] = ImageLoader.loadImage("/res/textures/staticRedBall.png");
	        ballGroup[2] = ImageLoader.loadImage("/res/textures/staticBlueBall.png");
	        ballGroup[3] = ImageLoader.loadImage("/res/textures/staticGreenBall.png");
	        ballGroup[4] = ImageLoader.loadImage("/res/textures/staticYellowBall.png");

	}
	
}