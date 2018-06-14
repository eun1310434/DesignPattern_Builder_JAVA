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



�� Study
   �� Builder
     - Pattern used to create objects made from a bunch of other objects
     
   �� When you want to build an object made up from other objects

   �� When you want the creation of these parts to be independent of the main object

   �� Hide the creation of the parts from the client so both aren't dependent.

   �� The builder knows the specifics and nobody else does
==================================================================================================*/

package com.eun1310434.designpattern.builder;
// This is the interface that will be returned from the builder

public interface RobotPlan{
	
	public void setRobotHead(String head);
	
	public void setRobotTorso(String torso);
	
	public void setRobotArms(String arms);
	
	public void setRobotLegs(String legs);
	
}