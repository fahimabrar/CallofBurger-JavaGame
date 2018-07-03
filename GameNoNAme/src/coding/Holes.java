package coding;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Holes {
	private int x, y;
	private String imagepath;
	public Holes(int x, int y, String imagepath) {
		
		this.x = x;
		this.y = y;
		this.imagepath = imagepath;
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
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	
	public void draw(Graphics g){
		ImageIcon holes = new ImageIcon(imagepath);
		g.drawImage(holes.getImage(), x, y, null);
	}
	
	
	

}
