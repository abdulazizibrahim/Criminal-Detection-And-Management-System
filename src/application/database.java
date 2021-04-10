package application;

import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
public class database {
	private Connection cn;
	private ResultSet rs;
	private Statement st;
	public Connection connect()
	{
		cn = null;
		try {
			cn= DriverManager.getConnection("jdbc:mysql://localhost/cdms","root", "");
			//System.out.println("in");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}
	public ResultSet criminal_search(String input)
	{
		String query = "select CNIC, Name, Phone, Crime, DetailsOfcrime  from criminal where Name Like '"+input+"' ";
		try {
			st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			//System.out.println("in");
			return rs;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not foud");
		}
		return rs;
		
	}
	public void Complaint_input(String cnic, String name, String email, String phone,String date, String time, String place, String details)
	{
		String query = "INSERT INTO compreg(CNIC,Name, Email, Phone,InciDate, InciTime, InciPlace, InciDetails) VALUES('"+cnic+"','"+name+"','"+email+"','"+phone+"', '"+date+"', '"+time+"', '"+place+"', '"+details+"')";
		try {
			st = cn.createStatement();
			st.executeUpdate(query);
			//System.out.println("query in");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ResultSet get_CH()
	{
		String query = "select * from cases";
		try {
			st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			//System.out.println("in");
			return rs;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not foud");
		}
		return rs;
	}
	public ResultSet TR()
	{
		String query = "SELECT fir.FIRNo, fir.FirName,fir.InciPlace,fir.InciDetails,  fir.Team, casereport.report FROM fir INNER JOIN casereport ON fir.firno = casereport.firno and  Active_Status = 1";
		try {
			st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			//System.out.println("in");
			return rs;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not foud");
		}
		return rs;
		
	}
	public void input_caser(int caseno, int firno, String report)
	{
		String query = "INSERT INTO casereport VALUES('"+caseno+"','"+firno+"','"+report+"')";
		try {
			st = cn.createStatement();
			st.executeUpdate(query);
			//System.out.println("query in");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ResultSet get_emps()
	{
		String query1 = "SELECT * from employee";
		try {
			st = cn.createStatement();
			ResultSet rs = st.executeQuery(query1);
			//System.out.println("in");
			return rs;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not foud");
		}
		return rs;
		
	}
	public void CH_input(int firno, String cname, String jname, String lname, String clname, String time, String date, String address, String ps)
	{
		String query = "INSERT INTO cases(FIRNo, CName, JName, LName, CLName, Time, Date, CLocation, PStation) VALUES('"+firno+"','"+cname+"','"+jname+"','"+lname+"', '"+clname+"','"+time+"','"+date+"','"+address+"', '"+ps+"')";
		try {
			st = cn.createStatement();
			st.executeUpdate(query);
			//System.out.println("query in");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ResultSet get_FIRN()
	{
		String query1 = "SELECT FIRNo, FIRName, Name, Phone, Incitime, InciDate, InciPlace, InciDetails FROM fir";
		try {
			st = cn.createStatement();
			ResultSet rs = st.executeQuery(query1);
			//System.out.println("in");
			return rs;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not foud");
		}
		return rs;
	}
	public ResultSet get_CN()
	{
		String query1 = "SELECT * FROM compreg";
		try {
			st = cn.createStatement();
			ResultSet rs = st.executeQuery(query1);
			//System.out.println("in");
			return rs;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not foud");
		}
		return rs;
	}
	public void CR_input(String cnic, String name, String email, String phone, String crime, String doc)
	{
		String query = "INSERT INTO criminal(CNIC,Name, Email, Phone, Crime, DetailsOfcrime) VALUES('"+cnic+"','"+name+"','"+email+"','"+phone+"', '"+crime+"', '"+doc+"')";
		try {
			st = cn.createStatement();
			st.executeUpdate(query);
			//System.out.println("query in");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Fir_Registration(int compno, String firname)
	{
		String query = "delete from compreg where CompNo = '"+compno+"' ";
		try {
			st = cn.createStatement();
			st.executeUpdate(query);
			//System.out.println("query in");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		   LocalDateTime now = LocalDateTime.now();
		String query1 = "Update fir SET FirName = '"+firname+"', DATE_TIME = '"+dtf.format(now)+"' WHERE CompNo = '"+compno+"'";
		try {
			st = cn.createStatement();
			st.executeUpdate(query1);
			//System.out.println("query in");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ResultSet get_TS()
	{
		String query = "SELECT fir.FIRNo, fir.FirName, team.Name, team.Head,team.NoOfMembers FROM fir INNER JOIN team ON fir.team = team.Name and  Active_Status = 1";
		try {
			st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			//System.out.println("in");
			return rs;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not foud");
		}
		return rs;
	}
	public void updateFirTeam(String Name, int Fir) {
		//connect();
		if (checkTeamStatus(Name) == 1 ) {
			String query1 = "UPDATE fir SET Team = '"+Name+"', Active_Status = 1 WHERE FIRNo = '"+Fir+"'";
			try {
				st = cn.createStatement();
				st.executeUpdate(query1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Not foud");
			}
		}
		else {
			System.out.println("Team Investigation Limit Reached");
		}
	}
	
	public int checkTeamStatus(String Name) {
		String query1 = "SELECT COUNT(Active_Status) FROM fir WHERE Team = '"+Name+"' and Active_Status = 1";
		String a = "";
		String columnValue = "";
		ResultSetMetaData rsmd;
		try {
			connect();
			st = cn.createStatement();
			ResultSet r = st.executeQuery(query1);
			rsmd = r.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (r.next()) {
		       for (int i = 1; i <= columnsNumber; i++) {
		           if (i > 1) System.out.print(",  ");
		           columnValue = r.getString(i);
		           int j = Integer.parseInt(columnValue.trim());
					if (j < 2) {
						return 1;
					}
					return 0;
		       }
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Not foud");
		}
		return 0;
	}
	
	public String getPassword(String rank) {
		String query = "Select * from users where Rank = '" + rank +"'";
		String x = "";
		try {
			st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				x = rs.getString("password");
			}
			return x;
		} 
		catch (SQLException e) {
			System.out.println("Not foud");
		}
		return null;
	}
	public void change(String rank, String pass) {
		String query = "Update users SET password = '" + pass + "' where Rank = '" + rank + "'";
		try {
			st = cn.createStatement();
			st.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Could not be updated at the moment");
		}
	}
}
