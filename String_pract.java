package day2;

public class String_pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="Ankur";
		int value = name.length();
		System.out.println(value);
		String lstring = name.toLowerCase();
		System.out.println(lstring);
		String ustring = name.toUpperCase();
		System.out.println(ustring);
		String nonTrimString ="    Ankur    ";
		String trimString =nonTrimString.trim();
		System.out.println(nonTrimString);
		//System.out.println(name.substring(3));
		//System.out.println(name.substring(2,5));
		//System.out.println(nonTrimString.trim());
		//System.out.println(name.replace('n', 'q'));
		//System.out.println(name.replace("nkur", "wert"));
		System.out.println(name.startsWith("Ank"));
		System.out.println(name.endsWith("Ankur"));
		System.out.println(name.charAt(1));
		System.out.println(name.indexOf("k"));
		String modifyName="ankunkur";
		System.out.println(modifyName.indexOf("ku", 4));
		System.out.println(modifyName.lastIndexOf("u",2));
		System.out.println(name.equals("Ankur"));
		System.out.println(name.equalsIgnoreCase("ankuR"));

	}

}
