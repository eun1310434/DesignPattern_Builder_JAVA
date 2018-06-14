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

//The concrete builder class that assembles the parts of the finished Robot object
public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder() {this.robot = new Robot();}
	public void buildRobotHead() {robot.setRobotHead("OldRobot Head");}
	public void buildRobotTorso() {robot.setRobotTorso("OldRobot Torso");}
	public void buildRobotArms() {robot.setRobotArms("OldRobot Arms");}
	public void buildRobotLegs() {robot.setRobotLegs("OldRobot Legs");}
	public Robot getRobot() {return this.robot;}
}