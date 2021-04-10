package application2;

public class CH {
	private CHController ch;
	private String txtfirno;
	private String txtcourt;
	private String txtjudge;
	private String txtlawyer;
	private String txtclawyer;
	private String txttime;
	private String txtdate;
	private String txtaddress;
	private String txtps;
	
	//getters
	public int get_firno()
	{
		//int i = Integer.parseInt(ch.get_firno().trim());
		return ch.get_firno();
	}
	public String get_court()
	{
		return ch.get_court();
	}
	public String get_judge()
	{
		return ch.get_judge();
	}
	public String get_lawyer()
	{
		return ch.get_lawyer();
	}
	public String get_clawyer()
	{
		return ch.get_clawyer();
	}
	public String get_time()
	{
		return ch.get_time();
	}
	public String get_date()
	{
		return ch.get_date();
	}
	public String get_address()
	{
		return ch.get_address();
	}
	public String get_ps()
	{
		return ch.get_ps();
	}

}
