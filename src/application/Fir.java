package application;

public class Fir {
	
	private String firno;
	private String compno;
	private FirController f = new FirController();
	Fir()
	{
		this.firno = f.get_firno();
		this.compno = f.get_compno();
	}
	public String get_compno()
	{
		return compno;
	}
	public String get_firno()
	{
		return firno;
	}
	

}
