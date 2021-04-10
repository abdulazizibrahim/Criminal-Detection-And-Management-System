package application;

import java.sql.*	;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FirController {
	@FXML
	private TextField txtcompno;
	@FXML
	private TextField txtfirno;
	@FXML
	private Button btnsubmit;
	
	private database db = new database();
	private Connection cn;
	public String get_compno()
	{
		return txtcompno.getText();
	}
	public String get_firno()
	{
		return txtfirno.getText();
	}
	public void ActionButton(ActionEvent event)
	{
		db.connect();
		String a = get_compno();
		int i = 0;
		if (!txtcompno.getText().isEmpty()) {
			i = Integer.parseInt(a);
		} 
		if (txtcompno.getText().isEmpty() == true || txtfirno.getText().isEmpty() == true){
			JOptionPane.showMessageDialog(null, "Please fill in all the required fields");
		}
		else {
			System.out.println("\n\nhey\n\n");
			db.Fir_Registration(i, get_firno());
		}
	}
}
