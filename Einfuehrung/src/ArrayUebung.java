import java.util.ArrayList;
import java.util.List;

public class ArrayUebung {

	static List<String> wochentage = new ArrayList<String>();
	static List<String> monate = new ArrayList<String>();
	static List<Integer> tage = new ArrayList<Integer>();


	
	
	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
		Monate();
		Tage();
		mTage();
		}
		
	public static void Wochentage()
	{
		
			wochentage.add("Montag");
			wochentage.add("Dienstag");
			wochentage.add("Mittwoch");
			wochentage.add("Donnerstag");
			wochentage.add("Freitag");
			wochentage.add("Samstag");
			wochentage.add("Sonntag");
			
			System.out.println(wochentage);
		
	}
		public static void nichtfreitag()
		{
			
       wochentage.set(4, "nochnichtfreitag");
	
}
		public static void Monate()
		{
			monate.add("Januar");
			monate.add("Februar");
			monate.add("März");
			monate.add("April");
			monate.add("Mai");
			monate.add("Juni");
			monate.add("Juli");
			monate.add("August");
			monate.add("September");
			monate.add("Oktober");
			monate.add("November");
			monate.add("Dezember");
			System.out.println(monate.get(1));
		}
public static void Tage()
{
	
tage.add(31);
tage.add(28);
tage.add(31);
tage.add(30);
tage.add(31);
tage.add(30);
tage.add(31);
tage.add(31);
tage.add(30);
tage.add(31);
tage.add(30);
tage.add(31);

System.out.println(tage.get(1));
}

public static void mTage()
{
	
	for(int i = 0; i<monate.size();i++)
	{
		System.out.println("Der Monat " + monate.get(i) + " hat genau " + tage.get(i) + " Tage!");
	}

	}
	




}

 
		
		
	

	
