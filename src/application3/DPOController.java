package application3;

import application.database;
import application4.UpdatePasswordController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DPOController {
	@FXML
	private Button btnhandle;
	@FXML
	private Button btnview;
	private database db = new database();
	private DPO dp = new DPO();
	private UpdatePasswordController pc = new UpdatePasswordController();
	
	public void Action_handle(ActionEvent event)
	{
		dp.Action_handle();
	}
	public void Action_view(ActionEvent event)
	{
		dp.Action_view();
	}
	public void changePassword() {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application3/ChangePassword.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("DPO Update Password");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}
	public void Search()
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("/application4/CPDF.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("DPO Update Password");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}
}
