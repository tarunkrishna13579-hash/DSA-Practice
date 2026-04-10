package FrequencyOfLetters;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		
		s=sc.nextLine();
		
		int[] freq=new int[26];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			 if (ch >= 'a' && ch <= 'z') {
	                freq[ch - 'a']++;
	            }
		}
		
		for(int i=0;i<26;i++) {
			if(freq[i]>0) {	//when letter is present >0.
				char ch=(char)(i+'a');  //from ascii_value to again character
				System.out.println(ch+" "+freq[i]);
			}
		}

	}

}
