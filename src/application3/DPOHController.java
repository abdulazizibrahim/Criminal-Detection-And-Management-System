package application3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DPOHController {
	@FXML
	private Button btnfir;
	@FXML
	private Button btncriminal;
	@FXML
	private Button btnteam;
	@FXML
	private Button btnch;
	@FXML
	private Button btncrg;
	
	private DPOH dp = new DPOH();
	public void Action_Fir(ActionEvent event)
	{
		dp.Action_Fir();
	}
	public void Action_criminal(ActionEvent event)
	{
		dp.Action_criminal();
	}
	public void Action_team(ActionEvent event)
	{
		dp.Action_team();
	}
	public void Action_CH(ActionEvent event)
	{
		dp.Action_CH();
	}
	public void Action_CRG(ActionEvent event)
	{
		dp.Action_CRG();
	}

}
