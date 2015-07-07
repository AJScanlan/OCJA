package com.ajscanlan.game;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;

public class GameFrame {
	public static void main(String[] args){
		JFrame frame = new JFrame("GAME");
		frame.getContentPane().setBackground(new Color(153, 102, 51));
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
