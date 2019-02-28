import java.util.ArrayList;
import java.util.List;

public class passwortchecker {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zuCharArray("fsadoi.,");
	}
public static void zuCharArray(String test)
{
	char[] charArray = test.toCharArray();
	
	
	for(int i = 0;i < charArray.length;i++)
	
	{
	//System.out.println(charArray[i]);

if(charArray.length >= 8)
{
	System.out.println("true");


if (Character.isUpperCase(charArray[i]))
		{
			System.out.println("true");
			

		
	if(Character.isDigit(charArray[i]))
			{ 
		System.out.println("true");

			} 
			
			if(!Character.isLetterOrDigit(charArray[i]))
			{
				System.out.println("true");

			
			}
			if(Character.isLowerCase(charArray[i]))

			{
				
				System.out.println("true");
	
			}
		

				
			
			
		}	

	}

}
}
}
		
	









