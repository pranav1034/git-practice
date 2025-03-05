import java.util.*;

public class AsciiValues {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String s= sc.nextLine();
	System.out.print("Printing ascii values of each character of the string: ");
	for(int i=0;i<s.length();i++){
	    	System.out.println("the character is: "+ s.charAt(i));
		int ascii = s.charAt(i);
		System.out.println("the ascii value of the character is: "+ ascii);
	   }
	}
}
