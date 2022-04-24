public class Student
{
	private int mat;
	private String name;
	
	public Student()
	{
		mat = 0;
		name = null;
	}
	
	public Student(int newMat, String newName)
	{
		mat = newMat;
		name = newName;
	}
	
	public int getMat()
	{
		return mat;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
}