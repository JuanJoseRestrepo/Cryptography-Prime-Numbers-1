package Thread;

import controller.principalController;
import javafx.scene.layout.GridPane;
import model.PrimeNumbers;

public class ThreadPaint extends Thread {
	
	
	private PrimeNumbers m;
	private principalController m1;
	private GridPane pane;
	private int height;
	
	
	@Override
	public void run() {
		boolean t = true;
		int contador = 1;
		
		
		while(t) {
			
			if(m.isThatPrime(contador)) {
			}
			
			
			if(contador == height + 1) {
				t = false;
			}
			
		}
		
		
	}
	

}
