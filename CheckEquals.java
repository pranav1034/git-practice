import java.util.*;

public class CheckEquals {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String s1 = "hi";
	String s2 = "hi";
	String s3 = new String("hi");
	String s4 = new String("hi");
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2);
	System.out.println(s1.equals(s3));
	System.out.println(s1==s3);
	System.out.println(s3.equals(s4));
	System.out.println(s3==s4);
	}
}
