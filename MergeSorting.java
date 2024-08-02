package zohointerviewpreparation;
import java.util.Scanner;

public class MergeSorting 
{
    public static void main(String[] args) 
    {
        int M, N, i, j, ind;
        Scanner scn = new Scanner(System.in);

        M = scn.nextInt();
        N = scn.nextInt();
        
        int[] a = new int[M];
        int[] b = new int[N];
        int[] c = new int[M + N]; 
        
        for (i = 0; i < M; i++)
        {
            a[i] = scn.nextInt();
        }

        for (i = 0; i < N; i++) 
        {
            b[i] = scn.nextInt();
        }

        bubbleSort(a);
        bubbleSort(b);

        i = 0;
        j = 0;
        ind = 0;

        while (i < M && j < N) 
        {
            if (a[i] < b[j])
            {
                if (ind == 0 || c[ind - 1] != a[i])
                {
                    c[ind++] = a[i];
                }
                i++;
            } 
            else if (b[j] < a[i]) 
            {
                if (ind == 0 || c[ind - 1] != b[j]) 
                {
                    c[ind++] = b[j];
                }
                j++;
            } 
            else 
            {
                if (ind == 0 || c[ind - 1] != a[i]) 
                {
                    c[ind++] = a[i];
                }
                i++;
                j++;
            }
        }

        while (i < M)
        {
            if (ind == 0 || c[ind - 1] != a[i])
            {
                c[ind++] = a[i];
            }
            i++;
        }

        while (j < N)
        {
            if (ind == 0 || c[ind - 1] != b[j])
            {
                c[ind++] = b[j];
            }
            j++;
        }

        for (i = 0; i < ind; i++) 
        {
            System.out.print(c[i] + " ");
        }
    }

    private static void bubbleSort(int[] array) 
    {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) 
        {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; 
        }
    }
}
