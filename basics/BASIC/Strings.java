package BASIC;

public class Strings {

	public static void main(String[] args) {
		String name="Tarun Krishna";

		int length=name.length();
		System.out.println(length);

		char Letter=name.charAt(2);
		System.out.println(Letter);
		
		int Index=name.indexOf("n");
		System.out.println(Index);
		
		int LastIndex=name.lastIndexOf("n");
		System.out.println(LastIndex);
		
		
		
		String trim=name.trim();
		System.out.println(trim);

		String Lowercase=name.toLowerCase();
		System.out.println(Lowercase);
		
		String UpperCase=name.toUpperCase();
		System.out.println(UpperCase);
		
		String rename=name.replace("n", "m");
		System.out.println(rename);
	}

}
