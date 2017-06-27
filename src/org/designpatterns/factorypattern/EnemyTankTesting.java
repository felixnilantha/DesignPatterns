package org.designpatterns.factorypattern;

import java.util.Scanner;

public class EnemyTankTesting {

	public static void main(String[] args) {
		
		TankFactory tankFactory = new TankFactory();
		EnemyTank enemytank= null;
		Scanner inputTank = null;
		try {
			inputTank = new Scanner(System.in);
			System.out.println("Select tank for battle ? (ALT / MT)");

			String tankSelected = "";
			if (inputTank.hasNext()) {
				tankSelected = inputTank.nextLine();
				
				enemytank = tankFactory.createTank(tankSelected);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			inputTank.close();
		}
		
		if(enemytank !=null ){
			onBattleField(enemytank);
		}

		

	}

	private static void onBattleField(EnemyTank enemyTank) {
		enemyTank.displayEnemyTank();
		enemyTank.targetOnHero();
		enemyTank.AttackOnHero();

	}

}
