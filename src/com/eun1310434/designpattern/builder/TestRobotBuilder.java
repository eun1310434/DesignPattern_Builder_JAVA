/*==================================================================================================
¡à INFORMATION
  ¡Û Data : Thursday - 14/06/18
  ¡Û Mail : eun1310434@naver.com
  ¡Û WebPage : https://eun1310434.github.io/
  ¡Û Reference
     - http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/

¡à Function
   ¡Û Unit
      - public interface RobotPlan
        01) public void setRobotHead(String head)
        02) public void setRobotTorso(String torso)
        03) public void setRobotArms(String arms)
        04) public void setRobotLegs(String legs)

      - public class Robot implements RobotPlan
        01) public void setRobotHead(String head)
        02) public String getRobotHead()
        03) public void setRobotTorso(String torso)
        04) public String getRobotTorso()	
        05) public void setRobotArms(String arms)
        06) public String getRobotArms()
        07) public void setRobotLegs(String legs)
        08) public String getRobotLegs()

      - public interface RobotBuilder
        01) public void buildRobotHead();
        02) public void buildRobotTorso();
        03) public void buildRobotArms();
        04) public void buildRobotLegs();
        05) public Robot getRobot();

      - public class OldRobotBuilder implements RobotBuilder
        01) public OldRobotBuilder()
        02) public void buildRobotHead()
        03) public void buildRobotTorso()
        04) public void buildRobotArms()
        05) public void buildRobotLegs()
        06) public Robot getRobot()
	

      - public class NewRobotBuilder implements RobotBuilder
        01) public OldRobotBuilder()
        02) public void buildRobotHead()
        03) public void buildRobotTorso()
        04) public void buildRobotArms()
        05) public void buildRobotLegs()
        06) public Robot getRobot()
	

      - public class TestRobotBuilder 
        01) public static void main(String[] args)
        
        
¡à Study
   ¡Û Builder
     - Pattern used to create objects made from a bunch of other objects
     
   ¡Û When you want to build an object made up from other objects

   ¡Û When you want the creation of these parts to be independent of the main object

   ¡Û Hide the creation of the parts from the client so both aren't dependent.

   ¡Û The builder knows the specifics and nobody else does
==================================================================================================*/
package com.eun1310434.designpattern.builder;

public class TestRobotBuilder {
	
	public static void main(String[] args){
		
		// Get a RobotBuilder of type OldRobotBuilder
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		// Get a RobotBuilder of type OldRobotBuilder
		RobotBuilder newStyleRobot = new NewRobotBuilder();
		
		// Pass the OldRobotBuilder specification to the engineer
		RobotEngineer robotEngineer[] = new RobotEngineer[2];
		robotEngineer[0] = new RobotEngineer(oldStyleRobot);
		robotEngineer[1] = new RobotEngineer(newStyleRobot);
		
		// Tell the engineer to make the Robot using the specifications
		// of the OldRobotBuilder class
		robotEngineer[0].makeRobot();
		robotEngineer[1].makeRobot();
		
		
		// The engineer returns the right robot based off of the spec
		Robot firstRobot = robotEngineer[0].getRobot();
		System.out.println("Fist Robot Built");
		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
		System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
		System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
		
		System.out.println("");

		// The engineer returns the right robot based off of the spec
		Robot secondRobot = robotEngineer[1].getRobot();
		System.out.println("Second Robot Built");
		System.out.println("Robot Head Type: " + secondRobot.getRobotHead());
		System.out.println("Robot Torso Type: " + secondRobot.getRobotTorso());
		System.out.println("Robot Arm Type: " + secondRobot.getRobotArms());
		System.out.println("Robot Leg Type: " + secondRobot.getRobotLegs());
	}
	
}