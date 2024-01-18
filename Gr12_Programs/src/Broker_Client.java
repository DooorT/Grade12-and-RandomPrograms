import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
@SuppressWarnings("unused")
public class Broker_Client 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		int retry = 0;
		Object[] options = {"Print All Brokers", "Broker Options", "Add Broker"};
		Object selectionObject = null;
		String selectionString = null;
		ArrayList<Realtor> realtors = new ArrayList<Realtor>();
		ArrayList<Listing> listings = new ArrayList<Listing>();
		ArrayList<Broker> brokers = new ArrayList<Broker>();
		Broker PropertyBrothers = new Broker("Property Brothers LTD.", "3455 Yonge Street", "416-218-0335", listings, realtors);
		Broker ScamArtists = new Broker("Scam Artists Inc.", "456 Queen Street", "905-532-0241");
		brokers.add(PropertyBrothers);
		brokers.add(ScamArtists);
		Listing house1 = new Listing("2354", "123 ThatRoad", 234000, 2000, 7, 2, false);
		Listing house2 = new Listing("Franz Ferdinand", "4838", "775 Steeles Ave W", 320900, 3500, 9, 3, true);
		Listing house3 = new Listing();
		Listing house4 = new Listing("Walter White", "1335", "308 Negra Arroyo Lane", 154000, 1500, 5, 2, true);
		Realtor Quandale = new Realtor("Quandale Dingle", "123-456-7890", "dingleton123@yahoo.com", "Albuquerque");
		Realtor Unknown = new Realtor();
		listings.add(house1);
		listings.add(house2);
		listings.add(house3);
		listings.add(house4);
		realtors.add(Quandale);
		realtors.add(Unknown);
		ScamArtists.addListing(house2);
		ScamArtists.addListing(house4);
		do
		{
			selectionObject = JOptionPane.showInputDialog(null, "Which function would you like to perform?", "User Menu", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			selectionString = selectionObject.toString();
			if(selectionString.equals("Print All Brokers"))
			{
				System.out.println("Printing All Broker Information...\n");
				for(int i = 0; i < brokers.size(); i++)
				{
					System.out.println(brokers.get(i));
				}//end loop
			}
			else if(selectionString.equals("Broker Options"))
			{
				brokerOptions(brokers, brokerChoice(brokers));
			}
			else if(selectionString.equals("Add Broker"))
			{
				System.out.println("Creating new Broker...");
				addBroker(brokers);
			}
			
			retry = JOptionPane.showConfirmDialog(null, "Would you like to perform another function?", "Retry?", JOptionPane.YES_NO_OPTION);
		}while(retry == JOptionPane.YES_OPTION);
	}//end main()
	public static Broker brokerChoice(ArrayList<Broker> brokers)
	{
		Object[] options = new Object[brokers.size()];
		Object selectionObject = null;
		String selectionString = null;
		for(int i = 0; i < brokers.size(); i++)
		{
			options[i] = brokers.get(i).getName();
		}//end loop
		selectionObject = JOptionPane.showInputDialog(null, "Please chooose a Broker", "Brokers", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		selectionString = selectionObject.toString();
		for(int i = 0; i < brokers.size(); i++)
		{
			if(selectionString == brokers.get(i).getName())
			{
				return brokers.get(i);
			}
		}//end loop
		return brokers.get(0);
	}//end brokerOptions()
	public static void brokerOptions(ArrayList<Broker> brokerArray, Broker broker)
	{
		Object[] options = {"Print Info", "Print Listings", "Print Realtors", "Add Listing", "Add Realtor", "Add Broker"};
		Object selectionObject = null;
		String selectionString = null;
		selectionObject = JOptionPane.showInputDialog(null, "Please choose a function.", "Broker Options", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		selectionString = selectionObject.toString();
		if(selectionString.equals("Print Info"))
		{
			System.out.println(broker);
		}
		else if(selectionString.equals("Print Listings"))
		{
			System.out.println(broker.printListings());
		}
		else if(selectionString.equals("Print Realtors"))
		{
			System.out.println(broker.printRealtors());
		}//end if
		else if(selectionString.equals("Add Listing"))
		{
			System.out.println("Creating new listing in " + broker.getName() + "...");
			broker.addListing();
		}//end if
		else if(selectionString.equals("Add Realtor"))
		{
			System.out.println("Creating new realtor in " + broker.getName() + "...");
			broker.addRealtor();
		}//end if
		else
		{
			JOptionPane.showMessageDialog(null,"Something went wrong, Please try again.","Retry",0);
			brokerOptions(brokerArray, broker);
		}//end if
	}//end brokerOptions()
	public static String[] convert(ArrayList<Broker> reservations)
	{
		String[] array = new String[reservations.size()];
		for(int i = 0; i < reservations.size(); i++)
		{
			array[i] = reservations.get(i).getName();
		}
		return array;
	}
	public static void printAray(String[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	public static void addBroker(ArrayList<Broker> brokers)
	{
		String name = JOptionPane.showInputDialog(null, "What is the broker's name?", "Name", JOptionPane.QUESTION_MESSAGE);
		String address = JOptionPane.showInputDialog(null, "What is the address of the broker?", "Address", JOptionPane.QUESTION_MESSAGE);
		String phoneNum = JOptionPane.showInputDialog(null, "What is the broker's phone number?", "Phone Number", JOptionPane.QUESTION_MESSAGE);
		brokers.add(new Broker(name, address, phoneNum));
	}//end addBroker()
}//end class