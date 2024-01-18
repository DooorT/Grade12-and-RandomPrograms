public class Realtor 
{
	private String name; 
	private String phoneNum;
	private String email;
	private String supportArea;
	public Realtor(String name, String phoneNum, String email, String supportArea)
	{
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.supportArea = supportArea;
	}//end Constructor
	public Realtor()
	{
		name = "Unknown";
		phoneNum = "N/A";
		email = "N/A";
		supportArea = "N/A";
	}//end Default Constructor
	public String getName()
	{
		return name;
	}//end getName()
	public String getPhoneNum()
	{
		return phoneNum;
	}//ends getPhoneNum()
	public String getEmail()
	{
		return email;
	}//end getEmail()
	public String getSupportArea()
	{
		return supportArea;
	}//end getSupportArea()
	public void setName(String name)
	{
		this.name = name;
	}//end setName()
	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}//ends setPhoneNum()
	public void setEmail(String email)
	{
		this.email = email;
	}//end setEmail()
	public void setSupportArea(String supportArea)
	{
		this.supportArea = supportArea;
	}//end setSupportArea()
	public String toString()
	{
		return 	"Name: " + name +
				"\nPhone Number: " + phoneNum +
				"\nEmail: " + email +
				"\nSupport Area: " + supportArea + "\n";
	}//end toString()
}//end class
