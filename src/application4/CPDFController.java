package application4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import com.itextpdf.text.DocumentException;

import application.CN;
import application.database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CPDFController {
	@FXML
	private TextField txtname;
	@FXML
	private Button btnsubmit;
	@FXML
	private Button btnprint;
	@FXML
	private TableView<CPDF> Table;
	@FXML
	private TableColumn<CPDF, String> tblcnic;
	@FXML
	private TableColumn<CPDF, String> tblname;
	@FXML
	private TableColumn<CPDF, String> tblphone;
	@FXML
	private TableColumn<CPDF, String> tblcrime;
	@FXML
	private TableColumn<CPDF, String> tbldoc;
	
	private database db = new database();
	private ResultSet rs;
	private Deque<LinkedList<String>> rows;
	private LinkedList<String> cols ;
	private ObservableList<CPDF>data;
	
	public String get_name()
	{
		return txtname.getText();
	}
	public void printTable(ActionEvent event) {
		genPDF pdf = new genPDF();
		try {
			pdf.createPDF(rows, "C:\\Users\\abdul\\OneDrive\\Desktop\\criminal.pdf");
			JOptionPane.showMessageDialog(null, "PDF created!");
		} catch (DocumentException e) {
			e.getMessage();
			JOptionPane.showMessageDialog(null, "Error in printing\n");
		}
	}
	public void Submit(ActionEvent event)
	{
		if(get_name() == null)
		{
			JOptionPane.showMessageDialog(null, "please enter name to search");
			return;
		}
		db.connect();
		rs = db.criminal_search(get_name());
		data = FXCollections.observableArrayList();
		try {
			cols = new LinkedList<String>();
        	cols.add("CNIC");
        	cols.add("Name");
        	cols.add("Phone");
        	cols.add("Crime");
        	cols.add("Details of Crime");
        	rows.add(cols);
			while(rs.next())
			{
				cols = new LinkedList<String>();
            	cols.add(rs.getString(1));
            	cols.add(rs.getString(2));
            	cols.add(rs.getString(3));
            	cols.add(rs.getString(4));
            	cols.add(rs.getString(5));
            	rows.add(cols);
					data.add(new CPDF(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
					
			}
			//System.out.println("in");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tblcnic.setCellValueFactory(new PropertyValueFactory<>("cnic"));
		tblname.setCellValueFactory(new PropertyValueFactory<>("name"));
		tblphone.setCellValueFactory(new PropertyValueFactory<>("phone"));
		tblcrime.setCellValueFactory(new PropertyValueFactory<>("crime"));
		tbldoc.setCellValueFactory(new PropertyValueFactory<>("doc"));
		
		
		Table.setItems(null);
		Table.setItems(data);
		
	}
	public void initialize() {
		rows = new ArrayDeque<LinkedList<String>>();
		tblcnic.setCellValueFactory(new PropertyValueFactory<>("cnic"));
		tblname.setCellValueFactory(new PropertyValueFactory<>("name"));
		tblphone.setCellValueFactory(new PropertyValueFactory<>("phone"));
		tblcrime.setCellValueFactory(new PropertyValueFactory<>("crime"));
		tbldoc.setCellValueFactory(new PropertyValueFactory<>("doc"));
		
		
	}

}
