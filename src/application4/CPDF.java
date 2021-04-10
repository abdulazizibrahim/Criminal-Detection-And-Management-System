package application4;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CPDF {
	private final StringProperty cnic;
	private final StringProperty name;
	private final StringProperty phone;
	private final StringProperty crime;
	private final StringProperty doc;
	
	CPDF(String cnic, String name, String phone, String crime, String doc)
	{
		this.cnic = new SimpleStringProperty(cnic);
		this.name = new SimpleStringProperty(name);
		this.phone = new SimpleStringProperty(phone);
		this.crime = new SimpleStringProperty(crime);
		this.doc = new SimpleStringProperty(doc);
	}
	public String get_cnic()
	{
		return cnic.get();
	}
	public String get_name()
	{
		return name.get();
	}
	public String get_crime()
	{
		return crime.get();
	}
	public String get_phone()
	{
		return phone.get();
	}
	public String get_doc()
	{
		return doc.get();
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
		crime.set(value);
	}
	public void set_phone(String value)
	{
		phone.set(value);
	}
	public void set_date(String value)
	{
		doc.set(value);
	}
	
	public StringProperty cnicProperty()
	{
		return cnic;
	}
	public StringProperty nameProperty()
	{
		return name;
	}
	public StringProperty crimeProperty()
	{
		return crime;
	}
	public StringProperty phoneProperty()
	{
		return phone;
	}
	public StringProperty docProperty()
	{
		return doc;
	}

}
