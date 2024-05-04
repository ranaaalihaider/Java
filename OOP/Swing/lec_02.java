import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lec_02 extends JFrame implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(null, "Your are going to exit");
        System.exit(0);
    }
    public lec_02()
    {
        super.setSize(500, 500);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton button1= new JButton("Exit");
        super.add(button1);
        button1.addActionListener(this);
        
    }
    public static void main(String[] args) 
    {
        lec_02 frame= new lec_02();
        frame.setVisible(true);
    }
}
