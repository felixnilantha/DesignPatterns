package org.designpatterns.factorypattern;

public abstract class EnemyTank {
	
	private String name;
	private double damage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	
	public void targetOnHero(){
		System.out.println(getName() + " is targetting on hero");
	}
	
	public void displayEnemyTank(){
		System.out.println(getName() + " is visible");
		
	}
	
	public void AttackOnHero(){
		System.out.println(getName() + " attacking and " + getDamage() +" is done");
	}

}
