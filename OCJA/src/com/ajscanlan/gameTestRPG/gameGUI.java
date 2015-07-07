package com.ajscanlan.gameTestRPG;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gameGUI {

	JLabel currentHP = new JLabel("");
	JLabel currentMP = new JLabel("");
	JLabel currentLevel = new JLabel("");
	JLabel currentXP = new JLabel("");
	JLabel enemyCurrentHP = new JLabel("");

	GameLogic gL = new GameLogic();
	boolean quit = false;
	Person hero = new Person("Alex", 1, 0, 100, 50, new ImageIcon("C:\\Users\\User1\\Desktop\\workspace\\OCJA\\src\\com\\ajscanlan\\gameTestRPG\\mario.png"));
	Person enemy = new Person("Airwrecka Jones", 1, 0, 100, 50, new ImageIcon("C:\\Users\\User1\\Desktop\\workspace\\OCJA\\src\\com\\ajscanlan\\gameTestRPG\\enemy.gif"));
	
	
	public static void main(String[] args){
		gameGUI gui = new gameGUI();
		gui.setupUI();
		//gui.startGame();
	}



//	private void startGame() {
//		// TODO Auto-generated method stub
//		System.out.println(quit + " " + heroTurn);
//		while(!quit){
//			if(!heroTurn){
//				enemy.attack(hero);
//				System.out.println("the enemy has attacked");
//				heroTurn = true;
//			}
//		}
//	}



	private void setupUI() {
		// TODO Auto-generated method stub
		//Frame
		JFrame frame = new JFrame("GAME");
		frame.getContentPane().setBackground(new Color(153, 102, 51));
		frame.getContentPane().setLayout(null);
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//heroPanel.setBackground(new Color(153, 102, 51));
		
		//ImageIcon sprite = new ImageIcon("/mario.png");
		final JLabel heroLabel = new JLabel();
		heroLabel.setBounds(10, 11, 100, 100);
		frame.getContentPane().add(heroLabel);
		heroLabel.setIcon(hero.getSprite());
		
		final JLabel enemyLabel = new JLabel();
		enemyLabel.setBounds(474, 11, 100, 100);
		frame.getContentPane().add(enemyLabel);
		enemyLabel.setIcon(enemy.getSprite());
		
		
		JLabel lblHp = new JLabel("HP:");
		lblHp.setBounds(10, 122, 46, 14);
		frame.getContentPane().add(lblHp);
		
		JLabel lblMp = new JLabel("MP:");
		lblMp.setBounds(10, 147, 46, 14);
		frame.getContentPane().add(lblMp);
		
		JLabel lblXp = new JLabel("XP:");
		lblXp.setBounds(10, 172, 46, 14);
		frame.getContentPane().add(lblXp);
		
		JLabel nameLabel = new JLabel("");
		nameLabel.setBounds(120, 11, 46, 14);
		frame.getContentPane().add(nameLabel);
		nameLabel.setText(hero.getName());
		
		JLabel lblLevel = new JLabel("Level:");
		lblLevel.setBounds(10, 197, 46, 14);
		frame.getContentPane().add(lblLevel);
		
		
		currentHP.setBounds(53, 122, 46, 14);
		frame.getContentPane().add(currentHP);
		
		currentMP.setBounds(63, 147, 46, 14);
		frame.getContentPane().add(currentMP);
		
		
		currentXP.setBounds(64, 172, 46, 14);
		frame.getContentPane().add(currentXP);
		
		
		currentLevel.setBounds(64, 197, 46, 14);
		frame.getContentPane().add(currentLevel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(208, 251, 196, 100);
		frame.getContentPane().add(textArea);
		
		gL.refresh(currentHP, currentXP, currentMP, currentLevel, hero, enemy, enemyCurrentHP);
		
		//ACTION EVENY HANDLERS
		
		JButton btnAttack = new JButton("Attack");
		btnAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hero.attack(enemy);
				enemy.attack(hero);
				gL.refresh(currentHP, currentXP, currentMP, currentLevel, hero, enemy, enemyCurrentHP);
				gL.refreshSprite(heroLabel, enemyLabel, hero, enemy);
				//heroTurn = false;
			}
		});
		btnAttack.setBounds(10, 328, 89, 23);
		frame.getContentPane().add(btnAttack);
		
		JButton btnDefend = new JButton("Defend");
		btnDefend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hero.setDefend(true);
				enemy.attack(hero);
				gL.refresh(currentHP, currentXP, currentMP, currentLevel, hero, enemy, enemyCurrentHP);

			}
		});
		btnDefend.setBounds(10, 294, 89, 23);
		frame.getContentPane().add(btnDefend);
		
		JButton btnMagic = new JButton("Magic");
		btnMagic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enemy.attack(hero);
				gL.refresh(currentHP, currentXP, currentMP, currentLevel, hero, enemy, enemyCurrentHP);

			}
		});
		btnMagic.setBounds(109, 328, 89, 23);
		frame.getContentPane().add(btnMagic);
		
		JButton btnFlee = new JButton("Flee");
		btnFlee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("THERE IS NO ESCAPE");
			}
		});
		btnFlee.setBounds(109, 294, 89, 23);
		frame.getContentPane().add(btnFlee);
		
		JLabel lblHp_1 = new JLabel("HP:");
		lblHp_1.setBounds(474, 172, 46, 14);
		frame.getContentPane().add(lblHp_1);
		
		enemyCurrentHP.setBounds(528, 172, 46, 14);
		frame.getContentPane().add(enemyCurrentHP);
		
		frame.repaint();
	}
}
