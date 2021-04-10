package application2;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TR {
	private final IntegerProperty firno;
	private final StringProperty firname;
	private final StringProperty Place;
	private final StringProperty details;
	private final StringProperty team;
	private final StringProperty report;
	
	public TR(int firno, String firname, String Place, String details, String team, String report)
	{
		this.firno = new SimpleIntegerProperty(firno);
		this.firname = new SimpleStringProperty(firname);
		this.Place = new SimpleStringProperty(Place);
		this.details = new SimpleStringProperty(details);
		this.team = new SimpleStringProperty(team);
		this.report = new SimpleStringProperty(report);
	}
	public int get_firno()
	{
		return firno.get();
	}
	public String get_firname()
	{
		return firname.get();
	}
	public String get_Place()
	{
		return Place.get();
	}
	public String get_details()
	{
		return details.get();
	}
	public String get_team()
	{
		return team.get();
	}
	public String get_report()
	{
		return report.get();
	}
	
	public void set_firno(int value)
	{
		firno.set(value);
	}
	public void set_firname(String value)
	{
		firname.set(value);
	}
	public void set_Place(String value)
	{
		Place.set(value);
	}
	public void set_details(String value)
	{
		details.set(value);
	}
	public void set_team(String value)
	{
		team.set(value);
	}
	public void set_report(String value)
	{
		report.set(value);
	}
	
	public IntegerProperty firnoProperty()
	{
		return firno;
	}
	public StringProperty firnameProperty()
	{
		return firname;
	}
	public StringProperty PlaceProperty()
	{
		return Place;
	}
	public StringProperty detailsProperty()
	{
		return details;
	}
	public StringProperty teamProperty()
	{
		return team;
	}
	public StringProperty reportProperty()
	{
		return report;
	}

}
