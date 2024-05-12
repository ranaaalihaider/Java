import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
public class GUI3 extends JFrame
{
    public GUI3()
    {
        super.setSize(800, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton exitButton=new JButton("Exit");
        super.add(exitButton);
        exitButton.addActionListener(new exitButtonClass());
    }
    public static void main(String[] args) 
    {
        GUI3 sc= new GUI3();
        sc.setVisible(true);
    }
    private class exitButtonClass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null,"Thanks for using");
            System.exit(0);
        }
    }
}
