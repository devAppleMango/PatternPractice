package abstractfactory.factory;

import abstractfactory.soldier.AbstractArmyRobot;
import abstractfactory.soldier.AbstractNavyRobot;
import abstractfactory.soldier.SouthArmyRobot;
import abstractfactory.soldier.SouthNavyRobot;

public class SouthRobotFactory implements AbstractRobotFactory {

	public AbstractArmyRobot createArmyRobot() {
		return new SouthArmyRobot();
	}

	public AbstractNavyRobot createNavyRobot() {
		return new SouthNavyRobot();
	}
	
}
