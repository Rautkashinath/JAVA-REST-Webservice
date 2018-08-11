/**
 * 
 */
package webservice;
/**
 * @author Kashinath.Raut
 *
 */
public class setObjects 
{
	private String name;
	private String course;
	private String academic_year;
	private String date_of_admission;
	private int Id;
	public int getId()
	{
		return Id;
	}
	public void setId(int id)
	{
		this.Id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCourse() 
	{
		return course;
	}
	public void setCourse(String course)
	{
		this.course = course;
	}
	public String getAcademic_year()
	{
		return academic_year;
	}
	public void setAcademic_year(String academic_year) 
	{
		this.academic_year = academic_year;
	}
	public String getDate_of_admission() 
	{
		return date_of_admission;
	}
	public void setDate_of_admission(String date_of_admission) 
	{
		this.date_of_admission = date_of_admission;
	}
}
