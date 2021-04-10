package application2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import application.*;

public class FIRNController {
	@FXML
	private TableView<FIRN> firtbl;
	@FXML
	private TableColumn<FIRN, Integer> tblfirno;
	@FXML
	private TableColumn<FIRN, String> tblfirname;
	@FXML
	private TableColumn<FIRN, String> tblname;
	@FXML
	private TableColumn<FIRN, String> tblphone;
	@FXML
	private TableColumn<FIRN, String> tbltime;
	@FXML
	private TableColumn<FIRN, String> tbldate;
	@FXML
	private TableColumn<FIRN, String> tblplace;
	@FXML
	private TableColumn<FIRN, String> tbldetails;
	
	private ObservableList<FIRN>data;
	private database db;
	private Connection cn;
	private ResultSet rs;
	public void MouseClicked(MouseEvent event)
	{
		ObservableList<FIRN> caseh;
		caseh = firtbl.getSelectionModel().getSelectedItems();
		JOptionPane.showMessageDialog(null, "fir no : " + caseh.get(0).get_firno() +"\n" + "fir : " + caseh.get(0).get_firname() + "\n" + "Name : " + caseh.get(0).get_name() + "\n" + "phone : " + caseh.get(0).get_phone() +"\n" + "Time : " + caseh.get(0).get_time() +"\n" + " date :" +caseh.get(0).get_date() +"\n"  + "Place :" + caseh.get(0).get_place() + "\n" + "Details:" + caseh.get(0).get_details());
	}
	
	public void initialize() {
		db = new database();
		cn = db.connect();
		//System.out.println("Connection initialized!");
		data = FXCollections.observableArrayList();
		rs = db.get_FIRN();
		try {
			while(rs.next())
			{
					data.add(new FIRN(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7), rs.getString(8)));
					
			}
			//System.out.println("in");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tblfirno.setCellValueFactory(new PropertyValueFactory<>("firno"));
		tblfirname.setCellValueFactory(new PropertyValueFactory<>("firname"));
		tblname.setCellValueFactory(new PropertyValueFactory<>("name"));
		tblphone.setCellValueFactory(new PropertyValueFactory<>("phone"));
		tbltime.setCellValueFactory(new PropertyValueFactory<>("time"));
		tbldate.setCellValueFactory(new PropertyValueFactory<>("date"));
		tblplace.setCellValueFactory(new PropertyValueFactory<>("place"));
		tbldetails.setCellValueFactory(new PropertyValueFactory<>("details"));
		
		firtbl.setItems(null);
		firtbl.setItems(data);
		
	}
}
