package abstractfactory.factory;

import abstractfactory.soldier.AbstractArmyRobot;
import abstractfactory.soldier.AbstractNavyRobot;

public interface AbstractRobotFactory {
	
	public AbstractArmyRobot createArmyRobot();
	
	public AbstractNavyRobot createNavyRobot();
}
