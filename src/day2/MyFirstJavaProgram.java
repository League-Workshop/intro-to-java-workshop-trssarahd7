package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot bob = new Robot ();
	bob.setSpeed(500);
	bob.setRandomPenColor();
	bob.penDown();
	bob.move(100);
	bob.setRandomPenColor();
	bob.move(100);
	bob.setRandomPenColor();
	bob.miniaturize();
	bob.sparkle();
	bob.turn(90);
	bob.move(100);
	bob.expand();
	bob.setRandomPenColor();
	bob.turn(90);
	bob.move(100);
	bob.unSparkle();
	bob.setRandomPenColor();
	bob.move(100);
	bob.turn(90);
	bob.setRandomPenColor();
	bob.move(100);
	bob.sparkle();
	bob.unSparkle();
	bob.penUp();
	bob.hashCode();
	bob.move(200);
	
		
		
	}
}
