package test1;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;


public class studinfo {

	private JFrame frmStudentInformation;
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField courseTextField;
	private JTextField scoreTextField;
	private JTextField totalTextField;
	private JTextField gradeTextField;
	private JTextField remTextField;
	private ButtonGroup bg = new ButtonGroup();
	
	//static File newFile = new File("D:\\cpe121Java\\student.csv");
	static FileWriter fileWriter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					fileWriter = new FileWriter("D:\\cpe121Java\\student.csv",true); 
					studinfo window = new studinfo();
					window.frmStudentInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public studinfo() {
		initialize();
	}

	// determines exam grade remark
		private String getRemarks(int grade) {  
	String remark;
			if (grade>=96) remark="Excellent";
			else if (grade>=90 && grade<96) remark="Good";
			else if (grade>=85 && grade<90) remark="Average";
			else if (grade>=80 && grade<85) remark="Fair";
			else if (grade>=75 && grade<80) remark="Poor";
			else remark="Fail";
			return remark;
		}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentInformation = new JFrame();
		frmStudentInformation.setBackground(new Color(21, 52, 72));
		frmStudentInformation.getContentPane().setBackground(new Color(60, 91, 111));
		frmStudentInformation.setForeground(new Color(60, 91, 111));
		frmStudentInformation.setFont(new Font("Dialog", Font.BOLD, 14));
		frmStudentInformation.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Peter\\Desktop\\REELS\\Logo.png"));
		frmStudentInformation.setTitle("Student Information");
		frmStudentInformation.setBounds(100, 100, 535, 297);
		frmStudentInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentInformation.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(223, 208, 184));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Personal Data", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(21, 52, 72)));
		panel.setBounds(10, 10, 247, 215);
		frmStudentInformation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setBounds(11, 31, 45, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setBounds(11, 54, 45, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Course :");
		lblNewLabel_2.setBounds(11, 83, 60, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Year :");
		lblNewLabel_3.setBounds(11, 109, 45, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender :");
		lblNewLabel_4.setBounds(11, 148, 60, 13);
		panel.add(lblNewLabel_4);
		
		idTextField = new JTextField();
		idTextField.setBounds(66, 28, 172, 19);
		panel.add(idTextField);
		idTextField.setColumns(10);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(66, 54, 172, 19);
		panel.add(nameTextField);
		nameTextField.setColumns(10);
		
		courseTextField = new JTextField();
		courseTextField.setBounds(66, 80, 172, 19);
		panel.add(courseTextField);
		courseTextField.setColumns(10);
		
		JComboBox yearcomboBox = new JComboBox();
		yearcomboBox.setBounds(66, 106, 172, 21);
		panel.add(yearcomboBox);
		
		for (int i=1;i<=4;i++) 		
			yearcomboBox.addItem(i);

		JRadioButton rdbtnFemaleRadioButton = new JRadioButton("Female");
		rdbtnFemaleRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnFemaleRadioButton.setBounds(77, 144, 81, 21);
		panel.add(rdbtnFemaleRadioButton);
		
		JRadioButton rdbtnMaleRadioButton = new JRadioButton("Male");
		rdbtnMaleRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnMaleRadioButton.setBounds(165, 144, 59, 21);
		panel.add(rdbtnMaleRadioButton);
		
		bg.add(rdbtnFemaleRadioButton);
		bg.add(rdbtnMaleRadioButton);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(223, 208, 184));
		panel_1.setBorder(new TitledBorder(null, "Exam Result", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(264, 10, 247, 215);
		frmStudentInformation.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Score :");
		lblNewLabel_5.setBounds(12, 31, 45, 13);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Total Points :");
		lblNewLabel_6.setBounds(12, 57, 81, 13);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Grade :");
		lblNewLabel_7.setBounds(12, 86, 45, 13);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Remarks :");
		lblNewLabel_8.setBounds(12, 115, 69, 13);
		panel_1.add(lblNewLabel_8);
		
		scoreTextField = new JTextField();
		scoreTextField.setBounds(95, 28, 144, 19);
		panel_1.add(scoreTextField);
		scoreTextField.setColumns(10);
		
		totalTextField = new JTextField();
		totalTextField.setBounds(95, 54, 144, 19);
		panel_1.add(totalTextField);
		totalTextField.setColumns(10);
		
		gradeTextField = new JTextField();
		gradeTextField.setEditable(false);
		gradeTextField.setBounds(95, 83, 144, 19);
		panel_1.add(gradeTextField);
		gradeTextField.setColumns(10);
		
		remTextField = new JTextField();
		remTextField.setEditable(false);
		remTextField.setBounds(95, 112, 144, 19);
		panel_1.add(remTextField);
		remTextField.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Requirement :");
		lblNewLabel_9.setBounds(12, 149, 81, 13);
		panel_1.add(lblNewLabel_9);
		
		JCheckBox chckbxClearanceCheckBox = new JCheckBox("Clearance");
		chckbxClearanceCheckBox.setBounds(96, 145, 143, 21);
		panel_1.add(chckbxClearanceCheckBox);
		
		JButton btnSubmitButton = new JButton("Submit");
		btnSubmitButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSubmitButton.setForeground(new Color(255, 255, 255));
		btnSubmitButton.setBackground(new Color(60, 91, 111));
		btnSubmitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id, name, course, gender, remarks, studStr;
				int year,grade;
				double score, total;				
				
				try {					
					score=total=0;
					id=idTextField.getText();
					name=nameTextField.getText();
					course=courseTextField.getText();
					year=(int)yearcomboBox.getSelectedItem();				
					gender=(rdbtnFemaleRadioButton.isSelected()) ? rdbtnFemaleRadioButton.getLabel() : rdbtnMaleRadioButton.getLabel();
					score=Double.parseDouble(scoreTextField.getText());
					total=Double.parseDouble(totalTextField.getText());					

					if (!id.isEmpty() && !name.isEmpty() && !course.isEmpty() && score>0 && total>0) // if no blank entries
					{
						grade=(int)((score/total)*100);
						remarks=getRemarks(grade);
						gradeTextField.setText(""+grade);
						remTextField.setText(remarks);	
						
						// backup display, for checking if input values are correctly obtained
						System.out.println("Id:"+id);
						System.out.println("Name:"+name);
						System.out.println("Course:"+course);
						System.out.println("Year:"+year);
						System.out.println("Gender:"+gender);
						System.out.println("Score:"+score);
						System.out.println("Total:"+total);

						System.out.println("Grade:"+grade);
						System.out.println("Remarks:"+remarks);
						System.out.println("Cleared:"+chckbxClearanceCheckBox.isSelected());	
						System.out.println();	
						
						// write the new student record into the csv file						  
						studStr=id+","+name+","+course+","+year+","+gender+","+score+","+total+","+grade+","+remarks+","+chckbxClearanceCheckBox.isSelected();
						System.out.println(studStr);
						fileWriter.append(studStr);  //or you may use .write(studStr);           
						fileWriter.append('\n');   // append a newline character to write the next student record on the next line
								        
					}//if
					else
					{
						JOptionPane.showMessageDialog(null,"Lacking data entry.","Error",JOptionPane.ERROR_MESSAGE);						
					}					
				}//try
				catch (Exception err)
				{				
					JOptionPane.showMessageDialog(null,"Lacking exam entry.","Error",JOptionPane.ERROR_MESSAGE);	
				}
		
			}
		});
		btnSubmitButton.setBounds(98, 172, 75, 21);
		panel_1.add(btnSubmitButton);
		
		JButton btnExitButton = new JButton("Exit");
		btnExitButton.setForeground(new Color(255, 255, 255));
		btnExitButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnExitButton.setBackground(new Color(60, 91, 111));
		btnExitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try 
				{
					fileWriter.close();
				}
				catch (Exception err)
				{
				}				
				System.exit(0);	


			}
		});
		btnExitButton.setBounds(180, 172, 58, 21);
		panel_1.add(btnExitButton);
	}
}
