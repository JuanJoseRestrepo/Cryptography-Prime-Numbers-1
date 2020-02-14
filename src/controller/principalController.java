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
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import model.*;

public class principalController implements Initializable {

	private PrimeNumbers[][] numbers;
	private PrimeNumbers principal;
	
	@FXML
	private Button buton1;
	@FXML
	private Button buton2;
	@FXML
	private Button buton3;
	@FXML
	private TextField n;
	
	private GridPane juego;
	
	public ArrayList<PrimeNumbers> createNumbers(int number) {
		ArrayList<PrimeNumbers> m = new ArrayList<PrimeNumbers>();
		
		for(int i = 1; i < number;i++) {
			
			PrimeNumbers x = new PrimeNumbers(i);
			m.add(x);
			
		}
		
		
		return m;
	}
	
	public String generateMatrix(int number){
		
		String msj = "";
		ArrayList<PrimeNumbers> array1 = createNumbers(number);
	
		
		double m = Math.sqrt(number);
		
		double resta = (m - number);
		
		
		if(principal.isThatPrime(number)) {
			
			m = m + 1;
			
			msj = m + "," + m;
			
		}else if(resta != 0.0) {
			
			for(int i = 1; i < number;i++) {
				
				if(number % i == 0) {
					
					PrimeNumbers m1 = new PrimeNumbers(i);
					array1.add(m1);
					
				}
				
			}
			
			for(int i = 0; i < array1.size();i++) {
				
				int num1 = array1.get(i).getNumber();
				int num2 = array1.get(i+1).getNumber();
				
				if(num1 * num2 == number) {
					
					msj = num1 + "," + num2;
					
				}
				
			}
			
		}else {
			msj = number + "," + number;
		}
		
		return msj;
	}
	
	public void refreshGame(ActionEvent e) {
		
		try {
		juego.getChildren().clear();
		}catch(NullPointerException e1) {
			Alert gameOver = new Alert(AlertType.INFORMATION);
			gameOver.setTitle("Alto Ahi!");
			gameOver.setHeaderText("¡Excepcion Encontrada!");
			gameOver.setContentText(
					"Por use una de las tres opciones, para poder jugar");
			gameOver.showAndWait();
		}
		
	}
	
	
	
	public void performOfButton1(ActionEvent e) {
		
		if(!n.getText().isEmpty()) {
			
			
		juego = new GridPane();
		refreshGame(e);
		int high =  Integer.parseInt(n.getText());
		String msj = generateMatrix(high);
		String[] b = msj.split(",");
		int fil = Integer.parseInt(b[0]);
		int col = Integer.parseInt(b[1]);
		
		numbers = new PrimeNumbers[fil][col];
		
		
        for(int i = 0; i < col; i++) {
            ColumnConstraints column = new ColumnConstraints(40);
            juego.getColumnConstraints().add(column);
        }

        for(int i = 0; i < fil; i++) {
            RowConstraints row = new RowConstraints(40);
            juego.getRowConstraints().add(row);
        }
        
        int numero = 1;
        
        for(int i = 0; i < fil;i++) {
        	
        	for(int j = 0; j < col;j++) {
        		
        		String m1 = Integer.toString(numero);
        		Label numero1 = new Label(m1);
        		
        		juego.add(numero1, j, i);
        		numero++;
        		
        	}
        	numero = numero + 1;
        }
		
		}else {
			Alert gameOver = new Alert(AlertType.INFORMATION);
			gameOver.setTitle("Alto Ahi!");
			gameOver.setHeaderText("¡Excepcion Encontrada!");
			gameOver.setContentText(
					"Por favor ingrese el numero ");
			gameOver.showAndWait();
		}
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		principal = new PrimeNumbers(0);
	}

}
