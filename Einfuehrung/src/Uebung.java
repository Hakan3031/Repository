public class Uebung  
{
  static String beliebigerString ;
  static int eineZahl ;
  static int nochEineZahl ;
  static int ergebnis ;
  static float eineZahlMitKomma;
  static int nocheineandereZahl;
  static int Ende = 100;
  static int keineahnung;
  static int nocheinende = 500;
  static int cooleZahl = 1;
  static int cooli = 1;
	static int a;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	fibonacci();
	}

    public  static void rechenspiele()
    {
    	 ergebnis = eineZahl * nochEineZahl;
    	  
  
 
    }
        public static void komma() 
        {
		if(eineZahlMitKomma < ergebnis)
		{
        System.out.print(ergebnis - eineZahlMitKomma);
        
		}
		else
		{
		System.out.print("Das Ergebnis ist zu klein");
		}
		}

        public static void ungerade()
        {
        	if(nocheineandereZahl%2 == 1)
        		
        	
        	{
        		if(nocheineandereZahl<Ende)
        		{
        			System.out.print(ergebnis);
        		}
            }
        		
        }
        
       public static void fibonacci()
       {
      
    	   while (cooli-cooleZahl<nocheinende)      
    	   {
    		   a = cooli;
    		   cooli = cooli + cooleZahl;
    		   cooleZahl = a;
    		   System.out.println(cooli);
    	   }	  
       
       }


}


