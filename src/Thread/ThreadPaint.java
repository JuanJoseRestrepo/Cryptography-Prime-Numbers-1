package Thread;

import controller.principalController;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import model.PrimeNumber;

public class ThreadPaint extends Thread {
	
	
	private Label m;
	private Boolean f;
	private int sleept;
	


	public ThreadPaint(Label m, Boolean f, int sleept) {
		super();
		this.m = m;
		this.f = f;
		this.sleept = sleept;
		setDaemon(true);
	}



	@Override
	public void run() {
		

		while(true) {
			
			try {
				sleep(sleept);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(f == true) {
				m.setStyle("-fx-border-color: white; -fx-background-color: red;");
			}else {
				m.setStyle("-fx-border-color: white; -fx-background-color: #1aff1a;");
			}
			
		}
		
		
	
	

}
	
	
}
