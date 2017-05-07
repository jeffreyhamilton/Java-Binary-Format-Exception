import java.util.Scanner;

public class Project12_9 {
	
	public static void main(String[] args) throws BinaryFormatException
	{
		
		Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter a binary number: ");
		 
		 //SENDS BINARY STRING TO bin2Dec METHOD
		 String binaryString =input.nextLine();
		 int decimal = bin2Dec(binaryString);
		System.out.println(decimal);
	}
	

public static int bin2Dec(String binaryString) throws BinaryFormatException
	{
	
	//CHECKS EACH CHARACTER TO SEE IF THEY ARE NOT A 1 OR 0 THEN THROWS IF NOT
		for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);

            if (ch != '0' && ch != '1') 
                throw new BinaryFormatException("Not a binary number: " + ch);
          
        }
		
		//IF ALL CHARACTERS CHECK OK THEY ARE CONVERTED TO DECIMAL AND SENT BACK TO MAIN
		int binDec = Integer.parseInt(binaryString,2);
		return binDec;
	}

//CUSTOM EXCEPTION DEFINED
static class BinaryFormatException extends Exception 
{
	BinaryFormatException()
	{
		super("Not a binary number.");
	}
	BinaryFormatException(String message)
	{
		super(message);
	}
	
}

}
