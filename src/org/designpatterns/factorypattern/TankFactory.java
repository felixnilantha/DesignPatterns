package org.designpatterns.factorypattern;

public class TankFactory {
	
	// Factory method creating tank factories
	public EnemyTank createTank(String tankType){
		
		
		if(tankType.equals("ALT")){
			return new ArmyLeopardTank();
		}else if(tankType.equals("MT")){
			return new MerkavaTank();
		}else return null;
	}

}
