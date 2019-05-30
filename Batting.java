import java.util.Scanner;
public class Batting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of runs ,innings played and no of times not out:");
		int run=s.nextInt();
		int innings=s.nextInt();
		int notout=s.nextInt();
		s.close();
		double avg=(run/(innings-notout));
		System.out.println("batting average is  :"+avg);
	}

}
