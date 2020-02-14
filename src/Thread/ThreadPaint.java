package Thread;

import controller.principalController;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import model.PrimeNumbers;

public class ThreadPaint extends Thread {
	
	
	private Label m;
	private Boolean f;
	private int sleept;
	
	public ThreadPaint(Label m, Boolean f, int sleept) {
		super();
		this.m = m;
		this.f = f;
		this.sleept = sleept;
	}

	@Override
	public void run() {
		boolean t = true;
		

		while(t) {
			
			if(f == true) {
				m.setTextFill(Color.web("#ff0000", 0.8));
			}else {
				
			}
			
			try {
				Thread.sleep(sleept);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	
	

}
	
	
}
