package application3;

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

public class CaseHController {

	@FXML
	private TableView<CaseH> table;
	@FXML
	private TableColumn<CaseH, Integer> tblcase;
	@FXML
	private TableColumn<CaseH, Integer> tblfir;
	@FXML
	private TableColumn<CaseH, String> tblcourt;
	@FXML
	private TableColumn<CaseH, String> tbljudge;
	@FXML
	private TableColumn<CaseH, String> tbllawyer;
	@FXML
	private TableColumn<CaseH, String> tblclawyer;
	@FXML
	private TableColumn<CaseH, String> tbltime;
	@FXML
	private TableColumn<CaseH, String> tbldate;
	@FXML
	private TableColumn<CaseH, String> tblclocation;
	@FXML
	private TableColumn<CaseH, String> tblps;
	
	private ObservableList<CaseH>data;
	private database db;
	private ResultSet rs;
	private Connection cn;
	
	public void MouseClicked(MouseEvent event)
	{
		ObservableList<CaseH> caseh;
		caseh = table.getSelectionModel().getSelectedItems();
		JOptionPane.showMessageDialog(null, "case no : " + caseh.get(0).get_caseno() +"\n" + "FIR no: " + caseh.get(0).get_firno() + "\n" + "court : " + caseh.get(0).get_court() + "\n" + "Judge : " + caseh.get(0).get_judge() +"\n" + "Lawyer : " + caseh.get(0).get_lawyer() +"\n" + " clawyer :" +caseh.get(0).get_clawyer() +"\n" + "time" + caseh.get(0).get_time() + "\n" + "date" + caseh.get(0).get_date() + "\n" + "Court Location :" + caseh.get(0).get_cloc() + "\n" + "Police Station:" + caseh.get(0).get_ps());
	}
	public void initialize() {
		db = new database();
		cn = db.connect();
		//System.out.println("Connection initialized!");
		data = FXCollections.observableArrayList();
		rs = db.get_CH();
		try {
			while(rs.next())
			{
					data.add(new CaseH(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)));
					
			}
			//System.out.println("in");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tblcase.setCellValueFactory(new PropertyValueFactory<>("caseno"));
		tblfir.setCellValueFactory(new PropertyValueFactory<>("firno"));
		tblcourt.setCellValueFactory(new PropertyValueFactory<>("court"));
		tbljudge.setCellValueFactory(new PropertyValueFactory<>("judge"));
		tbllawyer.setCellValueFactory(new PropertyValueFactory<>("lawyer"));
		tblclawyer.setCellValueFactory(new PropertyValueFactory<>("clawyer"));
		tbltime.setCellValueFactory(new PropertyValueFactory<>("time"));
		tbldate.setCellValueFactory(new PropertyValueFactory<>("date"));
		tblclocation.setCellValueFactory(new PropertyValueFactory<>("cloc"));
		tblps.setCellValueFactory(new PropertyValueFactory<>("ps"));
		
		table.setItems(null);
		table.setItems(data);
		
	}
	
	
}

