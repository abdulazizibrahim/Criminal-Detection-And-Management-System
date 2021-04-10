package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;

public class SHOController {
	@FXML
	private Button CompNotibtn;
	@FXML
	private Button FirRegbtn;
	@FXML
	private Button TeamAssbtn;
	@FXML
	private Button CriminalRegbtn;
	@FXML
	private Button TeamStsbtn;
	@FXML
	private Button cp;
	
	Stage primaryStage;
	database db;
	
	public void ComplaintNotification(ActionEvent event)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("CN.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Complaint Notifications");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}
	public void FIR_Registration(ActionEvent event)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("Fir.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("FIR Registration");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}
	public void Team_Assignment()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("team.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Team Assignment");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}
	public void Criminal_Registration()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("CR.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Criminal Registration");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}
	public void Team_Status()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("TS.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Team Status");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}
	public void changePassword() {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application4/UpdatePassword.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("SHO Update Password");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("cannot load window");
		}
	}
	
	
	
}
