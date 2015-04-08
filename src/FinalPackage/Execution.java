package FinalPackage;
import java.util.Random;

public class Execution {
	static GUIFinalProject Gframe = new GUIFinalProject();
	public synchronized static void main(String args[])  {			
			int i = 10;
			Gframe.setVisible(true);
			while ( i != 0)
			{
				Random ID = new Random();
				int patientID = ID.nextInt(1000);
				Patient appoitment = new Patient("Patient ID -  " + patientID );
				appoitment.start();
//				GUIFinalProject.main(args);
			}
	}
}