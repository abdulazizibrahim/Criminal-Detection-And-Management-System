package application3;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CaseH {
	private final IntegerProperty caseno;
	private final IntegerProperty firno;
	private final StringProperty court;
	private final StringProperty judge;
	private final StringProperty lawyer;
	private final StringProperty clawyer;
	private final StringProperty time;
	private final StringProperty date;
	private final StringProperty cloc;
	private final StringProperty ps;
	
	public CaseH(int caseno, int firno, String court, String judge, String lawyer, String clawyer, String time, String date, String cloc, String ps)
	{
		this.caseno = new SimpleIntegerProperty(caseno);
		this.firno = new SimpleIntegerProperty(firno);
		this.court = new SimpleStringProperty(court);
		this.judge = new SimpleStringProperty(judge);
		this.lawyer = new SimpleStringProperty(lawyer);
		this.clawyer = new SimpleStringProperty(clawyer);
		this.time = new SimpleStringProperty(time);
		this.date = new SimpleStringProperty(date);
		this.cloc = new SimpleStringProperty(cloc);
		this.ps = new SimpleStringProperty(ps);
	}
	
	//getters
	public int get_caseno()
	{
		return caseno.get();
	}
	public int get_firno()
	{
		return firno.get();
	}
	public String get_court()
	{
		return court.get();
	}
	public String get_judge()
	{
		return judge.get();
	}
	public String get_lawyer()
	{
		return lawyer.get();
	}
	public String get_clawyer()
	{
		return clawyer.get();
	}
	public String get_time()
	{
		return time.get();
	}
	public String get_date()
	{
		return date.get();
	}
	public String get_cloc()
	{
		return cloc.get();
	}
	public String get_ps()
	{
		return ps.get();
	}
	//setters
	
	public void set_caseno(int value)
	{
		caseno.set(value);
	}
	public void set_firno(int value)
	{
		firno.set(value);
	}
	public void set_court(String value)
	{
		court.set(value);
	}
	public void set_judge(String value)
	{
		judge.set(value);
	}
	public void set_lawyer(String value)
	{
		lawyer.set(value);
	}
	public void set_clawyer(String value)
	{
		clawyer.set(value);
	}
	public void set_time(String value)
	{
		time.set(value);
	}
	public void set_date(String value)
	{
		date.set(value);
	}
	public void set_cloc(String value)
	{
		cloc.set(value);
	}
	public void set_ps(String value)
	{
		ps.set(value);
	}
	
	//properties
	public IntegerProperty casenoProperty()
	{
		return caseno;
	}
	public IntegerProperty firnoProperty()
	{
		return firno;
	}
	public StringProperty courtProperty()
	{
		return court;
	}
	public StringProperty judgeProperty()
	{
		return judge;
	}
	public StringProperty lawyerProperty()
	{
		return lawyer;
	}
	public StringProperty clawyerProperty()
	{
		return clawyer;
	}
	public StringProperty timeProperty()
	{
		return time;
	}
	public StringProperty dateProperty()
	{
		return date;
	}
	public StringProperty clocProperty()
	{
		return cloc;
	}
	public StringProperty psProperty()
	{
		return ps;
	}
	
}
