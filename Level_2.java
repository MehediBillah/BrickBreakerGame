package brick_breaker;
import static brick_breaker.Frames.framegameOverL1;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Level_2 extends JPanel implements KeyListener,
    ActionListener, Runnable {
    MainClass mc = new MainClass();
    Sounds s = new Sounds();
    Frames f = new Frames();
    int location;
    // movement keys..
    static boolean right = false;
    static boolean left = false;
    
    boolean ballMove=false;
    // variables declaration for ball...
    int ballx = 5;
    int bally = 5;
    // variables declaration for bat...
    int batx = 360;
    int baty = 500;
    // variables declaration for brick...
    int brickx = 150;
    int bricky = 100;
    // variable declaration for life...
    int lifex=10;
    int lifey=110;
    // declaring ball, paddle,bricks
    Rectangle Ball = new Rectangle(ballx, bally, 8, 8);
    Rectangle Bat = new Rectangle(batx, baty, 80, 10);
    Rectangle[] Brick = new Rectangle[30];
    Rectangle[] Brick2 = new Rectangle[15];
    Rectangle[] Brick3 = new Rectangle[15];
    Rectangle[] Life = new Rectangle[3];
    
    Thread t;
    Level_2() {
        addKeyListener(this);
        setFocusable(true);
        t = new Thread(this);
        t.start();
    }


    // declaring ball, paddle,bricks

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.white);
        g.fillOval(Ball.x, Ball.y, Ball.width, Ball.height);
        g.setColor(Color.cyan);
        g.fillRoundRect(Bat.x, Bat.y, Bat.width, Bat.height, 10, 10);
        
        //Points table
        
        Font f1 = new Font("Comic Sans MS", Font.PLAIN, 20);
        g.setFont(f1);
        g.setColor(Color.white);
        g.drawRect(5, 5, 80, 30);
        g.drawString("Level 2", 10, 25);
        g.drawRect(5, 35, 80, 100);
        g.drawString("Points:", 10, 60);
        g.drawString(String.valueOf(count), 20, 90);
        
        for (Rectangle Brick1 : Brick) {//enhanced for loop just like Brick1=Brick
            if (Brick1 != null) {
                if(Brick1.x==150){
                g.setColor(Color.GREEN);
                g.fill3DRect(Brick1.x, Brick1.y, Brick1.width, Brick1.height, true);
                }
                if(Brick1.x==201){
                g.setColor(Color.GREEN);
                g.fill3DRect(Brick1.x, Brick1.y, Brick1.width, Brick1.height, true);
                }
                if(Brick1.x==252){
                g.setColor(Color.GREEN);
                g.fill3DRect(Brick1.x, Brick1.y, Brick1.width, Brick1.height, true);
                }
                if(Brick1.x==303){
                g.setColor(Color.YELLOW);
                g.fill3DRect(Brick1.x, Brick1.y, Brick1.width, Brick1.height, true);
                }
                if(Brick1.x==354){
                g.setColor(Color.RED);
                g.fill3DRect(Brick1.x, Brick1.y, Brick1.width, Brick1.height, true);
                }
                if(Brick1.x==405){
                g.setColor(Color.RED);
                g.fill3DRect(Brick1.x, Brick1.y, Brick1.width, Brick1.height, true);
                }
                if(Brick1.x==456){
                g.setColor(Color.YELLOW);
                g.fill3DRect(Brick1.x, Brick1.y, Brick1.width, Brick1.height, true);
                }
                if(Brick1.x==507){
                g.setColor(Color.GREEN);
                g.fill3DRect(Brick1.x, Brick1.y, Brick1.width, Brick1.height, true);
                }
                if(Brick1.x==558){
                g.setColor(Color.GREEN);
                g.fill3DRect(Brick1.x, Brick1.y, Brick1.width, Brick1.height, true);
                
                }
                if(Brick1.x==609){
                g.setColor(Color.GREEN);
                g.fill3DRect(Brick1.x, Brick1.y, Brick1.width, Brick1.height, true);
                }
            }
        }
        g.setColor(Color.WHITE);
        for (Rectangle Life1 : Life){
            if(Life1!=null){
                g.fillOval(Life1.x, Life1.y, Life1.width, Life1.height);
            }
        }
        g.setColor(Color.WHITE);
            for (Rectangle Brick2_1 : Brick2){
                if(Brick2_1!=null)
                g.fill3DRect(Brick2_1.x, Brick2_1.y, Brick2_1.width, Brick2_1.height, true);
            }
            
            g.setColor(Color.RED);
            for (Rectangle Brick3_1 : Brick3){
                if(Brick3_1!=null)
                g.fill3DRect(Brick3_1.x, Brick3_1.y, Brick3_1.width, Brick3_1.height, true);
            }

        if (ballFallDown == true){
            s.gameOver();
            f.gameOverL2();
            
            ballFallDown=false;
            bricksOver=false;
            //ballMove=false;
            //f.gameOverL2();
            
        }
        

    }

 //Game Loop...

 //When ball strikes borders...it reverses...
    int movex = -1;
    int movey = -1;
    boolean ballFallDown = false;
    boolean bricksOver = false;
    int count = 0, count2 = 0;
    int life=3;
    String status;
    
 @Override
    public void run() {
  //Creating bricks for the game...
        
        for (int i = 0; i < 10; i++) {
            Brick[i] = new Rectangle(brickx, bricky, 50, 15);
                brickx += 51;
        }
        
        
        for (int i = 10; i < 18; i++) {
            Brick[i] = new Rectangle(brickx-102, bricky+17, 50, 15);
                brickx -= 51;
        }
        
        for (int i = 18; i < 24; i++) {
            Brick[i] = new Rectangle(brickx, bricky+34, 50, 15);
                brickx += 51;
        }
        
        for (int i = 24; i < 28; i++) {
            Brick[i] = new Rectangle(brickx-102, bricky+51, 50, 15);
                brickx -= 51;
        }
        
        for (int i = 28; i < 30; i++) {
            Brick[i] = new Rectangle(brickx, bricky+68, 50, 15);
                brickx += 51;
        }
        
        //Lifes
        for (int i = 0; i < 3; i++) {
            Life[i] = new Rectangle(lifex, lifey, 20, 20);
                lifex+=23;
        }
        
        //Creating double hit bricks for the game...
        for(int i = 0 ; i < 15; i++){
            Brick2[i] = new Rectangle(brickx-440, bricky+130, 50, 15);
            brickx += 51;
        }
        
        for(int i = 0 ; i < 15; i++){
            Brick3[i] = new Rectangle(brickx-1205, bricky+130, 50, 15);
            brickx += 51;
        }
        
        

  //ball reverses when touches the brick...

    while (ballFallDown == false && bricksOver == false) {

        for (int i = 0; i < Brick.length; i++) {
            if (Brick[i] != null) {
                if (Brick[i].intersects(Ball)) {
                s.hitBricks();
                Brick[i] = null;
             
                movey = -movey;
                
                
                count++;
                }
            }
        }
        for (int i = 0; i < Brick2.length; i++) {
            if (Brick2[i] != null && Brick3[i]==null) {
                if (Brick2[i].intersects(Ball)) {
                s.hitBricks();
                Brick2[i] = null;
             
                movey = -movey;
                
                
                count++;
                }
            }
        }
        
        for (int i = 0; i < Brick3.length; i++) {
            if (Brick3[i] != null) {
                if (Brick3[i].intersects(Ball)) {
                s.hitBricks();
                Brick3[i] = null;
             
                movey = -movey;
                
                
                count++;
                }
            }
        }

// check if ball hits all bricks...
    if (count+count2 == Brick.length+Brick2.length+Brick3.length) {
        bricksOver = true;
        f.frameL2.setVisible(false);
        f.Level_2_End();
    }
   
    
    repaint();
    Ball.x += movex;
    Ball.y += movey;

    if (left == true) {

        Bat.x -= 5;
        right = false;
    }
    if (right == true) {
        Bat.x += 5;
        left = false;
    }
    if (Bat.x <= 5) {
        Bat.x = 5;
    } 
    else if (Bat.x >= 710) {
        Bat.x = 710;
    }
    
   //Ball reverses when strikes the bat...
    if(ballMove == false){//At the start the ball will move with bat...
        Ball.x = Bat.x+35;
        Ball.y=Bat.y-12;
    }
    
    if (Ball.intersects(Bat)) {
        s.hitFrame();
        movey = -movey;
    }
    
   //Ball reverses when touches left and right boundary...
    if (Ball.x <= 0 || Ball.x + Ball.height >= 795) {
        s.hitFrame();
        movex = -movex;
    }
    if (Ball.y <= 0) {
        s.hitFrame();
        movey = -movey;
    }

    
    // when ball falls below bat game is over...
    if (Ball.y >= 520) {
        if(life>0){
        Life[life-1]=null;
        Ball.x = Bat.x+35;
        Ball.y=Bat.y-12;
        Bat.x = 360;
        Bat.y = 500;
        movex=-1;
        movey=-1;
        ballMove=false;
        life--;
        }
        else{
        ballFallDown = true;

        repaint();
        }
    }
    try {
        Thread.sleep(8);
    } 
    catch (Exception e) {
    }

    }// while loop ends here

 } //run ends here

 //HANDLING KEY EVENTS...
 @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            left = true;
        }

        if (keyCode == KeyEvent.VK_RIGHT) {
            right = true;
        }
        
        if(keyCode == KeyEvent.VK_SPACE){
            ballMove = true;
        }
    }

 @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            left = false;
        }

        if (keyCode == KeyEvent.VK_RIGHT) {
            right = false;
        }
    }

 @Override
    public void keyTyped(KeyEvent arg0) {

    }

 @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("Try again")) {
            s.hitFrame();
            f.framegameOverL2.setVisible(false);
            //L1.ballMove = false;
            f.Level_2();
        }
        if (str.equals("Exit")) {
            s.hitFrame();
            f.framegameOverL2.setVisible(false);
            
        }
    }
    
}                                                                               