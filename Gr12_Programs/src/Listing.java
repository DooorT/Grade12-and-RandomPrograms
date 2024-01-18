public class Listing 
{
	private int numRooms;
	private int numBathrooms;
	private double price;
	private double area;
	private boolean sold;
	private String address;
	private String listingNum;
	private String ownerName;
	public Listing()
	{
		ownerName = "Unknown";
		listingNum = "Unknown";
		address = "Unknown";
		price = 0;
		area = 0;
		numRooms = 0;
		numBathrooms = 0;
		sold = false;
	}//end Default Constructor
	public Listing(String listingNum, String address, double price, double area, int numRooms, int numBathrooms, boolean sold)
	{
		ownerName = "Unknown";
		this.listingNum = listingNum;
		this.address = address;
		this.price = price;
		this.area = area;
		this.numRooms = numRooms;
		this.numBathrooms = numBathrooms;
		sold = false;
	}//end Regular Constructor
	public Listing(String ownerName, String listingNum, String address, double price, double area, int numRooms, int numBathrooms, boolean sold)
	{
		this.ownerName = ownerName;
		this.listingNum = listingNum;
		this.address = address;
		this.price = price;
		this.area = area;
		this.numRooms = numRooms;
		this.numBathrooms = numBathrooms;
		this.sold = sold;
	}//end Regular Constructor 2
	public void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}//end setOwnerName
	public void setListingNum(String listingNum)
	{
		this.listingNum = listingNum;
	}//end setListingNum
	public void setAddress(String address)
	{
		this.address = address;
	}//end setAddress
	public void setPrice(double price)
	{
		this.price = price;
	}//end setPrice
	public void setArea(double area)
	{
		this.area = area;
	}//end setArea
	public void setNumRooms(int numRooms)
	{
		this.numRooms = numRooms;
	}//end setNumRooms()
	public void setNumBathrooms(int numBathrooms)
	{
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms()
	public void setSold(boolean sold)
	{
		this.sold = sold;
	}//end setSold()
	public String getOwnerName()
	{
		return ownerName;
	}//end getOwnerName
	public String getListingNum()
	{
		return listingNum;
	}//end getListingNum
	public String getAddress()
	{
		return address;
	}//end getAddress
	public double getPrice()
	{
		return price;
	}//end getPrice
	public double getArea()
	{
		return area;
	}//end getArea
	public int getNumRooms()
	{
		return numRooms;
	}//end getNumRooms()
	public int getNumBathrooms()
	{
		return numBathrooms;
	}//end getNumBathrooms()
	public boolean getSold()
	{
		return sold;
	}//end getSold()
	public String toString()
	{
		return "Owner: " + ownerName +
			   "\nListing Number: " + listingNum +
			   "\nAddress: " + address + 
			   "\nPrice: " + price +
			   "\nArea: " + area + 
			   "\nRooms: " + numRooms +
			   "\nBathrooms: "+ numBathrooms +
			   (sold==true?"\nSold\n":"\nFor Sale\n");
	}//end toString
}//end class