package coding;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Boss {
	private int x, y;
	private String imagePath;
	private boolean alive;
	public Boss(int x, int y, String imagePath, boolean alive) {
	
		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
		this.alive = alive;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public void draw(Graphics g){
		ImageIcon ghost = new ImageIcon(imagePath);
		g.drawImage(ghost.getImage(), x, y, null);
	}
	

}
