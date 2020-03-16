import java.lang.*;
import java.util.*;

public class SelectionSort{
	
	public void swap(int a[], int i, int i1) {
    int tmp = a[i];
    a[i] = a[i1];
    a[i1] = tmp;
	}

	public int min(int S[], int n){
		int i = 0;
		int min = i;
		while(i<n){
			if(S[i]<=S[min]) min=i;
			i++;
		}
		return min;
	}

	public void selectionSort_ip(int S[]){
		int n = S.length;
		int i = 0;
		int i1 = 0;
		int tmp[] = null;
		while(i<n){
			
			tmp = Arrays.copyOfRange(S, i, S.length);
			i1 = i+min(tmp, n-i);
			swap(S, i, i1);
			i++;
		}
				
		System.out.println("Current Time Selection Sort = "+System.currentTimeMillis()+" msec");
	
	}
	
}
