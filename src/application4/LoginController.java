package application4;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

import application.database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.Popup;

public class LoginController {
	@FXML
	private ComboBox<String> comb;
	@FXML
	private PasswordField txtpass;
	@FXML
	private Button btnlogin;
	private database db = new database();
	public void initialize()
	{
		comb.getItems().addAll("SHO", "DSP", "DPO");
	}
	public String get_username() { return comb.getValue(); }
	
	public String getResult(){
		db.connect();
		String x = db.getPassword(get_username());
		return x;
	}
	public void Login(ActionEvent event)
	{
		String password = getResult();
		String msg = get_username();
		if (get_username() == "SHO"){
			if (!txtpass.getText().equals(password)) {
				System.out.println("Your password is incorrect!");
			}
			else {
				try
				{
					FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application/SHO.fxml")));
					Parent root1 = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.setTitle("SHO Panel");
					stage.setScene(new Scene(root1));
					stage.show();
				}
				catch(Exception e)
				{
					System.out.println("cannot load window");
				}
			}
		}
		else if(get_username() == "DSP")
		{
			if (!txtpass.getText().equals(password)) {
				System.out.println("Your password is incorrect!");
			}
			else
			{
				try {
					FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application2/DSP.fxml")));
					Parent root1 = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.setTitle("DSP Panel");
					stage.setScene(new Scene(root1));
					stage.show();
				}
				catch(Exception e)
				{
					System.out.println("cannot load window");
				}
			}
		}
		else if(get_username() == "DPO")
		{
			if (!txtpass.getText().equals(password)) {
				System.out.println("Your password is incorrect!");
			}
			else
			{
				try {
					FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application3/DPO.fxml")));
					Parent root1 = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.setTitle("DPO Panel");
					stage.setScene(new Scene(root1));
					stage.show();
				}
				catch(Exception e)
				{
					System.out.println("cannot load window");
				}
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "wrong username or password try again");
		}
	}
}