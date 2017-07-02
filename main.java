import java.util.*;

public class main {

	public static void main(String[] args)


	{

		String key = "ejmin";
		int val;

		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for (int i=0 ; i<key.length() ; i++)

		{
			if( map.containsKey(key.charAt(i))){

				System.out.println("Is not Unique");

			}			

			else {

				map.put(key.charAt(i),1);
			}
		}


	}


}
