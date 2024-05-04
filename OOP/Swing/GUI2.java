import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI2 extends JFrame implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(this, "You are going to exit");
        System.exit(0);
    }
    public GUI2()
    {
        super.setSize(500, 500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1=new JButton("Exit Button");
        super.add(b1);
        b1.addActionListener(this);
    }
    public static void main(String[] args) 
    {
        GUI2 frame1= new GUI2();
        frame1.setVisible(true);
    }
}
