package FinalPackage;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JTextPane;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class GUIFinalProject extends JFrame {
	JTextPane textPane_1 = new JTextPane();
	JTextPane textPane_2 = new JTextPane();
	JTextPane textPane = new JTextPane();
	JTextPane textPane_3 = new JTextPane();
	JTextPane textPane_4 = new JTextPane();
	JTextPane textPane_6 = new JTextPane();
	protected String text = "Hello";
//	Patient p = new Patient();
//	Execution E = new Execution();
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIFinalProject f = new GUIFinalProject();
					f.setVisible(true);
					Execution.main(args);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public GUIFinalProject() {
//		Patient = text;
//		Patient p = new Patient(text);
//		String[] args={};
		setTitle("Java Project");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 425);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{50, 100, 50, 100, 50, 50, 50, 100, 50, 100, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 249, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JTextPane txtpnAppointmentsForPatients = new JTextPane();
		txtpnAppointmentsForPatients.setEditable(false);
		txtpnAppointmentsForPatients.setText("Appointments for Patients");
		GridBagConstraints gbc_txtpnAppointmentsForPatients = new GridBagConstraints();
		gbc_txtpnAppointmentsForPatients.gridwidth = 13;
		gbc_txtpnAppointmentsForPatients.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnAppointmentsForPatients.fill = GridBagConstraints.VERTICAL;
		gbc_txtpnAppointmentsForPatients.gridx = 0;
		gbc_txtpnAppointmentsForPatients.gridy = 0;
		getContentPane().add(txtpnAppointmentsForPatients, gbc_txtpnAppointmentsForPatients);
		
		JTextPane txtpnArrivedPatientId = new JTextPane();
		txtpnArrivedPatientId.setText("Arrived Patient ID");
		txtpnArrivedPatientId.setEditable(false);
		GridBagConstraints gbc_txtpnArrivedPatientId = new GridBagConstraints();
		gbc_txtpnArrivedPatientId.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnArrivedPatientId.fill = GridBagConstraints.BOTH;
		gbc_txtpnArrivedPatientId.gridx = 1;
		gbc_txtpnArrivedPatientId.gridy = 1;
		getContentPane().add(txtpnArrivedPatientId, gbc_txtpnArrivedPatientId);
		
		JTextPane txtpnPatientsWaiting = new JTextPane();
		txtpnPatientsWaiting.setText("Patients Waiting");
		txtpnPatientsWaiting.setEditable(false);
		GridBagConstraints gbc_txtpnPatientsWaiting = new GridBagConstraints();
		gbc_txtpnPatientsWaiting.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnPatientsWaiting.fill = GridBagConstraints.BOTH;
		gbc_txtpnPatientsWaiting.gridx = 3;
		gbc_txtpnPatientsWaiting.gridy = 1;
		getContentPane().add(txtpnPatientsWaiting, gbc_txtpnPatientsWaiting);
		
		JTextPane txtpnPatientsBeingExamined = new JTextPane();
		txtpnPatientsBeingExamined.setEditable(false);
		txtpnPatientsBeingExamined.setText("Wait time");
		GridBagConstraints gbc_txtpnPatientsBeingExamined = new GridBagConstraints();
		gbc_txtpnPatientsBeingExamined.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnPatientsBeingExamined.fill = GridBagConstraints.BOTH;
		gbc_txtpnPatientsBeingExamined.gridx = 5;
		gbc_txtpnPatientsBeingExamined.gridy = 1;
		getContentPane().add(txtpnPatientsBeingExamined, gbc_txtpnPatientsBeingExamined);
		
		JTextPane txtpnPatientsDone = new JTextPane();
		txtpnPatientsDone.setEditable(false);
		txtpnPatientsDone.setText("Patients Done");
		GridBagConstraints gbc_txtpnPatientsDone = new GridBagConstraints();
		gbc_txtpnPatientsDone.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnPatientsDone.fill = GridBagConstraints.BOTH;
		gbc_txtpnPatientsDone.gridx = 7;
		gbc_txtpnPatientsDone.gridy = 1;
		getContentPane().add(txtpnPatientsDone, gbc_txtpnPatientsDone);
		
		JTextPane txtpnExamTime = new JTextPane();
		txtpnExamTime.setText("Exam Time");
		txtpnExamTime.setEditable(false);
		GridBagConstraints gbc_txtpnExamTime = new GridBagConstraints();
		gbc_txtpnExamTime.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnExamTime.fill = GridBagConstraints.BOTH;
		gbc_txtpnExamTime.gridx = 9;
		gbc_txtpnExamTime.gridy = 1;
		getContentPane().add(txtpnExamTime, gbc_txtpnExamTime);
		
		GridBagConstraints gbc_textPane_1 = new GridBagConstraints();
		gbc_textPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_textPane_1.fill = GridBagConstraints.BOTH;
		gbc_textPane_1.gridx = 1;
		gbc_textPane_1.gridy = 2;
		textPane_1.setEditable(false);
		getContentPane().add(textPane_1, gbc_textPane_1);
//		if(Patient == null) {
//			p.Patient = text;
//		}
//			textPane_1.setText(textPane_1.getText() + p.Patient + '\n');
//		textPane_1.setText(text);
		
		GridBagConstraints gbc_textPane_2 = new GridBagConstraints();
		gbc_textPane_2.insets = new Insets(0, 0, 0, 5);
		gbc_textPane_2.fill = GridBagConstraints.BOTH;
		gbc_textPane_2.gridx = 3;
		gbc_textPane_2.gridy = 2;
		getContentPane().add(textPane_2, gbc_textPane_2);
		
		textPane.setEditable(false);
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.insets = new Insets(0, 0, 0, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 5;
		gbc_textPane.gridy = 2;
		getContentPane().add(textPane, gbc_textPane);
		
		
		textPane_4.setEditable(false);
		GridBagConstraints gbc_textPane_4 = new GridBagConstraints();
		gbc_textPane_4.insets = new Insets(0, 0, 0, 5);
		gbc_textPane_4.fill = GridBagConstraints.BOTH;
		gbc_textPane_4.gridx = 7;
		gbc_textPane_4.gridy = 2;
		getContentPane().add(textPane_4, gbc_textPane_4);
		
		textPane_6.setEditable(false);
		GridBagConstraints gbc_textPane_6 = new GridBagConstraints();
		gbc_textPane_6.insets = new Insets(0, 0, 0, 5);
		gbc_textPane_6.fill = GridBagConstraints.BOTH;
		gbc_textPane_6.gridx = 9;
		gbc_textPane_6.gridy = 2;
		getContentPane().add(textPane_6, gbc_textPane_6);
	}
}
