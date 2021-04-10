package application2;

public class CaseR {
	private String caseno;
	private String firno;
	private String report;
	private CaseRController cr;
	public int get_caseno()
	{
		//int i = Integer.parseInt(cr.get_case().trim());
		return cr.get_case();
	}
	public int  get_firno()
	{
		//int i = Integer.parseInt(cr.get_fir().trim());
		return cr.get_fir();
	}
	public String get_report()
	{
		return cr.get_report();
	}
}
