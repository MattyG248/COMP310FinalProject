package FinalPackage;
import java.util.Random;
import java.awt.GridBagLayout;
import java.awt.Color;

public class Execution {
	static GUIFinalProject Gframe = new GUIFinalProject();
	public synchronized static void main(String args[])  {			
			int i = 10;
			GridBagLayout gridBagLayout = (GridBagLayout) Gframe.getContentPane().getLayout();
			gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 90, 0, 0, 0, 0, 0, 0, 0};
			Gframe.getContentPane().setBackground(Color.RED);
			Gframe.setBackground(Color.RED);
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