/*
 * D. Carreira
 * May 31, 2022
 * - We will read files containing object variables &
 * create objects dynamically.
 */
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.io.FileReader;
@SuppressWarnings("unused")
public class S_File_Reading_2 
{
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		/** Need a variable to read in a line from the file **/
		String line = "";
		//Create temp strings to store the object variables
		String brand = "", model = "", colour = "";
		//need a temp array to store the comma-seperated words in a line
		String[] values;
		//Create an ArrayList<> to store the Car objects that will be created
		//dynamically
		ArrayList<Car> cars = new ArrayList<>();
		//Create a try catch to ensure we handle file reading exeptions elegantly
		try
		{
			//Read the data
			@SuppressWarnings("resource")
			BufferedReader input = new BufferedReader(new FileReader("cars.txt"));
			//read the file as long as there are lines to read
			while((line = input.readLine()) != null)
			{
				//split the words via commas
				values = line.split(",");
				brand = values[0];
				model = values[1];
				colour = values[2];
			}//end loop for file lines
			//print the Car objects in the AL<>
			printArray(cars);
		}
		catch(Exception e)
		{
			//Print the error
			e.printStackTrace();
		}
	}//end main()
	public static void printArray(ArrayList<Car> array)
	{
		for(int i = 0; i < array.size(); i++)
		{
			System.out.println(array.get(i));
		}//end loop
	}//end printArray()
}//end class