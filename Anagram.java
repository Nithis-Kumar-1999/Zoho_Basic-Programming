package zohointerviewpreparation;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
  public static void main(String[] args) 
  {
	Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
	String str2 = scn.nextLine();
	str = str.toLowerCase();
	str2 = str2.toLowerCase();
	 if(str.length()==str2.length())
	 {
		 char ch[]=str.toCharArray();
		 char ch2[]=str2.toCharArray();
		 Arrays.sort(ch);
		 Arrays.sort(ch2);
		 boolean result = Arrays.equals(ch, ch2);
		 if(result)	
		 {
			 System.out.println("These Strings are anagram");
		 }
		 else
		 {
			 System.out.println("Not an anagram");
		 }
	 }
   }
}
	 