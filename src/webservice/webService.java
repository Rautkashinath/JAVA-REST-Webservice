package webservice;

	import java.util.ArrayList;

	import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.Produces;
	import com.google.gson.Gson;

/**
 * @author Kashinath.Raut
 *
 */
	@Path("/webservice")   //URI
	public class webService 
	{
		@GET
		@Path("/studentdata")				//url to call service:URI/studentdata
		@Produces("application/json")	//produces data in JSON format
		public String data()
		{
			String JSONData = null;	
			try 
			{
				ArrayList<setObjects> Data = null;		//array list of data to be returned from database
				getInfoFromDatabase info= new getInfoFromDatabase();							
				Data = info.GetData();					//get data from database
				Gson gson = new Gson();
				JSONData = gson.toJson(Data);			//convert database result to JSON format
			}

			catch (Exception e)
			{
				System.out.println("Exception Error"); //Console 
			}
			return JSONData;//return JSON to client
		}
	}

