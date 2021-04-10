package application;
public class CR {

	private String cnic;
	private String name;
	private String email;
	private String phone;
	private String crime;
	private String doc;
	private CRController  c= new CRController();
	CR(String cnic, String name, String email, String phone, String crime, String doc)
	{
		this.cnic = c.get_cnic();
		this.name = c.get_name();
		this.email = c.get_email();
		this.crime = c.get_crime();
		this.doc = c.get_doc();
	}
	public String get_cnic()
	{
		return cnic;
	}
	public String get_name()
	{
		return name;
	}
	public String get_email()
	{
		return email;
	}
	public String get_phone()
	{
		return phone;
	}
	public String get_crime()
	{
		return crime;
	}
	public String get_doc()
	{
		return doc;
	}
	
}
