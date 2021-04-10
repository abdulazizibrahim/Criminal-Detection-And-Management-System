package application;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class team {
//	private String Head;
//	private int noOfMembers;
//	private String Name;
	private database db = new database();
	@FXML
	private TextField txtfir;
	@FXML
	private Button btn;
	@FXML
	private ComboBox<String> combo;
	
	public int get_fir()
	{
		return Integer.parseInt(txtfir.getText());
	}
	public String get_combo()
	{
		return combo.getValue();
	}
	public void initialize()
	{
		combo.getItems().addAll("A", "B", "C");
	}
	
	 public void onClick(ActionEvent event) { 
		 db.connect();
		 if (get_combo() == null && txtfir.getText().isEmpty() == true){
			  JOptionPane.showMessageDialog(null, "Please fill in all the required fields");
		  }
		  else {
			  db.updateFirTeam(get_combo(), get_fir());
			  final Node source = (Node) event.getSource();
			  final  Stage stage = (Stage) source.getScene().getWindow();
			  stage.close();
		  }
		  
	  }
	
}
