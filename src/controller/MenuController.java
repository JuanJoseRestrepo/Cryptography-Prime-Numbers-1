package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MenuController {

	@FXML
	private Button generate;
	@FXML
	private TextField n;

	public void generatePrimes(ActionEvent e) {

		int[] dim = squareUp();
	}

	public int[] squareUp() {

		try {
			int maxN = Integer.parseInt(n.getText());
		} catch (Exception e) { // Excepción propia. Luego la hacemos
			Alert a = new Alert(AlertType.ERROR);
			a.setTitle("Error");
			a.setContentText(e.getMessage());
			a.show();
		}

		return null;
	}

}
