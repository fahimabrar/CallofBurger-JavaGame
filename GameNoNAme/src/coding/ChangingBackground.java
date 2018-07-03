package coding;
import coding.BurgerCollisionSound;
public class ChangingBackground extends Thread{

	private Background bg;
	private GameBoard gb;
	private Human mn;
	private Boss boss;
	public ChangingBackground(Background bg, GameBoard gb, Human mn, Boss boss) {
		super();
		this.bg = bg;
		this.gb = gb;
		this.mn = mn;
		this.boss = boss;
	}
	
	
	int i = 1;
	
	public void run(){
		
		while(true){
			
			if(gb.startii==false && gb.score>=-200){
				
			bg.setImagePath("images//images//Load.jpg");
			mn.setImagePath(null);
			boss.setImagePath(null);
			
		try {
			 Thread.sleep(710);
		} 
		
		catch (Exception e) {}
		gb.counter++;
		if(gb.counter==10)
			gb.startii = true;
		}
			if(gb.startii == true && gb.score<-200){
			gb.startii = false;	
			BurgerCollisionSound.bulletHitSound(4);
			bg.setImagePath("images//images//GameOver.jpg");
			mn.setImagePath(null);
			boss.setImagePath(null);
			
		try {
			 Thread.sleep(50);
		} 
		
		catch (Exception e) {}
		gb.counter1++;

		}
		
		if(gb.startii == true && gb.score<80){
			
			bg.setImagePath("images//Background- ("+i+").jpg");
			if(i%3 ==0)
				mn.setImagePath("images//images//khubmutaplayer-1.png");
			else
				mn.setImagePath("images//images//khubmutaplayer-2.png");
			
			boss.setImagePath("images//images//boos-2.png");
			
		try {
			 Thread.sleep(300);
		} 
		
		catch (Exception e) {}
		
		if(i==200)
			i=1;
		
		gb.repaint();
		i++;
		gb.score++;
	}
			
			else if(gb.startii == true && gb.score<200){
				
			bg.setImagePath("images//Background- ("+i+").jpg");
			if(i%2 ==0)
				mn.setImagePath("images//images//mutaplayer-1.png");
			else
				mn.setImagePath("images//images//mutaplayer-2.png");
			boss.setImagePath("images//images//Boss-1.png"); 
		try {
			 Thread.sleep(150);
		} 
		
		catch (Exception e) {}
		
		if(i==200)
			i=1;
		
		gb.repaint();
		i++;
		gb.score++;
	}
			else if(gb.startii == true && gb.score>=200) {
				
			bg.setImagePath("images//Background- ("+i+").jpg");
			if(i%2 ==0)
				mn.setImagePath("images//images//player-1.png");
			else
				mn.setImagePath("images//images//player-2.png");
			boss.setImagePath("images//images//Boss-1.png"); 
			
		try {
			 Thread.sleep(100);
		} 
		
		catch (Exception e) {}
		
		if(i==200)
			i=1;
		
		gb.repaint();
		i++;
		gb.score++;
	}
			
	
 }
	}
}

		
		

	
	
	
	
	

