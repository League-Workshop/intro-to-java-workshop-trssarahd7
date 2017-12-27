package day2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot bob = new Robot ();
	
	

	void go() {
	
bob.setSpeed(200);
bob.setPenWidth(5);

		// 6. Do steps #7 to #8 four times...


for(int i = 0; i<4; i++) {
	drawSquare();
	bob.turn(90);
}
}
	
	
	void drawSquare() { 
		for(int i = 0; i<4; i++) {
			bob.setRandomPenColor();
			bob.penDown();
			bob.move(150);
			bob.turn(90);
			
		}
	
	
		
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



