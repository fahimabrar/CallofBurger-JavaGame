package coding;
import java.awt.Graphics;
import javax.swing.*;

public class Human {
	private int x, y;
	private String imagePath;
	public Human(int x, int y, String imagePath) {
	
		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
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
	
	public void draw(Graphics g){
		ImageIcon human = new ImageIcon(imagePath);
		g.drawImage(human.getImage(), x, y, null);
	}
	
	
	
	
}
