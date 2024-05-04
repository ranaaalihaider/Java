import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI extends JFrame implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(this, "You are going to exit");
        System.exit(0);
    }
    public GUI()
    {
        super.setSize(500, 500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton  button1=new JButton("Exit");
        super.add(button1);
        button1.addActionListener(this);
    }


    public static void main(String[] args) 
    {
        GUI frame= new GUI();
        frame.setVisible(true);
    }
}
