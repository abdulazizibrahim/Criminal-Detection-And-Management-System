package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TS {
	private final IntegerProperty firno;
	private final StringProperty firname;
	private final StringProperty teamname;
	private final StringProperty teamhead;
	private final IntegerProperty noofmembers;
	
	public TS(int firno, String firname, String teamname, String teamhead, int noofmembers)
	{
		this.firno = new SimpleIntegerProperty(firno);
		this.firname = new SimpleStringProperty(firname);
		this.teamname = new SimpleStringProperty(teamname);
		this.teamhead = new SimpleStringProperty(teamhead);
		this.noofmembers = new SimpleIntegerProperty(noofmembers);
		
	}
	//getters
	public int get_firno()
	{
		return firno.get();
	}
	public String get_firname()
	{
		return firname.get();
	}
	public String get_teamname()
	{
		return teamname.get();
	}
	public String get_teamhead()
	{
		return teamhead.get();
	}
	public int get_noofmembers()
	{
		return noofmembers.get();
	}
	
	//Setters
	
	public void set_firno(int value)
	{
		firno.set(value);
	}
	public void set_firname(String value)
	{
		firname.set(value);
	}
	public void set_teamname(String value)
	{
		teamname.set(value);
	}
	public void set_teamhead(String value)
	{
		teamhead.set(value);
	}
	public void set_noofmembers(int value)
	{
		noofmembers.set(value);
	}
	
	//properties
	
	public IntegerProperty firnoProperty()
	{
		return firno;
	}
	public StringProperty firnameProperty()
	{
		return firname;
	}
	public StringProperty teamnameProperty()
	{
		return teamname;
	}
	public StringProperty teamheadProperty()
	{
		return teamhead;
	}
	public IntegerProperty noofmembersProperty()
	{
		return noofmembers;
	}
}
