package brick_breaker;
import static brick_breaker.MainClass.label;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frames {
    Sounds s = new Sounds();
    
    static JFrame frameL1 = new JFrame("Brick Breaker");
    static JFrame frameL2 = new JFrame("Brick Breaker");
    static JFrame frameL3 = new JFrame("Brick Breaker");
    
    static JFrame frameL1End = new JFrame("Brick Breaker");
    static JFrame frameL2End = new JFrame("Brick Breaker");
    static JFrame frameL3End = new JFrame("Brick Breaker");
    
    static JFrame framegameOverL1 = new JFrame("Brick Breaker");
    static JFrame framegameOverL2 = new JFrame("Brick Breaker");
    static JFrame framegameOverL3 = new JFrame("Brick Breaker");
    
    JLabel label = new JLabel();
    
    public void Level_1() {
        Level_1 L1 = new Level_1();
        frameL1.add(L1);
        
        

        
        frameL1.setSize(800, 600);
        frameL1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frameL1.setResizable(false);
        frameL1.setVisible(true);
    }
    
    public void Level_2() {
        Level_2 L2 = new Level_2();
        
        L2.ballMove=false;
        
        frameL2.setSize(800, 600);
        frameL2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameL2.add(L2);
        frameL2.setResizable(false);
        frameL2.setVisible(true);
    }
    
    public void Level_3() {
        Level_3 L3 = new Level_3();
        
        //L1.ballMove=false;
        
        frameL3.setSize(800, 600);
        frameL3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameL3.add(L3);
        frameL3.setResizable(false);
        frameL3.setVisible(true);
    }
    
    public void Level_1_End(){
        
        MainClass game = new MainClass();
        
        frameL1End.setLayout(null);
        frameL1End.getContentPane().setBackground(Color.BLACK);
        JButton button1 = new JButton("Play Level-1");
        JButton button2 = new JButton("Goto Level-2");
        JButton button3 = new JButton("Exit");
        
        button1.addActionListener(game);
        button2.addActionListener(game);
        button3.addActionListener(game);
        
        button1.setBounds(300,200,200,50);
        button2.setBounds(300,275,200,50);
        button3.setBounds(300,350,200,50);
        
        frameL1End.setSize(800,600);
        frameL1End.setVisible(true);
        frameL1End.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frameL1End.add(button1);
        frameL1End.add(button2);
        frameL1End.add(button3);
    }
    
    public void Level_2_End(){
        
        MainClass game = new MainClass();
        
        frameL2End.setLayout(null);
        frameL2End.getContentPane().setBackground(Color.BLACK);
        JButton button1 = new JButton("Play Level-2");
        JButton button2 = new JButton("Goto Level-3");
        JButton button3 = new JButton("Exit");
        
        button1.addActionListener(game);
        button2.addActionListener(game);
        button3.addActionListener(game);
        
        button1.setBounds(300,200,200,50);
        button2.setBounds(300,275,200,50);
        button3.setBounds(300,350,200,50);
        
        frameL2End.setSize(800,600);
        frameL2End.setVisible(true);
        frameL2End.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frameL2End.add(button1);
        frameL2End.add(button2);
        frameL2End.add(button3);
    }
    
    public void Level_3_End(){
        
        MainClass game = new MainClass();
        
        frameL3End.setLayout(null);
        frameL3End.getContentPane().setBackground(Color.BLACK);
        
        JButton button1 = new JButton("Play Level-3");

        JButton button3 = new JButton("Exit");
        
        button1.addActionListener(game);

        button3.addActionListener(game);
        
        button1.setBounds(300,275,200,50);

        button3.setBounds(300,350,200,50);
        
        frameL3End.setSize(800,600);
        frameL3End.setVisible(true);
        frameL3End.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frameL3End.add(button1);

        frameL3End.add(button3);
    }
    
    public void gameOverL1(){
        s.gameOverFinal();
        Level_1 L1 = new Level_1();
  
        frameL1.setVisible(false);
        
        ImageIcon i = new ImageIcon("C:\\Users\\Apon\\Desktop\\Brick_Breaker_Final\\src\\brick_breaker\\sujit.jpg");
        label.setIcon(i);
        JButton button3 = new JButton("Exit");
        button3.addActionListener(L1);
        button3.setBounds(300,375,200,50);
        
        framegameOverL1.setSize(800,600);
        framegameOverL1.setVisible(true);
        framegameOverL1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label.add(button3);
        
        framegameOverL1.add(label);
    }
    
    public void gameOverL2(){
        Level_2 L2 = new Level_2();
        s.gameOverFinal();
        frameL2.setVisible(false);
        MainClass game = new MainClass();
        ImageIcon i = new ImageIcon("C:\\Users\\Apon\\Desktop\\Brick_Breaker_Final\\src\\brick_breaker\\sujit.jpg");
        label.setIcon(i);
        

        JButton button1 = new JButton("Try again");

        JButton button3 = new JButton("Exit");
        
        button1.addActionListener(L2);

        button3.addActionListener(L2);
        
        button1.setBounds(300,300,200,50);

        button3.setBounds(300,375,200,50);
        
        framegameOverL2.setSize(800,600);
        framegameOverL2.setVisible(true);
        framegameOverL2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        label.add(button1);
        label.add(button3);
        
        framegameOverL2.add(label);
    }
    
    public void gameOverL3(){
        Level_3 L3 = new Level_3();
        s.gameOverFinal();
        frameL3.setVisible(false);
        MainClass game = new MainClass();
        ImageIcon i = new ImageIcon("C:\\Users\\Apon\\Desktop\\Brick_Breaker_Final\\src\\brick_breaker\\sujit.jpg");
        label.setIcon(i);
        JButton button1 = new JButton("Try again");

        JButton button3 = new JButton("Exit");
        
        button1.addActionListener(L3);

        button3.addActionListener(L3);
        
        button1.setBounds(300,300,200,50);

        button3.setBounds(300,375,200,50);
        
        framegameOverL3.setSize(800,600);
        framegameOverL3.setVisible(true);
        framegameOverL3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        label.add(button1);
        label.add(button3);
        
        framegameOverL3.add(label);
    }

}
