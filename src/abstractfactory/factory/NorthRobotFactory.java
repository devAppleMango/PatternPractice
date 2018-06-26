package abstractfactory.factory;

import abstractfactory.soldier.AbstractArmyRobot;
import abstractfactory.soldier.AbstractNavyRobot;
import abstractfactory.soldier.NorthArmyRobot;
import abstractfactory.soldier.NorthNavyRobot;

public class NorthRobotFactory implements AbstractRobotFactory {

	public AbstractArmyRobot createArmyRobot() {
		return new NorthArmyRobot();
	}

	public AbstractNavyRobot createNavyRobot() {
		return new NorthNavyRobot();
	}
	
}
