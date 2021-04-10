package application3;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DPOV {
	
	public void Action_comp()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application/CN.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Complaint Notification");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}
	public void Action_fir()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application2/FIRN.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("FIR Notification");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
		
	}
	public void Action_team()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application/TS.fxml")));
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
	public void Action_emp()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application2/EMPS.fxml")));
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
	public void Action_case()
	{
		//System.out.println("button pressesd");
		
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("CaseH.fxml")));
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

}
