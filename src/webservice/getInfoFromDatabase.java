/**
 * 
 */
package webservice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author Kashinath.Raut
 *
 */
public class getInfoFromDatabase		//class to get data from database
{
	public ArrayList<setObjects> GetData() throws Exception			//return database object
	{
		Connection conn=null;
		CallableStatement statement;
		try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college_admission","root","RAut@123");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		
		ArrayList<setObjects> Data = new ArrayList<setObjects>();		//database object to store each row
		try
		{
			statement = conn.prepareCall("{CALL Search()}");
			statement.execute();
  	  		ResultSet rs=statement.getResultSet();
			while(rs.next())
			{
				setObjects setdata=new setObjects();			//store the fetched values in setdata objects
				setdata.setId(rs.getInt(1));
				setdata.setName((rs.getString(2)));
				setdata.setCourse((rs.getString(3)));
				setdata.setDate_of_admission((rs.getString(4)));
				setdata.setAcademic_year(rs.getString(5));
				Data.add(setdata);								//add setdata obect to Arraylist
			}
			
			return Data;							//return arraylist containing Getobject's class objects
		}
		catch(Exception e)
		{
			throw e;
		}
	}
}
