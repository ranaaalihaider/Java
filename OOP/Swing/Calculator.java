import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
public class Calculator extends JFrame
{
    JLabel label1=new JLabel("Enter Number 1");
    JLabel label2=new JLabel("Enter Number 2");
    JLabel label3=new JLabel("Your Result is ");
    JTextField txtFirstNumber=new JTextField(20);
    JTextField txtSecondNumber=new JTextField(20);
    JTextField txtResult= new JTextField(20);
    JButton btAdd= new JButton("ADD");
    JButton btSubstract = new JButton("SUBSTRACT");
    public Calculator()
    {
        super.setSize(250, 250);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.add(label1);
        super.add(txtFirstNumber);
        super.add(label2);
        super.add(txtSecondNumber);
        super.add(label3);
        super.add(txtResult);
        super.add(btAdd);
        super.add(btSubstract);
        btAdd.addActionListener(new AddBtnListner());
        btSubstract.addActionListener(new SubstractBtnListner());
    }
    private class AddBtnListner implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int a=Integer.parseInt(txtFirstNumber.getText());
            int b=Integer.parseInt(txtSecondNumber.getText());
            int result=a+b;
            txtResult.setText(String.valueOf(result));
        }
    }
    private class SubstractBtnListner implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            int a=Integer.parseInt(txtFirstNumber.getText());
            int b=Integer.parseInt(txtSecondNumber.getText());
            int result=a-b;
            txtResult.setText(String.valueOf(result));
        }
    }
    public static void main (String [] args)
    {
        Calculator frame= new Calculator();
        frame.setVisible(true);
    }

}
