package BASIC;

public class SubStrings {

	public static void main(String[] args) {
		String mail="Tarun@gmail.com";
		
		int legth= mail.length();
		System.out.println(legth);
		
		String BeforeAt=mail.substring(0,mail.indexOf("@"));
		System.out.println(BeforeAt);
		
		String AfterAt=mail.substring(mail.indexOf("@")+1);
		System.out.println(AfterAt);
	}

}
