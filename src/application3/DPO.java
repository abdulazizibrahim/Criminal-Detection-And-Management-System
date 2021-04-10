package application3;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DPO {
	
	public void Action_handle()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("DPOH.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("DPO Handle");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
		
	}
	public void Action_view()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("DPOV.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("DPO View");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}
	
}
