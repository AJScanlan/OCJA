package com.ajscanlan.gameTestRPG;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GameLogic {

	void refresh(JLabel HP, JLabel XP, JLabel MP, JLabel level, Person hero, Person enemy, JLabel enemyCurrentHP){
		HP.setText(Integer.toString(hero.getHP()));
		XP.setText(Integer.toString(hero.getXP()));
		MP.setText(Integer.toString(hero.getMP()));
		level.setText(Integer.toString(hero.getLevel()));
		enemyCurrentHP.setText(Integer.toString(enemy.getHP()));
		
	}
	
	void refreshSprite(JLabel heroSprite, JLabel enemySprite, Person hero, Person enemy){
		heroSprite.setIcon(hero.getSprite());
		enemySprite.setIcon(enemy.getSprite());
	}
	
}
