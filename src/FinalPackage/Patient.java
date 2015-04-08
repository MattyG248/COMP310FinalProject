package FinalPackage;
import java.util.Random;

class Patient extends Execution implements Runnable {
	   private Thread thread;
	   protected static String Patient;
//	   int count = 0;

	   public Patient() {
		   
	   }
	    Patient(String name) {
	       Patient = name;
	       Random random = new Random();
	       Gframe.textPane_1.setText(Gframe.textPane_1.getText() + Patient + '\n'); //arrived Patients
//	       System.out.println( Patient + " Arriving at Appointment." + "\n");
	       synchronized(this){
			   int ranInteger = random.nextInt(45);
			   try {
				for (int a = 0; a <=1; a++)   
				Thread.sleep(1000);
				Gframe.textPane_1.setText(null);
				Gframe.textPane_2.setText(Gframe.textPane_2.getText() + Patient + '\n'); //Patients Waiting
				Gframe.textPane.setText(Gframe.textPane.getText() + ranInteger + " minutes" + '\n'); //Wait time
//				System.out.println("Wait for " + Patient + " is " + ranInteger + " minutes.  " + "\n");
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
		   }
	   }

	public synchronized void run() {
		   	  Random examTime = new Random();
		   	  int total = 0;
		      synchronized(this)
		   	  {
		    	  	int exam = examTime.nextInt(35);
		            for(int i=0; i<1 ; i++){
		                total += i;
		                Gframe.textPane_6.setText(Gframe.textPane_6.getText() + exam + " minutes" + '\n');
//		                System.out.println("In Examination: " +  Patient + " Exam Time:  " + exam + " minutes." + "\n");
		            }
		            notify();
	      
	      
		      	}
		      Gframe.textPane_3.setText(null);
		      Gframe.textPane_4.setText(Gframe.textPane_4.getText() + Patient + '\n');
//		      System.out.println("Appoitment Ended:  " +  Patient + " exiting." + "\n");
		      }
	public synchronized void start ()
	   {
		Gframe.textPane_2.setText(null);
		Gframe.textPane.setText(null);
		Gframe.textPane_3.setText(Gframe.textPane_3.getText() + Patient + '\n'); //Patients being Examined
//	      System.out.println("Starting Examination:  " +  Patient + "\n");
	      if (thread == null)
	      {
	         thread = new Thread (this, Patient);
	         thread.start ();
	      }
	      
	   }
	
	
	
}