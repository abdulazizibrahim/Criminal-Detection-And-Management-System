package application2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import application.*;

public class CHController {
	@FXML
	private TextField txtfirno;
	@FXML
	private TextField txtcourt;
	@FXML
	private TextField txtjudge;
	@FXML
	private TextField txtlawyer;
	@FXML
	private TextField txtclawyer;
	@FXML
	private TextField txttime;
	@FXML
	private TextField txtdate;
	@FXML
	private TextArea txtaddress;
	@FXML
	private TextField txtps;
	@FXML
	private Button btnsubmit;
	
	private database db;
	private Connection cn;
	private ResultSet rs;
	private CH c;
	//get
	public int get_firno()
	{
		int i = Integer.parseInt(txtfirno.getText().trim());
		return i;
	}
	public String get_court()
	{
		return txtcourt.getText();
	}
	public String get_judge()
	{
		return txtjudge.getText();
	}
	public String get_lawyer()
	{
		return txtlawyer.getText();
	}
	public String get_clawyer()
	{
		return txtclawyer.getText();
	}
	public String get_time()
	{
		return txttime.getText();
	}
	public String get_date()
	{
		return txtdate.getText();
	}
	public String get_address()
	{
		return txtaddress.getText();
	}
	public String get_ps()
	{
		return txtps.getText();
	}
	public void initialize()
	{
		db = new database();
		db.connect();
	}
	public void Action(ActionEvent event)
	{
		if (get_address().isEmpty() == true || get_clawyer().isEmpty() == true || get_court().isEmpty() == true || get_date().isEmpty() == true || txtfirno.getText().isEmpty() == true || get_judge().isEmpty() == true || get_lawyer().isEmpty() == true || get_ps().isEmpty() == true || get_time().isEmpty() == true){
			JOptionPane.showMessageDialog(null, "Please fill in all the required fields");
		}
		else
			db.CH_input(get_firno(), get_court(), get_judge(), get_lawyer(), get_clawyer(),get_time(), get_date(), get_address(), get_ps());
	}
	
	
}
