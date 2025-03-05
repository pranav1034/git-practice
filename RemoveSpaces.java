import java.util.*;

public class RemoveSpaces {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println("Before removing spaces: "+ s);
	System.out.println("After removing spaces: "+ s.trim());

	//Between spaces
	String s2=sc.nextLine();
	System.out.println("Before removing spaces: "+s2);
	String s3=s2.replaceAll("  "," ");
	System.out.println("After removing spaces: " + s3);
	}
}
