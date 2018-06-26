package abstractfactory;

import abstractfactory.factory.NorthRobotFactory;
import abstractfactory.factory.SouthRobotFactory;

public class Main {
	public static void main(String [] args) {
		TrainingCamp camp = new TrainingCamp();
				
		camp.setFactory(new NorthRobotFactory());
		camp.buildArmyAndNavy();
		
		camp.setFactory(new SouthRobotFactory());
		camp.buildArmyAndNavy();
	}
}
