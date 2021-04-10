package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CN {
	private final IntegerProperty compno;
	private final StringProperty cnic;
	private final StringProperty name;
	private final StringProperty email;
	private final StringProperty phone;
	private final StringProperty date;
	private final StringProperty time;
	private final StringProperty place;
	private final StringProperty details;
	
	public CN(int compno, String cnic, String name, String email, String phone, String date, String time, String place, String details)
	{
		this.compno = new SimpleIntegerProperty(compno);
		this.cnic = new SimpleStringProperty(cnic);
		this.name = new SimpleStringProperty(name);
		this.email = new SimpleStringProperty(email);
		this.phone = new SimpleStringProperty(phone);
		this.date = new SimpleStringProperty(date);
		this.time = new SimpleStringProperty(time);
		this.place = new SimpleStringProperty(place);
		this.details = new SimpleStringProperty(details);
	}
	//getters
	
	public int get_compno()
	{
		return compno.get();
	}
	public String get_cnic()
	{
		return cnic.get();
	}
	public String get_name()
	{
		return name.get();
	}
	public String get_email()
	{
		return email.get();
	}
	public String get_phone()
	{
		return phone.get();
	}
	public String get_date()
	{
		return date.get();
	}
	public String get_time()
	{
		return time.get();
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
	
	public void set_compno(int value)
	{
		compno.set(value);
	}
	public void set_cnic(String value)
	{
		cnic.set(value);
	}
	public void set_name(String value)
	{
		name.set(value);
	}
	public void set_email(String value)
	{
		email.set(value);
	}
	public void set_phone(String value)
	{
		phone.set(value);
	}
	public void set_date(String value)
	{
		date.set(value);
	}
	public void set_time(String value)
	{
		time.set(value);
	}
	public void set_place(String value)
	{
		place.set(value);
	}
	public void set_details(String value)
	{
		details.set(value);
	}
	
	//properties
	public IntegerProperty compnoProperty()
	{
		return compno;
	}
	public StringProperty cnicProperty()
	{
		return cnic;
	}
	public StringProperty nameProperty()
	{
		return name;
	}
	public StringProperty emailProperty()
	{
		return email;
	}
	public StringProperty phoneProperty()
	{
		return phone;
	}
	public StringProperty dateProperty()
	{
		return date;
	}
	public StringProperty timeProperty()
	{
		return time;
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
