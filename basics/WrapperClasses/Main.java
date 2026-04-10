package WrapperClasses;

public class Main {

	public static void main(String[] args) {
		
		//Integer to String
		String s=Integer.toString(20);
		System.out.println(s);
		
		//CharAt()
		String st="Tarun";
		System.out.println(st.charAt(3));
		
		//parseint()
		String hel="250";
		System.out.println(Integer.parseInt(hel));
		
		//isLetter()
		char ch='a';
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isLowerCase(ch));
		System.out.println(Character.isUpperCase(ch));
		
		//isDigit()
		char n='2';
		System.out.println(Character.isDigit(n));
		
	}

}
