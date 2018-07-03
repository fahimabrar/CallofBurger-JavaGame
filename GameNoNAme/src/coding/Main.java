package coding;
import javax.swing.*;
import coding.BurgerCollisionSound; 
public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		GameBoard board = new GameBoard();
		frame.setTitle("CALL of BURGER");
		frame.setSize(1024, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(3);
		frame.add(board);
		BurgerCollisionSound.bulletHitSound(3);
		frame.setVisible(true);

	}

}
