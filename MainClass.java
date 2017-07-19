package brick_breaker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainClass extends JPanel implements ActionListener{
    
    static Sounds s = new Sounds();
    Frames f = new Frames();
    static JFrame startFrame = new JFrame("Brick Breaker");
    static JLabel label = new JLabel();
   
    public static void main(String[] args) {
        MainClass game = new MainClass();
        s.startPage();
        
        ImageIcon i = new ImageIcon("C:\\Users\\Apon\\Desktop\\Brick_Breaker_Final\\src\\brick_breaker\\a.png");
        label.setIcon(i);

        JButton button1 = new JButton("Play");
        JButton button2 = new JButton("Help");

        JButton button4 = new JButton("Exit");
        
        button1.addActionListener(game);
        button2.addActionListener(game);

        button4.addActionListener(game);
        
        button1.setBounds(300,275,200,50);
        button2.setBounds(300,350,200,50);

        button4.setBounds(300,425,200,50);
        
        
        startFrame.setSize(800,600);
        startFrame.setVisible(true);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setResizable(false);
 
        label.add(button1);
        label.add(button2);

        label.add(button4);
        
        startFrame.add(label);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("Play")) {
            s.hitFrame();
            startFrame.setVisible(false);
            f.Level_1();
    }
    
        if (str.equals("Exit")) {
            s.hitFrame();
            startFrame.setVisible(false);
        }
    }
}