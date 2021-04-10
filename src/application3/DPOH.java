package application3;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DPOH {
	
	public void Action_Fir()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application/Fir.fxml")));
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
	public void Action_criminal()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application/CR.fxml")));
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
	public void Action_team()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application/team.fxml")));
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
	public void Action_CH()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application2/CH.fxml")));
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
	public void Action_CRG()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application2/CaseR.fxml")));
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

}
