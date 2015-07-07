package com.ajscanlan.game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	int x = 0;
	int y = 0;
	int xa = 30;
	int ya = 30;

	private void moveBall() {
		if (x + xa < 0)
			xa = 30;
		if (x + xa > getWidth() - 30)
			xa = -30;
		if (y + ya < 0)
			ya = 30;
		if (y + ya > getHeight() - 30)
			ya = -30;
		
		x = x + xa;
		y = y + ya;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);      
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis");
		GamePanel game = new GamePanel();
		frame.add(game);
		frame.setSize(1000, 750);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			game.moveBall();
			game.repaint();
			Thread.sleep(5);
		}
	}
}