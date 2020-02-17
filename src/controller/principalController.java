package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import model.*;
import thread.ThreadPaint;

public class principalController implements Initializable {

	private PrimeNumber[][] numbers;
	private PrimeNumber principal;
	
	@FXML
	private Button buton1;
	@FXML
	private Button buton2;
	@FXML
	private Button buton3;
	@FXML
	private TextField n;
	@FXML
	private BorderPane m;
	@FXML
	private ScrollPane scrollPane;
	
	private Boolean isStop = false;
	
	private GridPane matrix;
	
	private Master master;
	
	public Boolean getIsStop() {
		return isStop;
	}

	public void setIsStop(Boolean isStop) {
		this.isStop = isStop;
	}
	
	public ArrayList<PrimeNumber> createNumbers(int number) {
		ArrayList<PrimeNumber> m = new ArrayList<PrimeNumber>();
		
		for(int i = 1; i < number;i++) {
			
			PrimeNumber x = new PrimeNumber(i);
			m.add(x);
			
		}
		
		
		return m;
	}
	 
	public void refreshGame(ActionEvent e) {
		
		try {
			matrix.getChildren().clear();
		}catch(NullPointerException e1) {
			Alert gameOver = new Alert(AlertType.INFORMATION);
			gameOver.setTitle("Stop there!");
			gameOver.setHeaderText("Exception Found!");
			gameOver.setContentText(
					"Please type a valid input");
			gameOver.showAndWait();
		}
		
	}
	
	public void createGrid(ActionEvent e) {
		matrix = new GridPane();
		refreshGame(e);
	}
	
	public void performOfButton1(ActionEvent e) {
		 
		try {
		
			if(!n.getText().isEmpty()) {
				
				createGrid(e);	
				Master master = new Master();
				
				
				int high =  Integer.parseInt(n.getText());
				String msj = master.sizeOfMatrix(high);
				String[] b = msj.split(",");
				

				int row = Integer.parseInt(b[0]);
				int col = Integer.parseInt(b[1]);
				numbers = new PrimeNumber[row][col];
				matrix.setGridLinesVisible(true);
				
				boolean[] m2 = master.getEratosthenesSieve(high);
				
		        int numero = 1;
		        int time = 1000;
		        boolean t = false;
		      
		        int i = 0, j = 0;
		        while (i < col && !t) {
		        	if (j == row) {
		                i++;
		                j = 0;
		            } else {
		
		        		String m1 = Integer.toString(numero);
		        		Label numero1 = new Label(m1 + "  ");
		
		        		numero1.setMinWidth(40);
		        		numero1.setMinHeight(40);
		        		
		        		ThreadPaint r = new ThreadPaint(numero1,m2[numero],time);
		        		r.start();
		        	
		        		numero++;
		        		time += 15;
		        		matrix.add(numero1, j, i);
		        		j++;
		
		         		if(numero == high + 1) {
		         			t = true;
		         		}
		         		
		            }
		             
		        	
		        }
		       
		        m.setCenter(matrix);
		        scrollPane.setMinHeight(720);
		        scrollPane.setMinWidth(1080);
			
			}else {
				
				Alert gameOver = new Alert(AlertType.INFORMATION);
				gameOver.setTitle("Stop there!");
				gameOver.setHeaderText("Exception Found!");
				gameOver.setContentText(
						"Please type a valid input");
				gameOver.showAndWait();
			}
		
		}catch(NumberFormatException e1) {
			
			Alert gameOver = new Alert(AlertType.INFORMATION);
			gameOver.setTitle("Stop there!");
			gameOver.setHeaderText("Exception Found!");
			gameOver.setContentText(
					"Please type a valid input");
			gameOver.showAndWait();
			
		}
	}
	
	public void performOfButon2(ActionEvent e) {
		
		try {
			
			if(!n.getText().isEmpty()) {
				
				createGrid(e);	
				Master master = new Master();
				
				
				int high =  Integer.parseInt(n.getText());
				String msj = master.sizeOfMatrix(high);
				String[] b = msj.split(",");
				
				int row = Integer.parseInt(b[0]);
				int col = Integer.parseInt(b[1]);
				numbers = new PrimeNumber[row][col];
				matrix.setGridLinesVisible(true);
				
				boolean[] m2 = master.getBitwiseSieve(high);
				
		        int numero = 1;
		        int time = 1000;
		        boolean t = false;
		      
		        int i = 0, j = 0;
		        while (i < col && !t) {
		        	if (j == row) {
		                i++;
		                j = 0;
		            } else {
		
		        		String m1 = Integer.toString(numero);
		        		Label numero1 = new Label(m1 + "  ");
		
		        		numero1.setMinWidth(40);
		        		numero1.setMinHeight(40);
		        		
		        		ThreadPaint r = new ThreadPaint(numero1,m2[numero],time);
		        		r.start();
		        	
		        		numero++;
		        		time += 15;
		        		matrix.add(numero1, j, i);
		        		j++;
		
		         		if(numero == high + 1) {
		         			t = true;
		         		}
		         		
		            }
		             
		        	
		        }
		       
		        m.setCenter(matrix);
		        scrollPane.setMinHeight(720);
		        scrollPane.setMinWidth(1080);
			
			}else {
				
				Alert gameOver = new Alert(AlertType.INFORMATION);
				gameOver.setTitle("Stop there!");
				gameOver.setHeaderText("Exception Found!");
				gameOver.setContentText(
						"Please type a valid input");
				gameOver.showAndWait();
			}
		
		}catch(NumberFormatException e1) {
			
			Alert gameOver = new Alert(AlertType.INFORMATION);
			gameOver.setTitle("Stop there!");
			gameOver.setHeaderText("Exception Found!");
			gameOver.setContentText(
					"Please type a valid input");
			gameOver.showAndWait();
			
		}
	}
	
	
	public void performOfButton3(ActionEvent e) {
		
		try {
			
			if(!n.getText().isEmpty()) {
				
				createGrid(e);	
				Master master = new Master();
				
				
				int high =  Integer.parseInt(n.getText());
				String msj = master.sizeOfMatrix(high);
				String[] b = msj.split(",");
				
				
				
				int row = Integer.parseInt(b[0]);
				int col = Integer.parseInt(b[1]);
				numbers = new PrimeNumber[row][col];
				matrix.setGridLinesVisible(true);
				
				boolean[] m2 = master.getPrimesByCapY(high);
				
		        int numero = 1;
		        int time = 1000;
		        boolean t = false;
		      
		        int i = 0, j = 0;
		        while (i < col && !t) {
		        	if (j == row) {
		                i++;
		                j = 0;
		            } else {
		
		        		String m1 = Integer.toString(numero);
		        		Label numero1 = new Label(m1 + "  ");
		
		        		numero1.setMinWidth(40);
		        		numero1.setMinHeight(40);
		        		
		        		ThreadPaint r = new ThreadPaint(numero1,m2[numero],time);
		        		r.start();
		        	
		        		numero++;
		        		time += 15;
		        		matrix.add(numero1, j, i);
		        		j++;
		
		         		if(numero == high + 1) {
		         			t = true;
		         		}
		         		
		            }
		             
		        	
		        }
		       
		        m.setCenter(matrix);
		        scrollPane.setMinHeight(720);
		        scrollPane.setMinWidth(1080);
			
			}else {
				
				Alert gameOver = new Alert(AlertType.INFORMATION);
				gameOver.setTitle("Stop there!");
				gameOver.setHeaderText("Exception Found!");
				gameOver.setContentText(
						"Please type a valid input");
				gameOver.showAndWait();
			}
		
		}catch(NumberFormatException e1) {
			
			Alert gameOver = new Alert(AlertType.INFORMATION);
			gameOver.setTitle("Stop there!");
			gameOver.setHeaderText("Exception Found!");
			gameOver.setContentText(
					"Please type a valid input");
			gameOver.showAndWait();
			
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		principal = new PrimeNumber(0);
	}

} //end of class
