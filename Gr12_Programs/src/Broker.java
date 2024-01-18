import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Broker 
{
	private String name;
	private String address;
	private String phoneNumber;
	private ArrayList<Listing> listings;
	private ArrayList<Realtor> realtors;
	public Broker()
	{
		name = "unknown";
		address = "unknown";
		phoneNumber = "unknown";
		listings = new ArrayList<Listing>();
		realtors = new ArrayList<Realtor>();
	}//end Default Constructor
	public Broker(String name, String address, String phoneNumber, ArrayList<Listing> listings, ArrayList<Realtor> realtors)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.listings = listings;
		this.realtors = realtors;
	}//end Regular Constructor
	public Broker(String name, String address, String phoneNumber)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.listings = new ArrayList<Listing>();
		this.realtors = new ArrayList<Realtor>();
	}//end Regular Constructor 2
	public void setName(String name)
	{
		this.name = name;
	}//end setName()
	public void setAddress(String address)
	{
		this.address = address;
	}//end setAddress()
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}//end setPhoneNumber()
	public void setListings(ArrayList<Listing> listings)
	{
		this.listings = listings;
	}//end setListings()
	public void setRealtors(ArrayList<Realtor> realtors)
	{
		this.realtors = realtors;
	}//end setRealtors
	public String getName()
	{
		return name;
	}//end getName()
	public String getAddress()
	{
		return address;
	}//end getAddress()
	public String getPhoneNumber()
	{
		return phoneNumber;
	}//end getPhoneNumber()
	public ArrayList<Listing> getListings()
	{
		return listings;
	}//end getListings()
	public ArrayList<Realtor> getRealtors()
	{
		return realtors;
	}//end getRealtors()
	public String printListings()
	{
		String list = "";
		for(int i = 0; i < listings.size(); i++)
		{
			list += (listings.get(i) + "\n");
		}//end loop
		return list;
	}//end printListings()
	public String printRealtors()
	{
		String list = "";
		for(int i = 0; i < realtors.size(); i++)
		{
			list+= (realtors.get(i) + "\n");
		}//end loop
		return list;
	}//end printRealtors()
	public void addListing(Listing newListing)
	{
		listings.add(newListing);
	}//end addListing
	public void addListing()
	{
		String listingNum = JOptionPane.showInputDialog(null, "What is the listing number?", "Listing Number", JOptionPane.QUESTION_MESSAGE);;
		String owner = JOptionPane.showInputDialog(null, "What is the owner's name? Type \"Unknown\" if there is no owner.", "Owner", JOptionPane.QUESTION_MESSAGE);
		String address = JOptionPane.showInputDialog(null, "What is the address?", "Address", JOptionPane.QUESTION_MESSAGE);
		double price = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the price?", "Price", JOptionPane.QUESTION_MESSAGE));
		double area = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the area?", "Area", JOptionPane.QUESTION_MESSAGE));
		int rooms = Integer.parseInt(JOptionPane.showInputDialog(null, "How many rooms?", "Rooms", JOptionPane.QUESTION_MESSAGE));
		int bathrooms = Integer.parseInt(JOptionPane.showInputDialog(null, "How many bathrooms?", "Bathrooms", JOptionPane.QUESTION_MESSAGE));
		boolean sold = JOptionPane.showConfirmDialog(null, "Is the listing sold?", "Sold", JOptionPane.YES_NO_OPTION) == 0;
		listings.add(new Listing(owner, listingNum, address, price, area, rooms, bathrooms, sold));
	}//end addListing()
	public void removeListing(Listing remListing)
	{
		listings.remove(remListing);
	}//end removeListing()
	public void addRealtor(Realtor newRealtor)
	{
		realtors.add(newRealtor);
	}//end addRealtor()
	public void addRealtor()
	{
		String name = JOptionPane.showInputDialog(null, "What is the realtor's name?", "Name", JOptionPane.QUESTION_MESSAGE);;
		String phoneNum = JOptionPane.showInputDialog(null, "What is the realtor's phone number?", "Phone Number", JOptionPane.QUESTION_MESSAGE);
		String email = JOptionPane.showInputDialog(null, "What is the realtor's email address?", "Email Address", JOptionPane.QUESTION_MESSAGE);
		String supportArea = JOptionPane.showInputDialog(null, "What is the realtor's supportArea?", "Support Area", JOptionPane.QUESTION_MESSAGE);
		realtors.add(new Realtor(name, phoneNum, email, supportArea));
	}//end addRealtor()
	public void removeRealtor(Realtor remRealtor)
	{
		realtors.remove(remRealtor);
	}//end removeRealtor()
	public String toString()
	{
		return "Name: " + name +
			   "\nAddress: " + address +
			   "\nPhone Number: " + phoneNumber + "\n";
	}//end toString()
}//end class