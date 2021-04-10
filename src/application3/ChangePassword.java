package application3;

import javax.swing.JOptionPane;

import application.database;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ChangePassword {
	
	@FXML
	public TextField newpasstxt;
	private database db = new database();
	private Button updatebtn;
	public void CommitChanges() {
		db.connect();
		db.change("DPO", newpasstxt.getText());
		JOptionPane.showMessageDialog(null, "password has been changed successfully");
	}
}
