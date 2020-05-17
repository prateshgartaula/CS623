
import java.sql.*;
public class PaperReviewDriver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/paperreviews","root","pratesh");
	 
	Statement st =con.createStatement();
	ResultSet rs=st.executeQuery(" SELECT firstname, lastname, emailaddress, id, title, abstract FROM AUTHOR, PAPER ");
	
	rs.next();
	String fn=rs.getString("firstname");
	String ln =rs.getString("lastname");
	String  ad=rs.getString("emailaddress");
	
	
	
	System.out.print(fn+"   "+ln+"   "+ad);
	
	
	
	
	
	
	st.close();
	con.close();
	
	
	}

}
