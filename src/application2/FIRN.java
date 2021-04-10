package application2;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FIRN {

	private final IntegerProperty firno;
	private final StringProperty firname;
	private final StringProperty name;
	private final StringProperty phone;
	private final StringProperty time;
	private final StringProperty date;
	private final StringProperty place;
	private final StringProperty details;
	
	public FIRN(int firno, String firname, String name, String phone, String time, String date, String place , String details)
	{
		this.firno = new SimpleIntegerProperty(firno);
		this.firname = new SimpleStringProperty(firname);
		this.name = new SimpleStringProperty(name);
		this.phone = new SimpleStringProperty(phone);
		this.time = new SimpleStringProperty(time);
		this.date = new SimpleStringProperty(date);
		this.place = new SimpleStringProperty(place);
		this.details = new SimpleStringProperty(details);
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
	public String get_name()
	{
		return name.get();
	}
	public String get_phone()
	{
		return phone.get();
	}
	public String get_time()
	{
		return time.get();
	}
	public String get_date()
	{
		return date.get();
	}
	public String get_place()
	{
		return place.get();
	}
	public String get_details()
	{
		return details.get();
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
	public void set_name(String value)
	{
		name.set(value);
	}
	public void set_phone(String value)
	{
		phone.set(value);
	}
	public void set_time(String value)
	{
		time.set(value);
	}
	public void set_date(String value)
	{
		date.set(value);
	}
	public void set_place(String value)
	{
		place.set(value);
	}
	public void set_details(String value)
	{
		details.set(value);
	}
	//Properties
	public IntegerProperty firnoProperty()
	{
		return firno;
	}
	public StringProperty firnameProperty()
	{
		return firname;
	}
	public StringProperty nameProperty()
	{
		return name;
	}
	public StringProperty phoneProperty()
	{
		return phone;
	}
	public StringProperty timeProperty()
	{
		return time;
	}
	public StringProperty dateProperty()
	{
		return date;
	}
	public StringProperty placeProperty()
	{
		return place;
	}
	public StringProperty detailsProperty()
	{
		return details;
	}
}
