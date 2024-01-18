/*
 * D. Carreira
 * February 11, 2022
 * Unit 1: Activity 2: Question 5: SimpleEncryption
 * This program will encrypt a message by adding an inputed number to the ascii value of each character. It will also decrypt messages. 
 */
import javax.swing.JOptionPane;
public class SimpleEncryption 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		int rotation= 0;
		int choice = 0;
		String plainText = "";
		String [] options = {"Encrypt", "Decrypt"};
		plainText = JOptionPane.showInputDialog(null, "This program will encrypt or decrypt a phrase using the simple encryption method of rotating the letters.\nPlease enter a phrase.");
		plainText = plainText.toUpperCase();
		rotation = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the rotation amount (1-25)."));
		choice = JOptionPane.showOptionDialog(null, "Would you like to Encrypt or Decrypt a message?","Choice",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null,options,options[0]);
		System.out.println("You entered the rotation value: " + rotation);
		if(choice == 0)
		{
			simpleEncryption(plainText, rotation);
		}
		else
		{
			simpleDecryption(plainText, rotation);
		}//end if
	}//end main()
	public static void simpleEncryption(String plainText, int rotation)
	{
		int asciiValue = 0;
		String cipherText = "";
		System.out.println("The original phrase is: " + plainText);
		for(int i = 0; i < plainText.length(); i++)
		{
			asciiValue = (int)plainText.charAt(i) + rotation;
			if(plainText.charAt(i) == ' ')
			{
				cipherText += plainText.charAt(i);
			}
			else if(asciiValue > (int)'Z')
			{
				cipherText+= (char)(((int)'A'-1) + (asciiValue - (int)'Z'));
			}
			else
			{
				cipherText += (char)(asciiValue);
			}//end if
		}//end loop
		System.out.println("The encypted phrase is: " + cipherText);
	}//end simpleEncryption()
	public static void simpleDecryption(String plainText, int rotation)
	{
		int asciiValue = 0;
		String originalText = "";
		System.out.println("The encrypted phrase is: " + plainText);
		for(int i = 0; i < plainText.length(); i++)
		{
			asciiValue = (int)plainText.charAt(i) - rotation;
			if(plainText.charAt(i) == ' ')
			{
				originalText += plainText.charAt(i);
			}
			else if(asciiValue < (int)'A')
			{
				originalText+= (char)(((int)'Z'+1) - ((int)'A' - asciiValue));
			}
			else
			{
				originalText += (char)(asciiValue);
			}//end if
		}//end loop
		System.out.println("The original phrase is: " + originalText);
	}//end simpleDecryption()
}//end class()