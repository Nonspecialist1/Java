import javax.swing.JOptionPane; 

import org.DimmingLights;
import org.Elevator;
import org.Security;
import org.Lighting;

public class OkJavaGoToHomeInput {

	public static void main(String[] args) {
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" / mood Lamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}
}
