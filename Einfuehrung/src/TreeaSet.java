import java.util.TreeSet;

public class TreeaSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> TreeaSet = new TreeSet<Integer>();

for(int i=0; i<100; i++)
	TreeaSet.add((int) (Math.random() * 75));

System.out.println("Menge der Elemente "+TreeaSet.size());

for(Integer i : TreeaSet) {
	System.out.print(i);
}
	}

}
