package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class TSController {
	@FXML
	private TableView<TS> tstbl;
	@FXML
	private TableColumn<TS, Integer> firnotbl;
	@FXML
	private TableColumn<TS, String> firtbl;
	@FXML
	private TableColumn<TS, String> nametbl;
	@FXML
	private TableColumn<TS, String> headtbl;
	@FXML
	private TableColumn<TS, Integer> memberstbl;
	
	private ObservableList<TS>data;
	private database db;
	private Connection cn;
	private ResultSet rs;
	public void MouseClicked(MouseEvent event)
	{
		ObservableList<TS> caseh;
		caseh = tstbl.getSelectionModel().getSelectedItems();
		JOptionPane.showMessageDialog(null, "fir no : " + caseh.get(0).get_firno() +"\n" + "FIR Name : " + caseh.get(0).get_firname() + "\n" + "Team Name : " + caseh.get(0).get_teamname() + "\n" + "Team Head : " + caseh.get(0).get_teamhead() +"\n" + "No of members : " + caseh.get(0).get_noofmembers());
	}
	
	public void initialize() {
		db = new database();
		cn = db.connect();
		//System.out.println("Connection initialized!");
		data = FXCollections.observableArrayList();
		rs = db.get_TS();
		try {
			while(rs.next())
			{
					data.add(new TS(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getInt(5)));
					
			}
			//System.out.println("in");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		firnotbl.setCellValueFactory(new PropertyValueFactory<>("firno"));
		firtbl.setCellValueFactory(new PropertyValueFactory<>("firname"));
		nametbl.setCellValueFactory(new PropertyValueFactory<>("teamname"));
		headtbl.setCellValueFactory(new PropertyValueFactory<>("teamhead"));
		memberstbl.setCellValueFactory(new PropertyValueFactory<>("noofmembers"));
		
		tstbl.setItems(null);
		tstbl.setItems(data);
		
	}
}
