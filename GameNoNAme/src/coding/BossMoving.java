package coding;
import java.awt.Rectangle;
import java.util.Random;

import coding.BurgerCollisionSound;


public class BossMoving extends Thread {
	private GameBoard gb;
	private Boss boss;
	private Burger[] burger;
	private Human man;
	private Holes hole;
	public BossMoving(GameBoard gb, Boss boss,  Burger[] burger, Human man, Holes hole) {
		this.gb = gb;
		this.boss = boss;
		this.burger = burger;
		this.man = man;
		this.hole = hole;
	}
	int j = 1;
	int k = 200;
	boolean i = false;
	int burgerCount = 0;
	public void run(){
		while(true){
			
			
			
			int pos = 300 + (int)(Math.random() * ((500 - 300) + 1)); 
		
			if(i == false){
				boss.setX(boss.getX()-1);
				if(boss.getX()<=25)
					i = true;
			}
			if(boss.getX()== pos && gb.startii == true ){
				burger[burgerCount].setX(boss.getX());
				burger[burgerCount].setY(boss.getY()+40);
				BurgerCollisionSound.bulletHitSound(2);
				}
			
			
			
			burger[burgerCount].setY(burger[burgerCount].getY() + 10);
			if(i == true){
				boss.setX(boss.getX()+1);
				if(boss.getX()>=900)
					i = false;
			}
			
			burgerCount++;
			
			if(burgerCount == 9)
				burgerCount = 0;

			 
			collisionCheck();
			
			try {
				Thread.sleep(5);
			}catch (Exception e) {}
			gb.repaint();
			
		}
	}
	
	public void collisionCheck(){
		Rectangle manRact = new Rectangle(man.getX(), man.getY(), 135, 200);
	for(int i = 0; i<burger.length; i++){
		Rectangle burgerRact = new Rectangle(burger[i].getX(),burger[i].getY(), 50, 50);
	
	if(burgerRact.intersects(manRact) == true){
		BurgerCollisionSound.bulletHitSound(1);
		gb.score = gb.score-100;
		burger[i].setX(-500);
		
	       	}
	    }
	}
	
	
}

