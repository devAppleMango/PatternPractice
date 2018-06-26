package abstractfactory;

import abstractfactory.factory.AbstractRobotFactory;
import abstractfactory.soldier.AbstractArmyRobot;
import abstractfactory.soldier.AbstractNavyRobot;

public class TrainingCamp {
	private AbstractRobotFactory factory;
	
	public void setFactory(AbstractRobotFactory factory) {
		this.factory = factory;
	}

	public void buildArmyAndNavy() {
		if(factory == null)
			System.out.println("Set factory first!");
		
		AbstractArmyRobot armyRobot1 = factory.createArmyRobot();
		AbstractArmyRobot armyRobot2 = factory.createArmyRobot();
		AbstractArmyRobot armyRobot3 = factory.createArmyRobot();
		
		armyRobot1.getIn();
		armyRobot2.getIn();
		armyRobot3.getIn();
		System.out.println("The jeep departs");
		
		AbstractNavyRobot navyRobot1 = factory.createNavyRobot();
		AbstractNavyRobot navyRobot2 = factory.createNavyRobot();
		
		navyRobot1.embark();
		navyRobot2.embark();
		System.out.println("The ship departs");
	}
}
