import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character:");
		String str=s.nextLine();
		s.close();
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		if(ch[0] =='a' || ch[0]=='e' || ch[0]=='i' || ch[0]=='o' || ch[0]=='u') 
			System.out.println("vowel");
		else
			System.out.println("consonant");
		
	}

}
