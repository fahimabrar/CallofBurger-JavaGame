package coding;

import javax.swing.*;
import coding.BurgerCollisionSound;
import java.awt.*;
import java.awt.event.*;

public class GameBoard extends JPanel implements KeyListener {
	Human man;
	Tablet tablet;
	Boss boss;
	Holes hole;
	Burger[] burger = new Burger[10];
	int count = 0;
	Background backgrounds;
	Heart heart;
	static long score = 0;
	static int counter = 0;
	static int counter1 = 0;
	static boolean startii = false;
	
	public GameBoard(){
		super();
		backgrounds = new Background(0, 0, "images//Background- (1).jpg");
		man = new Human(300, 350, "images//images//player-1.png");
		boss = new Boss(300, 0, "images//images//boos-2.png", true);
		hole = new Holes(300, 200, null);
		tablet = new Tablet(100, 300, "images//pluspoint1.png");
		heart = new Heart(50, 260, "images//images//Heart.png");
		for(int i = 0;  i < burger.length; i++){
			
			burger[i] = new Burger(-100,-100, "images//images//burger1.png");
		}
		
		ChangingBackground cb = new ChangingBackground(backgrounds, this, man, boss);
		cb.start();
		BossMoving bb = new BossMoving(this, boss, burger, man, hole);
		bb.start();
		HoleCollision hb = new HoleCollision(this, man, hole, tablet, heart);
		hb.start();
		
		
			
			
		super.setFocusable(true);
		
		super.addKeyListener(this);
		
	}
	
	public void paint(Graphics g){
		backgrounds.draw(g);
		man.draw(g);
		boss.draw(g);
		hole.draw(g);
		tablet.draw(g);
		heart.draw(g);
		for(int i = 0; i<burger.length; i++)
		burger[i].draw(g);
		Font f = new Font("SanSerif", Font.ITALIC, 20);
		g.setColor(Color.WHITE);
		g.setFont(f);
		g.drawString("Score: "+score, 750, 450);
		if(score<80)
			g.drawString("Current State: Overweight", 750, 480);
		else if(score<200)
			g.drawString("Current State: Healthy", 750, 480);
		else
			g.drawString("Current State: Perfect", 750, 480);
		if(score<80)
		g.drawString("cure +50", 100, 300);
		else if(score<200)
			g.drawString("cure +20", 100, 300);
		else
			g.drawString("cure +10", 100, 300);


		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_LEFT){
			if(man.getX()>100)
				man.setX(man.getX()-10);
	
			
		}
		
		else if(e.getKeyCode() == e.VK_RIGHT){
			if(man.getX()<600)
				man.setX(man.getX()+10);
		}
			
		else if(e.getKeyCode() == e.VK_UP){
				if(man.getY()>150)
					man.setY(man.getY()-10);
			
				
			}
			
			else if(e.getKeyCode() == e.VK_DOWN){
				if(man.getY()<350)
					man.setY(man.getY()+10);
				}
		repaint();
			
	}
		
	
		
		
	

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
