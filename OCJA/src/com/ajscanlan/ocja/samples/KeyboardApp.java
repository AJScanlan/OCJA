package com.ajscanlan.ocja.samples;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

@SuppressWarnings("serial")
public class KeyboardApp extends JPanel {

	Ball ball = new Ball();

	public KeyboardApp() {
		setBackground(Color.LIGHT_GRAY);
		KeyListener listener = new MyKeyListener();
		addKeyListener(listener);
		setFocusable(true);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mini Tennis");
		KeyboardApp keyboardExample = new KeyboardApp();
		frame.getContentPane().add(keyboardExample);
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		draw(g2d);
	}

	public void draw(Graphics2D g) {
		g.fillOval(ball.getX(), ball.getY(), 30, 30);
	}


	public class MyKeyListener implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
			if(KeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("Left")) ball.moveLeft();
			if(KeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("Right")) ball.moveRight();
			if(KeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("Down")) ball.moveDown();
			if(KeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("Up")) ball.moveUp();
			repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
		}
	}

	public class Ball {
		private int x;
		private int y;

		
		public void moveRight(){
			this.x+= 10;
		}

		public void moveLeft(){
			this.x-= 10;
		}

		public void moveUp(){
			this.y-= 10;
		}

		public void moveDown(){
			this.y+= 10;
		}
		
		
		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
	}
}