/*==================================================================================================
�� INFORMATION
  �� Data : Thursday - 14/06/18
  �� Mail : eun1310434@naver.com
  �� WebPage : https://eun1310434.github.io/
  �� Reference
     - http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/

�� Function
   �� Unit
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
        
        
�� Study
   �� Builder
     - Pattern used to create objects made from a bunch of other objects
     
   �� When you want to build an object made up from other objects

   �� When you want the creation of these parts to be independent of the main object

   �� Hide the creation of the parts from the client so both aren't dependent.

   �� The builder knows the specifics and nobody else does
==================================================================================================*/
package com.eun1310434.designpattern.builder;

//The director / engineer class creates a Robot using the builder interface that is defined 

public class RobotEngineer {
	
	private RobotBuilder robotBuilder;
	
	// OldNewRobotBuilder specification is sent to the engineer
	public RobotEngineer(RobotBuilder robotBuilder){this.robotBuilder = robotBuilder;}
	
	// Return the Robot made from the OldNewRobotBuilder spec
	public Robot getRobot(){return this.robotBuilder.getRobot();}
	
	// Execute the methods specific to the RobotBuilder that implements RobotBuilder (OldNewRobotBuilder)
	public void makeRobot() {
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}
}