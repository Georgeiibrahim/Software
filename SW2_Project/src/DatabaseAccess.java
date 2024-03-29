import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.connect.spi.Connection;


public class DatabaseAccess implements INotificationTemplateDataAccessLayer {
	java.sql.Connection con=null;
	 public DatabaseAccess() throws ClassNotFoundException, SQLException {
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         con=(java.sql.Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Component;user=Admin;password=Admin"); 
	}
	 public List<NotificationTemplate> getTemplates()
	 {
		 List<NotificationTemplate> templates=new ArrayList<>();
		 String sql="select * from template";
		 
		 try
		 {
			 Statement st=con.createStatement();
			 ResultSet rs=st.executeQuery(sql);
			 while(rs.next())
			 {
				 NotificationTemplate n=new NotificationTemplate();
				 n.setId(rs.getInt(1));
				 n.setSubject(rs.getString(2));
				 n.setBody(rs.getString(3));
				 n.setLanguage(rs.getInt(4));
				 templates.add(n);
			 }
			 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 return templates;
	 }
	@Override
	public void Create(NotificationTemplate t) {
		String sql="insert into template values(?,?,?)";
		 try
		 {
			 PreparedStatement st=con.prepareStatement(sql);
			 st.setString(1, t.getSubject());
			 st.setString(2, t.getBody());
			 st.setInt(3, t.getLanguage());
			 
			st.executeUpdate();
			
			 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		
		
	}

	@Override
	public void Update(NotificationTemplate t) {
		String sql="update template set Tsubject=?,Tbody=?,Lid=?where id=?";
		 try
		 {
			 PreparedStatement st=con.prepareStatement(sql);
			 st.setString(1, t.getSubject());
			 st.setString(2, t.getBody());
			 st.setInt(3, t.getLanguage());
			 st.setInt(4, t.getId());
			 
			 st.executeUpdate();
			
			 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		
	}

	@Override
	public NotificationTemplate Read(int id) {
		String sql="select * from template where id="+id;
		NotificationTemplate n=new NotificationTemplate();
		 try
		 {
			 Statement st=con.createStatement();
			 ResultSet rs=st.executeQuery(sql);
			 if(rs.next())
			 {
				 
				 n.setId(rs.getInt(1));
				 n.setSubject(rs.getString(2));
				 n.setBody(rs.getString(3));
				 n.setLanguage(rs.getInt(4));
			 }
			 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		
		return n;
	}

	@Override
	public void Delete(int templateID) {
		String sql2="delete from template where id="+templateID;
		
		 try
		 {
			 Statement st=con.createStatement();
			 st.execute(sql2);
			 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		
	}
	

}
