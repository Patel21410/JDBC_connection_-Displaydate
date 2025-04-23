package Jdbc_app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DaoImp implements DAO_Access {
	ArrayList<PojoEmp> listEMp = new ArrayList<>();
	Connection con;
	@Override
	public void disPlayData() throws SQLException {
		System.out.println(1);
		con=Util.openConnection();
		System.out.println(2);

		Statement st=con.createStatement();
		System.out.println(3);

		ResultSet re=st.executeQuery("select * from emp");
		System.out.println(4);

		while(re.next()) {
			System.out.println(re.getInt(1)+" "+re.getString(2)+" "+re.getString(3)); 

		}
	}
	

}
