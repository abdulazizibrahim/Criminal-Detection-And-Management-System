package application2;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import application.database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CaseRController {
	@FXML
	private TextField txtcase;
	@FXML
	private TextField txtfir;
	@FXML
	private TextArea txtreport;
	
	public int get_case()
	{
		int i = Integer.parseInt(txtcase.getText().trim());
		return i;
	}
	public int get_fir()
	{
		int i = Integer.parseInt(txtfir.getText().trim());
		return i;
	}
	public String get_report()
	{
		return txtreport.getText();
	}
	private database db = new database();
	private Connection cn;
	private ResultSet rs;
	private CaseR cr = new CaseR();
	
	public void Action(ActionEvent event)
	{
		db.connect();
		if (txtcase.getText().isEmpty() == true || txtfir.getText().isEmpty() == true || get_report().isEmpty() == true){
			JOptionPane.showMessageDialog(null, "Please fill in all the required fields");
		}
		else
			db.input_caser(get_case(), get_fir(), get_report());
	}
	
}
