package com.ajscanlan.gameTestRPG;

import java.util.Random;

import javax.swing.ImageIcon;

public class Person {
	
	//State
	String name;
	int level, XP, HP, MP, attack = 5, defense = 5;
	ImageIcon sprite;
	Random randy = new Random();
	boolean defend;
	
	
	//Behaviour
	//Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getXP() {
		return XP;
	}

	public void setXP(int xP) {
		XP = xP;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		MP = mP;
	}

	public ImageIcon getSprite() {
		return sprite;
	}

	public void setSprite(ImageIcon sprite) {
		this.sprite = sprite;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	

	public Person(String name, int level, int xP, int hP, int mP, ImageIcon sprite) {
		super();
		this.name = name;
		this.level = level;
		XP = xP;
		HP = hP;
		MP = mP;
		this.sprite = sprite;
	}
	
	public void attack(Person person){
		
		int attackPower = (this.getLevel() + 1) * (randy.nextInt(2 * this.getAttack()) + 5);
		System.out.println(attackPower);
		
		if(person.isDefend()){
			attackPower = attackPower / (this.getDefense() + 5);
			person.setDefend(false);
		}
		
		person.setHP(person.getHP() - attackPower);
		person.dead();
		
	}
	
	public boolean isDefend() {
		// TODO Auto-generated method stub
		return this.defend;
	}
	
	public void setDefend(Boolean defend) {
		this.defend = defend;
	}
	
	public void dead(){
		if(this.getHP() < 1){
			System.out.println("dead");
			this.setSprite(new ImageIcon("C:\\Users\\User1\\Desktop\\workspace\\OCJA\\src\\com\\ajscanlan\\gameTestRPG\\tomb.png"));
		}
	}
}
