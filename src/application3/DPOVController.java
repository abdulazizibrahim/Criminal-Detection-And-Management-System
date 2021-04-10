package application3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DPOVController {
	@FXML
	private Button btncomp;
	@FXML
	private Button btnfir;
	@FXML
	private Button btnteam;
	@FXML
	private Button btnemp;
	@FXML
	private Button btncase;
	@FXML
	private Button DPOcp;
	
	private DPOV dp = new DPOV();
	
	public void Action_comp(ActionEvent event)
	{
		dp.Action_comp();
	}
	public void Action_fir(ActionEvent event)
	{
		dp.Action_fir();
	}
	public void Action_team(ActionEvent event)
	{
		dp.Action_team();
	}
	public void Action_emp(ActionEvent event)
	{
		dp.Action_emp();
	}
	public void Action_case(ActionEvent event)
	{
		dp.Action_case();
	}
}
