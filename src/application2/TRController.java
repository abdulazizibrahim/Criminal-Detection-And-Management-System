package application2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import application.CN;
import application.database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class TRController {
	@FXML
	private TableView<TR> tbltr;
	@FXML
	private TableColumn<TR, String> tblfirno;
	@FXML
	private TableColumn<TR, String> tblfirname;
	@FXML
	private TableColumn<TR, String> tblplace;
	@FXML
	private TableColumn<TR, String> tbldetails;
	@FXML
	private TableColumn<TR, String> tblteam;
	@FXML
	private TableColumn<TR, String> tblreport;
	
	private ObservableList<TR>data;
	private database db;
	private Connection cn;
	private ResultSet rs;
	public void MouseClicked(MouseEvent event)
	{
		ObservableList<TR> caseh;
		caseh = tbltr.getSelectionModel().getSelectedItems();
		JOptionPane.showMessageDialog(null, "fir no : " + caseh.get(0).get_firno() +"\n" + "fir : " + caseh.get(0).get_firname()  + "Place :" + caseh.get(0).get_Place() + "\n" + "Details:" + caseh.get(0).get_details() + "team :" + caseh.get(0).get_team() + "\n" + "Report:" + caseh.get(0).get_report());
	}
	
	public void initialize() {
		db = new database();
		cn = db.connect();
		//System.out.println("Connection initialized!");
		data = FXCollections.observableArrayList();
		rs = db.TR();
		try {
			while(rs.next())
			{
					data.add(new TR(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)));
					
			}
			System.out.println("in");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tblfirno.setCellValueFactory(new PropertyValueFactory<>("firno"));
		tblfirname.setCellValueFactory(new PropertyValueFactory<>("firname"));
		tblplace.setCellValueFactory(new PropertyValueFactory<>("Place"));
		tbldetails.setCellValueFactory(new PropertyValueFactory<>("details"));
		tblteam.setCellValueFactory(new PropertyValueFactory<>("team"));
		tblreport.setCellValueFactory(new PropertyValueFactory<>("report"));
		
		tbltr.setItems(null);
		tbltr.setItems(data);
		
	}
	
	

}
