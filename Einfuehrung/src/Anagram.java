import java.util.Arrays;
public class Anagram {
	static char[] charArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anagram("Hallo","Wiem");
	}

public static void anagram(String wort,String wort2)

{
	charArray = wort.toCharArray();
	wort.toLowerCase();
	System.out.println(wort);

}



}

