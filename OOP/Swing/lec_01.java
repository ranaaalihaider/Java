import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class lec_01 extends JFrame implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(this,"I am Button 1");
        System.exit(0);
    }
    public lec_01()
    {
        super.setSize(500,500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button1=new JButton("Exit");
        super.add(button1);
        button1.addActionListener(this);
    }
    public static void main(String[] args) 
    {
        lec_01 frame= new lec_01();
        frame.setVisible(true);
    }
}
