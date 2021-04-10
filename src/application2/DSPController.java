package application2;

import javafx.event.ActionEvent;
import application.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DSPController {
	@FXML
	private Button firn;
	@FXML
	private Button caseh;
	@FXML
	private Button caser;
	@FXML
	private Button teamr;
	@FXML
	private Button emps;
	@FXML
	private Button teams;
	private SHOController s = new SHOController();
	
	public void FirNotification(ActionEvent event)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("FIRN.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("FIR Notifications");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}
	public void CaseHandling(ActionEvent event)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("CH.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Case Handling");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
		
	}
	public void CaseReport(ActionEvent event)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("CaseR.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Case Report");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
		
	}
	public void TeamReport(ActionEvent event)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("TR.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Team Report");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
		
	}
	public void EmployeeStatus(ActionEvent event)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("EMPS.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Employee Status");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}
	public void TeamStatus(ActionEvent event)
	{
		s.Team_Status();
	}
	public void change() {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application2/PasswordChange.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("DSP Update Password");
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
