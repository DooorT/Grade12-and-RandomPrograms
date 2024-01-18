public class Date 
{
	private int month;
	private int day;
	private int year;
	public Date()
	{
		month = 1;
		day = 1;
		year = 2022;
	}//end Default Constructor
	public Date(int month, int day, int year)
	{
		this.month=month;
		this.day=day;
		this.year=year;
	}//end Regular Constructor
	public void setMonth(int month)
	{
		this.month = month;
	}//end setMonth()
	public void setDay(int day)
	{
		this.day = day;
	}//end setDay()
	public void setYear(int year)
	{
		this.year = year;
	}//end setYear()
	public int getMonth()
	{
		return month;
	}//end getMonth()
	public int getDay()
	{
		return day;
	}//end getDay()
	public int getYear()
	{
		return year;
	}//end getYear()
	public String month()
	{
		String monthName = "";
		String[] months = {"January", "February", "March", "April", "May", 
				           "June", "July", "August", "September", "October",
				           "November", "December"};
		monthName = months[month-1];
		return monthName;
	}//end month()
	public String toString()
	{
		return month + "/" + day + "/" + year + "\n";
	}//end toString()
}//end class