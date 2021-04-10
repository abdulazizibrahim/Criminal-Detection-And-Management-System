package application;

import java.sql.*;

import javax.swing.JOptionPane;

import application3.CaseH;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class CNController {
	@FXML
	private TableView<CN> comptbl;
	@FXML
	private TableColumn<CN,Integer> compNotbl;
	@FXML
	private TableColumn<CN, String> CNICtbl;
	@FXML
	private TableColumn<CN, String> nametbl;
	@FXML
	private TableColumn<CN, String> emailtbl;
	@FXML
	private TableColumn<CN, String> phonetbl;
	@FXML
	private TableColumn<CN, String> datetbl;
	@FXML
	private TableColumn<CN, String> timetbl;
	@FXML
	private TableColumn<CN, String> placetbl;
	@FXML
	private TableColumn<CN, String> detailstbl;
	
	private ObservableList<CN>data;
	private database db;
	private Connection cn;
	private ResultSet rs;
	public void MouseClicked(MouseEvent event)
	{
		ObservableList<CN> caseh;
		caseh = comptbl.getSelectionModel().getSelectedItems();
		JOptionPane.showMessageDialog(null, "comp no : " + caseh.get(0).get_compno() +"\n" + "CNIC : " + caseh.get(0).get_cnic() + "\n" + "Name : " + caseh.get(0).get_name() + "\n" + "email : " + caseh.get(0).get_email() +"\n" + "phone : " + caseh.get(0).get_phone() +"\n" + " date :" +caseh.get(0).get_date() +"\n" + "time" + caseh.get(0).get_time() + "\n" + "date" + caseh.get(0).get_date() + "\n" + "Place :" + caseh.get(0).get_place() + "\n" + "Details:" + caseh.get(0).get_details());
	}
	
	public void initialize() {
		db = new database();
		cn = db.connect();
		//System.out.println("Connection initialized!");
		data = FXCollections.observableArrayList();
		rs = db.get_CN();
		try {
			while(rs.next())
			{
					data.add(new CN(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7), rs.getString(8), rs.getString(9)));
					
			}
			//System.out.println("in");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		compNotbl.setCellValueFactory(new PropertyValueFactory<>("compno"));
		CNICtbl.setCellValueFactory(new PropertyValueFactory<>("cnic"));
		nametbl.setCellValueFactory(new PropertyValueFactory<>("name"));
		emailtbl.setCellValueFactory(new PropertyValueFactory<>("email"));
		phonetbl.setCellValueFactory(new PropertyValueFactory<>("phone"));
		datetbl.setCellValueFactory(new PropertyValueFactory<>("date"));
		timetbl.setCellValueFactory(new PropertyValueFactory<>("time"));
		placetbl.setCellValueFactory(new PropertyValueFactory<>("place"));
		detailstbl.setCellValueFactory(new PropertyValueFactory<>("details"));
		
		comptbl.setItems(null);
		comptbl.setItems(data);
		
	}
	

}
