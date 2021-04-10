package application;

import java.sql.*;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CRController {
	@FXML
	private  TextField txtcnic;
	@FXML
	private TextField txtname;
	@FXML
	private TextField txtemail;
	@FXML
	private TextField txtphone;
	@FXML
	private TextField txtcrime;
	@FXML
	private TextArea txtdoc;
	@FXML
	private Button btnsubmit;
	
	private database db = new database();
	private Connection cn;
	
	
	public String get_cnic()
	{
		return txtcnic.getText();
	}
	public String get_name()
	{
		return txtname.getText();
	}
	public String get_email()
	{
		return txtemail.getText();
	}
	public String get_phone()
	{
		return txtphone.getText();
	}
	public String get_crime()
	{
		return txtcrime.getText();
	}
	public String get_doc()
	{
		return txtdoc.getText();
	}
	public void ActionButton(ActionEvent event)
	{
		if (get_cnic().isEmpty() == true || txtdoc.getText().isEmpty() == true || get_doc().isEmpty() == true || get_email().isEmpty() == true || get_name().isEmpty() == true || get_phone().isEmpty() == true){
			JOptionPane.showMessageDialog(null, "Please fill in all the required fields");
		}
		else {
			cn = db.connect();
			db.CR_input(get_cnic(), get_name(), get_email(), get_phone(), get_crime(), get_doc());
		}
		
		
	}
}
