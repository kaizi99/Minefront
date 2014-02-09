package com.kaizi99.minefront;

import java.awt.Canvas;

import javax.swing.JFrame;

import com.kaizi99.minefront.graphics.Render;

public class Display extends Canvas implements Runnable{

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final String TITLE = "Minefront - PRE ALPHA 0.0.1";

	private Thread threads;
	private boolean running = false;
	private Render render;

	public Display() {
		render = new Render(WIDTH, HEIGHT);
	}
	
	private void start() {
		if (running) {
			return;
		}
		
		running = true;
		threads = new Thread(this);
		threads.start();
		
		System.out.println("WORKING!!!");
	}

	private void stop() {
		if(!running) {
			return;
		}
		
		running = false;
		
		try {
			threads.join();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void run() {
		while(running) {
			tick();
			render();
		}
	}
	
	private void tick() {
		
	}
	
	private void render() {
		
	}
	
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
		game.start();
	}

}
