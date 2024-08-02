package zohointerviewpreparation;
import java.util.Scanner;
public class Xpattern 
{
  static void pattern(String str)
  {
	  int length = str.length();
	  for(int i=0;i<length;i++)
	  {
		  int j=length-1-i;
		  for(int k=0;k<length;k++)
		  {
			  if(k==i||k==j)
			  {
				  System.out.print(str.charAt(k));
			  }
			  else
				  System.out.print(" ");
		  }
		  System.out.println();
	  }
  }
  public static void main(String[] args) 
  {
	Scanner scn = new Scanner(System.in);
	String str = scn.nextLine();
	pattern(str);
  }
}
