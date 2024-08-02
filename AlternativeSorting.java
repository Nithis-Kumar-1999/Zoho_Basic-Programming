package zohointerviewpreparation;
import java.util.Scanner; 

public class AlternativeSorting 
{
  public static void main(String[] args) 
  {
	int i,N,temp,pos,ind;
    Scanner scn = new Scanner(System.in);  
    System.out.print("Enter the number of elements you want to store : ");   
    N = scn.nextInt();
    int[] arr = new int[N];  
    System.out.println("Enter the elements of the array : ");  
    for(ind = 0; ind< N; ind++)  
    {  
      arr[ind] = scn.nextInt();  
    } 
    
    for(pos = 0; pos < N; pos += 2)
	  {
		  temp = arr[N-1];
		  for(ind = N-1;ind > pos;ind--)
		  {
			  arr[ind] = arr[ind - 1];
		  }
		  arr[pos] = temp;
	  }
    for(ind = 0; ind < N; ind++)  
    {
        System.out.print(arr[ind] + " ");
    }
  }  
}
