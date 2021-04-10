package application2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import application.TS;
import application.database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class EMPSController {
	@FXML
	private TableView<EMPS> tblemp;
	@FXML
	private TableColumn<EMPS,String> tblcnic;
	@FXML
	private TableColumn<EMPS,String> tblname;
	@FXML
	private TableColumn<EMPS,String> tblrank;
	@FXML
	private TableColumn<EMPS,String> tblteam;
	@FXML
	private TableColumn<EMPS,String> tblstatus;
	
	private ObservableList<EMPS>data;
	private database db;
	private Connection cn;
	private ResultSet rs;
	public void MouseClicked(MouseEvent event)
	{
		ObservableList<EMPS> caseh;
		caseh = tblemp.getSelectionModel().getSelectedItems();
		JOptionPane.showMessageDialog(null, "CNIC : " + caseh.get(0).get_cnic() +"\n" + " Name : " + caseh.get(0).get_name() + "\n" + "Rank : " + caseh.get(0).get_rank() + "\n" + "Status : " + caseh.get(0).get_status() );
	}
	public void initialize() {
		db = new database();
		cn = db.connect();
		//System.out.println("Connection initialized!");
		data = FXCollections.observableArrayList();
		rs = db.get_emps();
		try {
			while(rs.next())
			{
					data.add(new EMPS( rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5)));
					
			}
		//	System.out.println("in");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tblcnic.setCellValueFactory(new PropertyValueFactory<>("cnic"));
		tblname.setCellValueFactory(new PropertyValueFactory<>("name"));
		tblrank.setCellValueFactory(new PropertyValueFactory<>("rank"));
		tblteam.setCellValueFactory(new PropertyValueFactory<>("team"));
		tblstatus.setCellValueFactory(new PropertyValueFactory<>("status"));
	
		tblemp.setItems(null);
		tblemp.setItems(data);
		
	}

}
