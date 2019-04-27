import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GenerateMarksheet
{
    private JTextField txtOOT, txtOOP , txtDB;
    private JLabel lblOOT,lblOOP,lblDB;
    private JLabel lblTotalMarks,lblTotalMarksDisplay;
    private JLabel lblPercentage , lblPercentageDisplay ;
    private JLabel lblDivision ,lblDivisionDisplay;
    private JLabel lblResult,lblResultDisplay;
    private JButton btnGenerate,btnClose;
    private JFrame myFrame;
    public static void main(String[] args)
    {
       new GenerateMarksheet();
    }  
    //Constructor 
    public GenerateMarksheet()
    {
        myFrame = new JFrame("Marksheet Generator");
        myFrame.setSize(500,500);
        myFrame.setLayout(null);
      
        lblOOT = new JLabel("Enter OOT Marks");
        lblOOT.setBounds(20,30,200,30);
        myFrame.add(lblOOT);

        txtOOT = new JTextField();
        txtOOT.setBounds(260,30,200,30);
        myFrame.add(txtOOT);

        lblOOP = new JLabel("Enter OOP Marks");
        lblOOP.setBounds(20,80,200,30);
        myFrame.add(lblOOP);

        txtOOP = new JTextField();
        txtOOP.setBounds(260,80,200,30);
        myFrame.add(txtOOP);

        lblDB = new JLabel("Enter DB Marks");
        lblDB.setBounds(20,120,200,30);
        myFrame.add(lblDB);

        txtDB = new JTextField();
        txtDB.setBounds(260,120,200,30);
        myFrame.add(txtDB);

        btnGenerate = new JButton("Generate");
        btnGenerate.setBounds(20,170,200,30);
        myFrame.add(btnGenerate);

        btnClose = new JButton("CLOSE");
        btnClose.setBounds(260,170,200,30);
        myFrame.add(btnClose);

        lblTotalMarks = new JLabel("Total Marks");
        lblTotalMarks.setBounds(20,210,200,30);
        myFrame.add(lblTotalMarks);

        lblTotalMarksDisplay = new JLabel("0.0");
        lblTotalMarksDisplay.setBounds(260,210,200,30);
        myFrame.add(lblTotalMarksDisplay);

        lblPercentage = new JLabel("Total Percentage");
        lblPercentage.setBounds(20,250,200,30);
        myFrame.add(lblPercentage);

        lblPercentageDisplay = new JLabel("0.0");
        lblPercentageDisplay.setBounds(260,250,200,30);
        myFrame.add(lblPercentageDisplay);
        
        lblDivision = new JLabel("Division");
        lblDivision.setBounds(20,290,200,30);
        myFrame.add(lblDivision);

        lblDivisionDisplay = new JLabel("1st/2nd/3rd/Fail");
        lblDivisionDisplay.setBounds(260,290,200,30);
        myFrame.add(lblDivisionDisplay);

        lblResult = new JLabel("Result");
        lblResult.setBounds(20,330,200,30);
        myFrame.add(lblResult);

        lblResultDisplay = new JLabel("PASS/FAIL");
        lblResultDisplay.setBounds(260,330,200,30);
        myFrame.add(lblResultDisplay);

        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);

        //Click Event
        btnGenerate.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
               //Your logic goes here
            }
        });    
        
        btnClose.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
               // Your logic goes here
            }
        });
    }
}