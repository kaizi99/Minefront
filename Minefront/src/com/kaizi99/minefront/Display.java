package com.kaizi99.minefront;

import java.awt.Canvas;
import javax.swing.JFrame;

public class Display  extends Canvas{

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final String TITLE = "Minefront - PRE ALPHA 0.0.1";
	
	private Thread threads;
	
	public static void main(String[] args) {
		Display game = new Display();
		JFrame frame = new JFrame();
		frame.add(game);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(TITLE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		System.out.println("Running...");
	}

}
