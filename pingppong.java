import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class pingppong extends JPanel implements KeyListener,ActionListener{ 
    int ballx=250;
    int bally=250;
    int ballxdir=1;
    int ballydir=2;
    int balls=20;
    int padx=200;
    int pady=500;
    int padw=100;
    int padh=12;
    int score=0;
    Timer timer;
    public pingppong(){
        setFocusable(true);
        addKeyListener(this);//connect the panel to keylistener
        timer =new Timer(10,this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        
        //background
        
        g.setColor(Color.BLACK);
        g.fillRect(0,0,600,600);
        g.setColor(Color.WHITE);
        g.drawString("score "+score,180,50);
        // ball
        g.setColor(Color.YELLOW);
        g.fillOval(ballx, bally, balls, balls);
        // pad
        g.setColor(Color.GREEN);
        g.fillRect(padx,pady,padw,padh);
        
    }
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_LEFT && padx>0){
            padx-=15;
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT && padx<getWidth()-padw){
            padx+=15;
        }
        repaint();
    }
    public void actionPerformed(ActionEvent e){
        ballx+=ballxdir;
        bally+=ballydir;
        if(ballx<0 || ballx>getWidth()-balls){//left and right wall movt
            ballxdir=-ballxdir;
        }

        if(bally<0){
            ballydir=-ballydir;
        }
        //paddle bounce 
        if(bally+balls>=pady && ballx+balls>=padx && ballx<=padx+padw){
            ballydir=-ballydir;
            score=score+10;
        }
        if(bally>getHeight()){
            timer.stop();
            int choice =JOptionPane.showConfirmDialog(this,"game over play again"+score,"pingpong",JOptionPane.YES_NO_OPTION);
            if(choice==JOptionPane.YES_OPTION){
                restart();
            }
            else{
                System.exit(0);
            }

        }
        repaint();

    }
    public void restart(){
        // ball width paddle width do not change neither pady change
           ballx = 250;
        bally = 250;
        ballxdir = 1;
        ballydir = 2;
        padx = 200;
        score=0;
        timer.start();
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public static void main(String[] args) {
        JFrame frame=new JFrame("PingPonggame");
        pingppong pannel=new pingppong();
        frame.add(pannel);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
