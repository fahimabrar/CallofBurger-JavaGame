package coding;

import java.awt.Rectangle;

public class HoleCollision extends Thread{
	private GameBoard gb;
	private Human man;
	private Holes hole;
	private Tablet tablet;
	private Heart heart;
	public HoleCollision(GameBoard gb, Human man, Holes hole, Tablet tablet, Heart heart) {
		this.gb = gb;
		this.man = man;
		this.hole = hole;
		this.tablet = tablet;
		this.heart = heart;
	}
	
	
	int j = 1;
	//int k = 300;
	//int l = 450;
	int m = 1;
	int n = 1;
	
	public void run(){
		
		while(true){
			//hole.setX(l);
			//hole.setY(k);
			//hole.setImagepath("images//images//hole-"+j+".png");
			tablet.setImagePath("images//pluspoint"+m+".png");
			heart.setImagePath("images//images//Heart"+n+".png");
			j++;
			m++;
			//k+=50;
			//l-=10;
			n++;
			if(j==6){
				j=1;
				//k=300;
				//l=450;
			}
			if(m==9)
				m=1;
			if(n==3)
				n=1;
			
			collisionCheck();
			try {
				Thread.sleep(500);
			}catch (Exception e) {}
			gb.repaint();
			
		}
	}
	
	public void collisionCheck(){
		Rectangle manRact = new Rectangle(man.getX(), man.getY(), 135, 150);
		//Rectangle holeRact = new Rectangle(hole.getX(),hole.getY(), 200, 200);
		Rectangle tabRact = new Rectangle(tablet.getX(),tablet.getY(), 30, 30);
	
	//if(holeRact.intersects(manRact) == true){
		//gb.score = gb.score-10;
		//hole.setX(-500);
		
	       	//}
	if(gb.startii == true && tabRact.intersects(manRact) == true)
		if(gb.score<80)
		gb.score = gb.score+50;
		else if(gb.score<200)
	    gb.score = gb.score+20;
		else
		gb.score = gb.score+10;
	
	    }
	}

