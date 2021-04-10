package application4;

import application.database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ComplaitController {
	@FXML
	private TextField txtcnic;
	@FXML
	private TextField txtname;
	@FXML
	private TextField txtemail;
	@FXML
	private TextField txtphone;
	@FXML
	private TextField txtdate;
	@FXML
	private TextField txttime;
	@FXML
	private TextField txtplace;
	@FXML
	private TextArea txtdetails;
	@FXML
	private Button btnsubmit;
	@FXML
	private Button clsbtn;
	
	private database db = new database();
	
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
	public String get_date()
	{
		return txtdate.getText();
	}
	public String get_time()
	{
		return txttime.getText();
	}
	public String get_place()
	{
		return txtplace.getText();
	}
	public String get_details()
	{
		return txtdetails.getText();
	}
	public void Action(ActionEvent event)
	{
		db.connect();
		db.Complaint_input(get_cnic(), get_name(), get_email(), get_phone(), get_date(), get_time(), get_place(), get_details());
		Stage stage = (Stage) btnsubmit.getScene().getWindow();
		stage.close();
	}
	public void Close(ActionEvent e){
		Stage stage = (Stage) clsbtn.getScene().getWindow();
		stage.close();
	}
}
