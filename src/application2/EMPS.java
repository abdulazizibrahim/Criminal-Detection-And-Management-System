package application2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EMPS {

	private final StringProperty cnic;
	private final StringProperty name;
	private final StringProperty rank;
	private final StringProperty team;
	private final StringProperty status;
	
	public EMPS(String cnic, String name, String rank, String team, String status)
	{
		this.cnic = new SimpleStringProperty(cnic);
		this.name = new SimpleStringProperty(name);
		this.rank = new SimpleStringProperty(rank);
		this.team = new SimpleStringProperty(team);
		this.status = new SimpleStringProperty(status);
	}
	
	//getters
	public String get_cnic()
	{
		return cnic.get();
	}
	public String get_name()
	{
		return name.get();
	}
	public String get_rank()
	{
		return rank.get();
	}
	public String get_team()
	{
		return team.get();
	}
	public String get_status()
	{
		return status.get();
	}
	//setters
	
	public void set_cnic(String value)
	{
		cnic.set(value);
	}
	public void set_name(String value)
	{
		name.set(value);
	}
	public void set_rank(String value)
	{
		rank.set(value);
	}
	public void set_team(String value)
	{
		team.set(value);
	}
	public void set_status(String value)
	{
		status.set(value);
	}
	//properties
	public StringProperty cnicProperty()
	{
		return cnic;
	}
	public StringProperty nameProperty()
	{
		return name;
	}
	public StringProperty rankProperty()
	{
		return rank;
	}
	public StringProperty teamProperty()
	{
		return team;
	}
	public StringProperty statusProperty()
	{
		return status;
	}
}
