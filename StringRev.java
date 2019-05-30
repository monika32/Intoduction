import java.util.Scanner;
public class StringRev {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String str=s.nextLine();
		s.close();
		char[] a=str.toCharArray();
		 for (int i = a.length-1; i>=0; i--) { 
	            System.out.print(a[i]); 
	        } 
	}

}
